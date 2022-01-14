package Presentacion;

import Negocio.Cliente;
import Negocio.DetalleVenta;
import Negocio.NotaVenta;
import Negocio.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVenta extends javax.swing.JFrame {

    Cliente cl = new Cliente();
    NotaVenta nv = new NotaVenta();
    ArrayList<DetalleVenta> dvs = new ArrayList<>();

    public frmVenta() {
        initComponents();
        this.setLocationRelativeTo(null);

        Calendar fecha = new GregorianCalendar();
        String fechaDeHoy = String.valueOf(fecha.get(Calendar.YEAR)) + "-" + String.valueOf(fecha.get(Calendar.MONTH) + 1) + "-" + String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
        txtFecha.setText(fechaDeHoy);
        nv.setFecha(fechaDeHoy);
    }

    public frmVenta(Cliente c, ArrayList<DetalleVenta> dvs) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.cl = c;
        txtNombre.setText(cl.getCodigo() + " - " + cl.getNombre());
        txtNombre.setEditable(false);

        this.dvs = dvs;

        Calendar fecha = new GregorianCalendar();
        String fechaDeHoy = String.valueOf(fecha.get(Calendar.YEAR)) + "-" + String.valueOf(fecha.get(Calendar.MONTH) + 1) + "-" + String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
        txtFecha.setText(fechaDeHoy);
        nv.setFecha(fechaDeHoy);

        mostrarCarrito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbVentas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha:");

        txtFecha.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("REGISTRO DE VENTAS");

        jtbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre", "Cantidad", "Precio", "Subtotal"
            }
        ));
        jtbVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbVentasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtbVentas);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnDevolver.setText("Quitar del carrito");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);

        jLabel11.setText("Total:");

        jLabel4.setText("Cliente:");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Producto:");

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(97, 97, 97)
                                .addComponent(btnVolver))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDevolver)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDevolver)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarCarrito() {
        float total = 0;
        String[] nombreColumnas = new String[]{"ID Producto", "Descripcion", "Cantidad", "Precio", "Subtotal"};
        Object[][] data = new Object[25][5];
        int i = 0;
        for (DetalleVenta dv : dvs) {
            Producto p = new Producto();
            float precio = p.obtenerPrecioPorId(String.valueOf(dv.getIdProducto()));
            dv.setPrecioV(precio * dv.getCantidad());
            data[i][0] = dv.getIdProducto();
            data[i][1] = p.obtenerDescripcionPorId(String.valueOf(dv.getIdProducto()));
            data[i][2] = dv.getCantidad();
            data[i][3] = p.obtenerPrecioPorId(String.valueOf(dv.getIdProducto()));
            data[i][4] = dv.getPrecioV();
            total += dv.getPrecioV();
            i++;
        }
        DefaultTableModel tabla = new DefaultTableModel(data, nombreColumnas);
        jtbVentas.setModel(tabla);
        txtTotal.setText(String.valueOf(total));
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmSistema frm = new frmSistema();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        cl.setNombre(txtNombre.getText());
        this.setVisible(false);
        frmBuscarCliente frm = new frmBuscarCliente(cl, dvs);
        frm.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        String b = txtProducto.getText();
        this.setVisible(false);
        frmBuscarProducto frm = new frmBuscarProducto(cl, dvs, b);
        frm.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        int fila = jtbVentas.getSelectedRow();
        dvs.remove(fila);
        mostrarCarrito();
    }//GEN-LAST:event_btnDevolverActionPerformed

    public boolean cantidadesLlenas() {
        for (DetalleVenta dv : dvs) {
            if (dv.getCantidad() <= 0) {
                JOptionPane.showMessageDialog(null, "Ingresar la cantidad para el producto con id: " + dv.getIdProducto());
                return false;
            }
        }
        return true;
    }
    
    public boolean stockSuficiente() {
        for (DetalleVenta dv : dvs) {
            Producto p = new Producto();
            int stock = p.obtenerStockPorId(String.valueOf(dv.getIdProducto()));
            if (dv.getCantidad() > stock) {
                JOptionPane.showMessageDialog(null, "No hay stock suficiente para el producto con el id: " + dv.getIdProducto() + "\nStock: " + stock);
                return false;
            }
        }
        return true;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         if (cantidadesLlenas() && stockSuficiente()) {
            nv.setIdCliente(cl.getCodigo());
            nv.setMonto(Float.parseFloat(txtTotal.getText()));
            nv.guardar();
            int idVenta = nv.obtenerUltimoId();
            for (DetalleVenta dv : dvs) {
                dv.setIdVenta(idVenta);
                dv.guardar();
                dv.disminuirStock();
            }
            JOptionPane.showMessageDialog(null, "Venta registrada exitosamente");
            btnVolverActionPerformed(evt);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtbVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbVentasKeyReleased
        int i = 0;
        for (DetalleVenta dv : dvs) {
            Producto p = new Producto();
            int cant = Integer.parseInt(String.valueOf(jtbVentas.getValueAt(i, 2)));
            dv.setCantidad(cant);          
            float precio = p.obtenerPrecioPorId(String.valueOf(dv.getIdProducto()));
            dv.setPrecioV(precio * dv.getCantidad());
            i++;
        }
        mostrarCarrito();
    }//GEN-LAST:event_jtbVentasKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbVentas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
