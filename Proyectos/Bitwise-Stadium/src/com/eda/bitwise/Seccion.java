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

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Seccion extends DAC {

    int id_seccion;
    String nombre_seccion;
    float precio_asiento;
    int nro_asientos;
    Asientos asientos;

    public Seccion(int id_seccion, String nombre_seccion, float precio_asiento, int nro_asientos) {
        this.id_seccion = id_seccion;
        this.nombre_seccion = nombre_seccion;
        this.precio_asiento = precio_asiento;
        this.nro_asientos = nro_asientos;
        this.asientos = new Asientos(nro_asientos);
    }

    public Seccion() {
        this.asientos = new Asientos(nro_asientos);
    }
    
    public int getIdSeccion() {
        return id_seccion;
    }

    public void setIdSeccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getNombreSeccion() {
        return nombre_seccion;
    }

    public void setNombreSeccion(String nombre_seccion) {
        this.nombre_seccion = nombre_seccion;
    }

    public float getPrecioAsiento() {
        return precio_asiento;
    }

    public void setPrecioAsiento(float precio_asiento) {
        this.precio_asiento = precio_asiento;
    }

    public int getNroAsientos() {
        return nro_asientos;
    }

    public void setNroAsientos(int nro_asientos) {
        this.nro_asientos = nro_asientos;
    }
    
    public Asientos getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos asientos) {
        this.asientos = asientos;
    }

    public void registrar() {
        prepararSP("{call registrar_seccion(?,?,?,?) }");
        addParametro(1, String.valueOf(id_seccion));
        addParametro(2, nombre_seccion);
        addParametro(3, String.valueOf(precio_asiento));
        addParametro(4, String.valueOf(nro_asientos));
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_seccion(?) }");
        addParametro(1, String.valueOf(id_seccion));
        ejecutarSP();

    }

    public void editar() {
        prepararSP("{call editar_seccion(?,?,?,?) }");
        addParametro(1, String.valueOf(id_seccion));
        addParametro(2, nombre_seccion);
        addParametro(3, String.valueOf(precio_asiento));
        addParametro(4, String.valueOf(nro_asientos));
        ejecutarSP();
    }

    public ResultSet mostrar() {
        try {
            ResultSet reg = ejecutarSQL("select * from Secciones");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public List<Seccion> cargarSecciones() {
        try {
            ResultSet reg = ejecutarSQL("select * from Secciones");
            List<Seccion> secciones = new ArrayList<>();
            while (reg.next()){
                Seccion seccionAux = new Seccion();
                seccionAux.setIdSeccion(reg.getInt(1));
                seccionAux.setNombreSeccion(reg.getString(2));
                seccionAux.setPrecioAsiento(reg.getFloat(3));
                seccionAux.setNroAsientos(reg.getInt(4));
                seccionAux.setAsientos(new Asientos(seccionAux.getNroAsientos()));
                secciones.add(seccionAux);
            }
            return secciones;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cargarSecciones:Error..!!!" + e.getMessage());
            return null;
        }
    }
}
