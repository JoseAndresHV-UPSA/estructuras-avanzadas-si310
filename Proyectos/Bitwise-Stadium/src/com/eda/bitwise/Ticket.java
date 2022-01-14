package com.eda.bitwise;

import Datos.DAC;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Ticket extends DAC {

    int id_ticket;
    int id_seccion;
    int id_partido;
    int nro_asiento;
    Cliente cliente;

    public Ticket(int id_ticket, int id_seccion, int id_partido, int nro_asiento) {
        this.id_ticket = id_ticket;
        this.id_seccion = id_seccion;
        this.id_partido = id_partido;
        this.nro_asiento = nro_asiento;
    }

    public Ticket(int id_ticket, int id_seccion, int id_partido, int nro_asiento, Cliente cliente) {
        this.id_ticket = id_ticket;
        this.id_seccion = id_seccion;
        this.id_partido = id_partido;
        this.nro_asiento = nro_asiento;
        this.cliente = cliente;
    }

    public Ticket(int id_seccion, int id_partido, int nro_asiento) {
        this.id_seccion = id_seccion;
        this.id_partido = id_partido;
        this.nro_asiento = nro_asiento;
    }
    
    public Ticket() {
    }

    public int getIdTicket() {
        return id_ticket;
    }

    public void setIdTicket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getIdSeccion() {
        return id_seccion;
    }

    public void setIdSeccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public int getIdPartido() {
        return id_partido;
    }

    public void setIdPartido(int id_partido) {
        this.id_partido = id_partido;
    }

    public int getNroAsiento() {
        return nro_asiento;
    }

    public void setNroAsiento(int nro_asiento) {
        this.nro_asiento = nro_asiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void registrar() {
        prepararSP("{call registrar_ticket(?,?,?) }");
        addParametro(1, String.valueOf(id_seccion));
        addParametro(2, String.valueOf(id_partido));
        addParametro(3, String.valueOf(nro_asiento));
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_ticket(?) }");
        addParametro(1, String.valueOf(id_ticket));
        ejecutarSP();

    }

    public void editar() {
        prepararSP("{call editar_ticket(?,?,?,?) }");
        addParametro(1, String.valueOf(id_ticket));
        addParametro(2, String.valueOf(id_seccion));
        addParametro(3, String.valueOf(id_partido));
        addParametro(4, String.valueOf(nro_asiento));
        ejecutarSP();
    }

    public Cliente obtenerClientePorTicket(int idTicket){
        try {
            ResultSet ref = ejecutarSQL("select Ventas.ci_cliente, Clientes.nombre_cliente from Ventas \n" +
                                        "inner join Tickets on Tickets.id_ticket = Ventas.id_ticket\n" +
                                        "inner join Clientes on Clientes.ci_cliente = Ventas.ci_cliente\n" +
                                        "where Ventas.id_ticket = " + idTicket);
            Cliente cliente = new Cliente();
            while(ref.next()){
                cliente.setCICliente(ref.getInt(1));
                cliente.setNombre(ref.getString(2));
            }
            return cliente;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }
    
    public ResultSet mostrar() {
        try {
            ResultSet reg = ejecutarSQL("select * from Tickets");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public List<Ticket> cargarTickets() {
        try {
            ResultSet reg = ejecutarSQL("select * from Tickets");
            List<Ticket> tickets = new ArrayList<>();
            while (reg.next()){
                Ticket ticket = new Ticket();
                ticket.setIdTicket(reg.getInt(1));
                ticket.setIdPartido(reg.getInt(2));
                ticket.setIdSeccion(reg.getInt(3));
                ticket.setNroAsiento(reg.getInt(4));
                
                //cargar clientes (pendiente) TODO?
                // CARGAR OBJETO CLIENTE
                Cliente cliente= new Cliente();
                //ticket.obtenerClientePorTicket(id_ticket);
                tickets.add(ticket);
            }
            return tickets;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cargarTickets:Error..!!!" + e.getMessage());
            return null;
        }
    }

}
