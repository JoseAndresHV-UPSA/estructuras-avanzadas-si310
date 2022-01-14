package Negocio;

import Datos.DAC;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DetalleVenta extends DAC{
    int idVenta;
    int idProducto;
    float precioV;
    int cantidad;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta, int idProducto, float precioV, int cantidad) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.precioV = precioV;
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public float getPrecioV() {
        return precioV;
    }

    public void setPrecioV(float precioV) {
        this.precioV = precioV;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void guardar() {
        prepararSP("{call insertar_detalle_venta(?,?,?,?) }");
        addParametro(1, String.valueOf(idVenta));
        addParametro(2, String.valueOf(idProducto));
        addParametro(3, String.valueOf(precioV));
        addParametro(4, String.valueOf(cantidad));
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_detalle_venta(?,?) }");
        addParametro(1, String.valueOf(idVenta));
        addParametro(2, String.valueOf(idProducto));
        ejecutarSP();

    }

    public void modificar() {
        prepararSP("{call modificar_detalle_venta(?,?,?,?) }");
        addParametro(1, String.valueOf(idVenta));
        addParametro(2, String.valueOf(idProducto));
        addParametro(3, String.valueOf(precioV));
        addParametro(4, String.valueOf(cantidad));
        ejecutarSP();
    }
    
    public void disminuirStock() {
        prepararSP("{call disminuir_stock(?,?) }");
        addParametro(1, String.valueOf(idProducto));
        addParametro(2, String.valueOf(cantidad));
        ejecutarSP();
    }

    public ResultSet buscarPorCodigo(String criterio1, String criterio2) {
        try {
            ResultSet reg = ejecutarSQL("select * from detalle_venta where id_venta=" + criterio1 + " and id_producto=" + criterio2);
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public ResultSet mostrar(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select * from detalle_venta");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }
    
}
