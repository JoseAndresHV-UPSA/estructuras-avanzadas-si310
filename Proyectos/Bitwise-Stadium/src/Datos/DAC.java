/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DAC {

    private Connection cnx;
    private CallableStatement cst;

    public Connection conectar() {
        String usuario = "root";
        String clave = "jahv2903";
        String url = "jdbc:mysql://localhost:3306/db_estadio";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx = DriverManager.getConnection(url, usuario, clave);
            return cnx;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conectar:Error al conectar la BD. " + e.getMessage());
            return null;
        }
    }

    public void desconectar() {
        try {
            cnx.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Desconectar:Error al desconectar la BD. " + e.getMessage());
        }
    }

    public void prepararSP(String nombre) {
        try {
            cst = conectar().prepareCall(nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PrepararSP:Debe colocar un nombre al SP..!!!" + e.getMessage());
        }
    }

    public void addParametro(int num, String nombre) {
        try {
            cst.setString(num, nombre);
        } catch (Exception e) {
        }
    }

    public void ejecutarSP() {
        try {
            int r = cst.executeUpdate();
            desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ejecutarSP:Error al ejecutar el SP..!!!" + e.getMessage());
        }
    }

    public ResultSet ejecutarSQL(String sql) {
        try {
            java.sql.Statement stmt = conectar().createStatement();
            ResultSet reg = stmt.executeQuery(sql);
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtenerRegistro:Error..!!!" + e.getMessage());
            return null;
        }
    }

}
