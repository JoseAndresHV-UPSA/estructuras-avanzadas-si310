package Negocio;

import Datos.DAC;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class NotaVenta extends DAC{
    int idVenta;
    String fecha;
    int idCliente;
    float monto;

    public NotaVenta() {
    }

    public NotaVenta(int idVenta, String fecha, int idCliente, float monto) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.monto = monto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    public void guardar() {
        prepararSP("{call insertar_notaventa(?,?,?) }");
        addParametro(1, fecha);
        addParametro(2, String.valueOf(idCliente));
        addParametro(3, String.valueOf(monto));
        ejecutarSP();
    }

    public void eliminar() {
        prepararSP("{call eliminar_notaventa(?) }");
        addParametro(1, String.valueOf(idVenta));
        ejecutarSP();

    }

    public void modificar() {
        prepararSP("{call modificar_notaventa(?,?,?,?) }");
        addParametro(1, String.valueOf(idVenta));
        addParametro(2, fecha);
        addParametro(3, String.valueOf(idCliente));
        addParametro(4, String.valueOf(monto));
        ejecutarSP();
    }

    public ResultSet buscarPorCodigo(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select * from notaventa where id_venta=" + criterio);
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }

    public ResultSet buscarPorCliente(String criterio) {
        try {
            ResultSet reg = ejecutarSQL("select * from notaventa where id_cliente like '" + criterio + "%'");
            return reg;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
            return null;
        }
    }
    
    public int obtenerUltimoId() {
        int id = -1;
        try {
            ResultSet reg = ejecutarSQL("select MAX(id_venta) from notaventa");
            if (reg.next())
                id = reg.getInt(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "obtener Registro:Error..!!!" + e.getMessage());
        }
        return id;
    }
    
}
