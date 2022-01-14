package Negocio;

import Datos.DAC;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Cliente extends DAC {

    int id_cliente;
    String nombre;
    String telefono;
    String direccion;

    public void setCodigo(int c) {
        id_cliente = c;
    }

    public int getCodigo() {
        return id_cliente;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String tel) {
        telefono = tel;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String dir) {
        direccion = dir;
    }

    public String getDireccion() {
        return direccion;
    }

    public void guardar() {
        prepararSP("{call insertar_cliente(?,?,?) }");
        addParametro(1, nombre);
        addParametro(2, telefono);
        addParametro(3, direccion);
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_cliente(?) }");
        addParametro(1, String.valueOf(id_cliente));
        ejecutarSP();

    }

    public void modificar() {
        prepararSP("{call modificar_cliente(?,?,?,?) }");
        addParametro(1, String.valueOf(id_cliente));
        addParametro(2, nombre);
        addParametro(3, telefono);
        addParametro(4, direccion);
        ejecutarSP();
    }

    public ResultSet buscarPorCodigo(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select *from cliente where id_cliente=" + criterio);
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public ResultSet buscarPorNombre(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select * from cliente where nombre like '" + criterio + "%'");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }
    
    
    

}//fin clase

