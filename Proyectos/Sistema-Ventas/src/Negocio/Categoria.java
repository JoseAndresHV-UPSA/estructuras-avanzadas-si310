package Negocio;

import Datos.DAC;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Categoria extends DAC {

    int idCategoria;
    String nombre;

    public Categoria(int idCliente, String nombre) {
        this.idCategoria = idCliente;
        this.nombre = nombre;
    }

    public Categoria() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCliente) {
        this.idCategoria = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void guardar() {
        prepararSP("{call insertar_categoria(?) }");
        addParametro(1, nombre);
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_categoria(?) }");
        addParametro(1, String.valueOf(idCategoria));
        ejecutarSP();

    }

    public void modificar() {
        prepararSP("{call modificar_categoria(?,?) }");
        addParametro(1, String.valueOf(idCategoria));
        addParametro(2, nombre);
        ejecutarSP();
    }

    public ResultSet buscarPorCodigo(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select *from categoria where id_categoria=" + criterio);
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public ResultSet buscarPorNombre(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select *from categoria where nombre like '" + criterio + "%'");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public String[] obtenerCategorias() {
        ArrayList<String> catList = new ArrayList<>();
        try {
            ResultSet reg = ejecutarSQL("select nombre from categoria");
            int i = 0;
            while (reg.next()) {
                catList.add(reg.getString(1));
                i++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }

        String[] catArr = new String[catList.size()];
        catArr = catList.toArray(catArr);
        return catArr;
    }

    public int obtenerIdPorNombre(String criterio) {
        int id = -1;
        try {
            ResultSet reg = ejecutarSQL("select id_categoria from categoria where nombre='" + criterio + "'");
            if (reg.next())
                id = reg.getInt(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
        }
        return id;
    }
    
    public String obtenerNombrePorId(String criterio) {
        String nom = "";
        try {
            ResultSet reg = ejecutarSQL("select nombre from categoria where id_categoria=" + "'" + criterio + "'");
            if (reg.next())
                nom = reg.getString(1);
            return nom;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

}
