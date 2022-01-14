/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eda.bitwise;

import Datos.DAC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Partido extends DAC {

    int id_partido;
    String equipo_local;
    String equipo_visitante;
    String fecha;
    String hora;
    List<Ticket> tickets;

    public Partido(int id_partido, String equipo_local, String equipo_visitante, String fecha, String hora) {
        this.id_partido = id_partido;
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.fecha = fecha;
        this.hora = hora;
        tickets = new ArrayList<>();
    }

    public Partido(String equipo_local, String equipo_visitante, String fecha, String hora) {
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.fecha = fecha;
        this.hora = hora;
        tickets = new ArrayList<>();
    }
    
    public Partido() {
    }

    public int getIdPartido() {
        return id_partido;
    }

    public void setIdPartido(int id_partido) {
        this.id_partido = id_partido;
    }

    public String getEquipoLocal() {
        return equipo_local;
    }

    public void setEquipoLocal(String equipo_local) {
        this.equipo_local = equipo_local;
    }

    public String getEquipoVisitante() {
        return equipo_visitante;
    }

    public void setEquipoVisitante(String equipo_visitante) {
        this.equipo_visitante = equipo_visitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    public void registrar() {
        prepararSP("{call registrar_partido(?,?,?,?) }");
        addParametro(1, equipo_local);
        addParametro(2, equipo_visitante);
        addParametro(3, fecha);
        addParametro(4, hora);
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_partido(?) }");
        addParametro(1, String.valueOf(id_partido));
        ejecutarSP();

    }

    public void editar() {
        prepararSP("{call editar_partido(?,?,?,?,?)}");
        addParametro(1, String.valueOf(id_partido));
        addParametro(2, equipo_local);
        addParametro(3, equipo_visitante);
        addParametro(4, fecha);
        addParametro(5, hora);
        ejecutarSP();
    }

    public ResultSet mostrar() {
        try {
            ResultSet reg = ejecutarSQL("select * from Partidos");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public List<Partido> cargarPartidos() {
        try {
            ResultSet reg = ejecutarSQL("select * from Partidos");
            List<Partido> partidos = new ArrayList<>();
            while (reg.next()){
                Partido partidoAux = new Partido();
                partidoAux.setIdPartido(reg.getInt(1));
                partidoAux.setEquipoLocal(reg.getString(2));
                partidoAux.setEquipoVisitante(reg.getString(3));
                partidoAux.setFecha(reg.getString(4));
                partidoAux.setHora(reg.getString(5));
                
                //cargar tickets (pendiente)
                Ticket ticketAux= new Ticket();
                partidoAux.setTickets(ticketAux.cargarTickets());
                partidos.add(partidoAux);
            }
            return partidos;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cargarPartidos:Error..!!!" + e.getMessage());
            return null;
        } 
    }
}
