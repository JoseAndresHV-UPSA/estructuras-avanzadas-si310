package Negocio;

import Datos.DAC;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Producto extends DAC {
    int idProducto;
    String descripcion;
    float precio;
    int stock;
    int idCategoria;

    public Producto() {
    }

    public Producto(int idProducto, String descripcion, float precio, int stock, int idCategoria) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.idCategoria = idCategoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public void guardar() {
        prepararSP("{call insertar_producto(?,?,?,?)}");
        addParametro(1, descripcion);
        addParametro(2, String.valueOf(precio));
        addParametro(3, String.valueOf(stock));
        addParametro(4, String.valueOf(idCategoria));
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_producto(?) }");
        addParametro(1, String.valueOf(idProducto));
        ejecutarSP();

    }

    public void modificar() {
        prepararSP("{call modificar_producto(?,?,?,?,?) }");
        addParametro(1, String.valueOf(idProducto));
        addParametro(2, descripcion);
        addParametro(3, String.valueOf(precio));
        addParametro(4, String.valueOf(stock));
        addParametro(5, String.valueOf(idCategoria));
        ejecutarSP();
    }

    public ResultSet buscarPorCodigo(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select *from producto where id_producto=" + criterio);
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public ResultSet buscarPorDescripcion(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select *from producto where descripcion like '" + criterio + "%'");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }
    
    public String obtenerDescripcionPorId(String criterio) {
        String des = "";
        try {
            ResultSet reg = ejecutarSQL("select descripcion from producto where id_producto=" + "'" + criterio + "'");
            if (reg.next())
                des = reg.getString(1);
            return des;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }
    
    public float obtenerPrecioPorId(String criterio) {
        float pre = 0;
        try {
            ResultSet reg = ejecutarSQL("select precio from producto where id_producto=" + "'" + criterio + "'");
            if (reg.next())
                pre = reg.getFloat(1);
            return pre;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return 0;
        }
    }
    
    public int obtenerStockPorId(String criterio) {
        int pre = 0;
        try {
            ResultSet reg = ejecutarSQL("select stock from producto where id_producto=" + "'" + criterio + "'");
            if (reg.next())
                pre = reg.getInt(1);
            return pre;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return 0;
        }
    }
    
}
