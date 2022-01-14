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

public class Cliente extends DAC{
    int ci_cliente;
    String nombre;

    public Cliente(int ci_cliente, String nombre) {
        this.ci_cliente = ci_cliente;
        this.nombre = nombre;
    }

    public Cliente(){}
    
    public int getCICliente() {
        return ci_cliente;
    }

    public void setCICliente(int ci_cliente) {
        this.ci_cliente = ci_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void registrar() {
        prepararSP("{call registrar_cliente(?,?) }");
        addParametro(1, String.valueOf(ci_cliente));
        addParametro(2, nombre);
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_cliente(?) }");
        addParametro(1, String.valueOf(ci_cliente));
        ejecutarSP();

    }

    public void editar() {
        prepararSP("{call editar_cliente(?,?)}");
        addParametro(1, String.valueOf(ci_cliente));
        addParametro(2, nombre);
        ejecutarSP();
}
    
    public ResultSet mostrar() {
        try {
            ResultSet reg = ejecutarSQL("select * from Clientes");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public List<Cliente> cargarClientes() {
        try {
            ResultSet reg = ejecutarSQL("select * from Clientes");
            List<Cliente> clientes = new ArrayList<>();
            while (reg.next()){
                Cliente clienteAux = new Cliente();
                clienteAux.setCICliente(reg.getInt(1));
                clienteAux.setNombre(reg.getString(2));
                clientes.add(clienteAux);
            }
            return clientes;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cargarSecciones:Error..!!!" + e.getMessage());
            return null;
        }
    }
}
