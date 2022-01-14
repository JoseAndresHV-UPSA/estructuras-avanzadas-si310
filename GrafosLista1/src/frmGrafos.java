
import javax.swing.*;

public class frmGrafos extends javax.swing.JFrame {
 Grafo G=new Grafo();
    /** Creates new form Formulario */
    public frmGrafos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCargarGrafo = new javax.swing.JToggleButton();
        btnMostrarGrafo = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        btnSumarCosto = new javax.swing.JToggleButton();
        mostrarArcosSalientes = new javax.swing.JButton();
        EliminarAcosSalientes = new javax.swing.JButton();
        EliminarVertice = new javax.swing.JButton();
        EliminarArco = new javax.swing.JToggleButton();
        btnEliminarArcEntrantes = new javax.swing.JButton();
        btnConexo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GRAFOS");

        btnCargarGrafo.setText("Leer Grafo");
        btnCargarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarGrafoActionPerformed(evt);
            }
        });

        btnMostrarGrafo.setText("Imprimir Grafo");
        btnMostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarGrafoActionPerformed(evt);
            }
        });

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane3.setViewportView(ta1);

        btnSumarCosto.setText("peso");
        btnSumarCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarCostoActionPerformed(evt);
            }
        });

        mostrarArcosSalientes.setText("mostrar Arcos Salientes");
        mostrarArcosSalientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarArcosSalientesActionPerformed(evt);
            }
        });

        EliminarAcosSalientes.setText("EliminarArcos Salientes");
        EliminarAcosSalientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAcosSalientesActionPerformed(evt);
            }
        });

        EliminarVertice.setText("eliminar Vertice");
        EliminarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarVerticeActionPerformed(evt);
            }
        });

        EliminarArco.setText("Eliminar Arco");
        EliminarArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarArcoActionPerformed(evt);
            }
        });

        btnEliminarArcEntrantes.setText("Eliminar arcos entrantes");
        btnEliminarArcEntrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarArcEntrantesActionPerformed(evt);
            }
        });

        btnConexo.setText("Es Conexo");
        btnConexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConexoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSumarCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrarArcosSalientes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnCargarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMostrarGrafo))))
                        .addGap(71, 259, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EliminarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EliminarArco, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EliminarAcosSalientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarArcEntrantes)
                                .addGap(18, 18, 18)
                                .addComponent(btnConexo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarGrafo)
                    .addComponent(btnMostrarGrafo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumarCosto)
                    .addComponent(mostrarArcosSalientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EliminarAcosSalientes)
                    .addComponent(btnEliminarArcEntrantes)
                    .addComponent(btnConexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EliminarVertice)
                    .addComponent(EliminarArco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarGrafoActionPerformed
        // TODO add your handling code here:
            G.crearVertice("A");
            G.crearVertice("B");
            G.crearVertice("C");
            G.crearVertice("D");
            G.insertarArco("A", "B", 22);
            G.insertarArco("B", "C", 33);
            G.insertarArco("A", "C", 20);
            G.insertarArco("C", "B", 15);
            G.insertarArco("B", "D", 15);

    }//GEN-LAST:event_btnCargarGrafoActionPerformed

    private void btnMostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarGrafoActionPerformed
        // TODO add your handling code here:
        ta1.setText("");
        G.imprimir(ta1);
    }//GEN-LAST:event_btnMostrarGrafoActionPerformed

    private void btnSumarCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarCostoActionPerformed
        // TODO add your handling code here:
        float x=G.peso();
        JOptionPane.showMessageDialog(rootPane, "El costo del grafo es:" + Float.toString(x) );

    }//GEN-LAST:event_btnSumarCostoActionPerformed

    private void mostrarArcosSalientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarArcosSalientesActionPerformed
        // TODO add your handling code here:
        G.arcosSalientes();
    }//GEN-LAST:event_mostrarArcosSalientesActionPerformed

    private void EliminarAcosSalientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAcosSalientesActionPerformed
        // TODO add your handling code here:
        String A=JOptionPane.showInputDialog("Vertice:");
        G.eliminarArcosSalientes(A);
    }//GEN-LAST:event_EliminarAcosSalientesActionPerformed

    private void EliminarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarVerticeActionPerformed
        // TODO add your handling code here:
        String A=JOptionPane.showInputDialog("Vertice");
        G.eliminarVertice(A);
    }//GEN-LAST:event_EliminarVerticeActionPerformed

    private void EliminarArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarArcoActionPerformed
        // TODO add your handling code here:
        String A=JOptionPane.showInputDialog("Vertice Origen:");
        String B=JOptionPane.showInputDialog("Vertice Destino:");
        G.eliminarArco(A,B);
    }//GEN-LAST:event_EliminarArcoActionPerformed

    private void btnEliminarArcEntrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarArcEntrantesActionPerformed
        // TODO add your handling code here:
        G.eliminarArcosEntrantes(JOptionPane.showInputDialog("Vertice"));
    }//GEN-LAST:event_btnEliminarArcEntrantesActionPerformed

    private void btnConexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConexoActionPerformed
        // TODO add your handling code here:
        G.esConexo();
    }//GEN-LAST:event_btnConexoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGrafos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarAcosSalientes;
    private javax.swing.JToggleButton EliminarArco;
    private javax.swing.JButton EliminarVertice;
    private javax.swing.JToggleButton btnCargarGrafo;
    private javax.swing.JButton btnConexo;
    private javax.swing.JButton btnEliminarArcEntrantes;
    private javax.swing.JToggleButton btnMostrarGrafo;
    private javax.swing.JToggleButton btnSumarCosto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mostrarArcosSalientes;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables

}
