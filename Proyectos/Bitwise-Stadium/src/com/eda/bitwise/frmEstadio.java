/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eda.bitwise;

public class frmEstadio extends javax.swing.JFrame {

    Estadio estadio;
    Partido partidoActual;
    Seccion s1;
    Seccion s2;
    Seccion s3;
    Seccion s4;
    Seccion s5;
    Seccion s6;

    public frmEstadio() {
        initComponents();
    }

    public frmEstadio(Estadio estadio) {
        initComponents();
        this.setLocationRelativeTo(null);

        // ESTADIO 
        this.estadio = estadio;
        lbNombreEstadio.setText("ESTADIO " + estadio.getNombreEstadio().toUpperCase());

        // SECCIONES
        mostrarSecciones();
        s1 = estadio.getSecciones().get(0);
        s2 = estadio.getSecciones().get(1);
        s3 = estadio.getSecciones().get(2);
        s4 = estadio.getSecciones().get(3);
        s5 = estadio.getSecciones().get(4);
        s6 = estadio.getSecciones().get(5);

        partidoActual = estadio.getPartidoActual();
        cargarAsientosPorTickets();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtaS5 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaS4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtaS1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtaS2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaS6 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaS3 = new javax.swing.JTextArea();
        imgCancha = new javax.swing.JLabel();
        lbNombreEstadio = new javax.swing.JLabel();
        lbSeccion3 = new javax.swing.JLabel();
        lbSeccion1 = new javax.swing.JLabel();
        lbSeccion4 = new javax.swing.JLabel();
        lbSeccion2 = new javax.swing.JLabel();
        lbSeccion6 = new javax.swing.JLabel();
        lbSeccion5 = new javax.swing.JLabel();
        btnPartidos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        lblPartidoActual = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 66, 107));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtaS5.setColumns(20);
        jtaS5.setRows(5);
        jScrollPane9.setViewportView(jtaS5);

        jtaS4.setColumns(20);
        jtaS4.setRows(5);
        jScrollPane2.setViewportView(jtaS4);

        jtaS1.setColumns(20);
        jtaS1.setRows(5);
        jScrollPane6.setViewportView(jtaS1);

        jtaS2.setColumns(20);
        jtaS2.setRows(5);
        jScrollPane7.setViewportView(jtaS2);

        jtaS6.setColumns(20);
        jtaS6.setRows(5);
        jScrollPane1.setViewportView(jtaS6);

        jtaS3.setColumns(20);
        jtaS3.setRows(5);
        jScrollPane3.setViewportView(jtaS3);

        imgCancha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancha.jpg"))); // NOI18N

        lbNombreEstadio.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbNombreEstadio.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreEstadio.setText("ESTADIO: XXX");

        lbSeccion3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSeccion3.setForeground(new java.awt.Color(255, 255, 255));
        lbSeccion3.setText("Seccion 3");

        lbSeccion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSeccion1.setForeground(new java.awt.Color(255, 255, 255));
        lbSeccion1.setText("Seccion 1");

        lbSeccion4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSeccion4.setForeground(new java.awt.Color(255, 255, 255));
        lbSeccion4.setText("Seccion 4");

        lbSeccion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSeccion2.setForeground(new java.awt.Color(255, 255, 255));
        lbSeccion2.setText("Seccion 2");

        lbSeccion6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSeccion6.setForeground(new java.awt.Color(255, 255, 255));
        lbSeccion6.setText("Seccion 6");

        lbSeccion5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSeccion5.setForeground(new java.awt.Color(255, 255, 255));
        lbSeccion5.setText("Seccion 5");

        btnPartidos.setText("PARTIDOS");
        btnPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidosActionPerformed(evt);
            }
        });

        jButton1.setText("TICKETS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });

        lblPartidoActual.setForeground(new java.awt.Color(255, 255, 255));

        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lbNombreEstadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSeccion5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgCancha)
                                    .addComponent(lbSeccion2)
                                    .addComponent(lbSeccion4)
                                    .addComponent(lbSeccion3)
                                    .addComponent(lbSeccion1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSeccion6)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(lblPartidoActual)
                                .addGap(391, 391, 391))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbNombreEstadio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnVolver)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPartidoActual)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbSeccion5)
                                    .addComponent(lbSeccion1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbSeccion6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSeccion3)
                                .addGap(1, 1, 1)
                                .addComponent(imgCancha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbSeccion4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSeccion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarAsientosPorTickets() {
        if (partidoActual != null) {
            for (int i = 0; i < partidoActual.getTickets().size(); i++) {
                Ticket ticket = partidoActual.getTickets().get(i);
                if (partidoActual.getIdPartido() == ticket.getIdPartido()) {
                    System.out.println("partido: " + ticket.id_partido + " seccion: " + ticket.id_seccion + " asiento: " + ticket.nro_asiento);
                    switch (ticket.getIdSeccion()) {
                        case 1:
                            s1.getAsientos().sentar(ticket.getNroAsiento());

                            break;
                        case 2:
                            s2.getAsientos().sentar(ticket.getNroAsiento());

                            break;
                        case 3:
                            s3.getAsientos().sentar(ticket.getNroAsiento());

                            break;
                        case 4:
                            s4.getAsientos().sentar(ticket.getNroAsiento());

                            break;
                        case 5:
                            s5.getAsientos().sentar(ticket.getNroAsiento());

                            break;
                        case 6:
                            s6.getAsientos().sentar(ticket.getNroAsiento());

                            break;
                        default:
                            break;
                    }

                }
            }
            mostrarAsientos();
        }
    }

    public void mostrarAsientos() {
        jtaS1.setText(s1.getAsientos().mostrar());
        jtaS2.setText(s2.getAsientos().mostrar());
        jtaS3.setText(s3.getAsientos().mostrar());
        jtaS4.setText(s4.getAsientos().mostrar());
        jtaS5.setText(s5.getAsientos().mostrar());
        jtaS6.setText(s6.getAsientos().mostrar());

    }

    private void btnPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidosActionPerformed
        frmPartidos ventanaPartidos = new frmPartidos(estadio);
        ventanaPartidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPartidosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmTickets ventanaTickets = new frmTickets(estadio);
        ventanaTickets.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmCrearEstadio ventanaCrearEstadio = new frmCrearEstadio(estadio);
        ventanaCrearEstadio.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        frmClientes ventanaClientes = new frmClientes(estadio);
        ventanaClientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClientesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEstadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPartidos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imgCancha;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JTextArea jtaS1;
    private javax.swing.JTextArea jtaS2;
    private javax.swing.JTextArea jtaS3;
    private javax.swing.JTextArea jtaS4;
    private javax.swing.JTextArea jtaS5;
    private javax.swing.JTextArea jtaS6;
    private javax.swing.JLabel lbNombreEstadio;
    private javax.swing.JLabel lbSeccion1;
    private javax.swing.JLabel lbSeccion2;
    private javax.swing.JLabel lbSeccion3;
    private javax.swing.JLabel lbSeccion4;
    private javax.swing.JLabel lbSeccion5;
    private javax.swing.JLabel lbSeccion6;
    private javax.swing.JLabel lblPartidoActual;
    // End of variables declaration//GEN-END:variables

    public void mostrarSecciones() {
        lbSeccion1.setText("SECCION " + estadio.getSecciones().get(0).getNombreSeccion().toUpperCase());
        lbSeccion2.setText("SECCION " + estadio.getSecciones().get(1).getNombreSeccion().toUpperCase());
        lbSeccion3.setText("SECCION " + estadio.getSecciones().get(2).getNombreSeccion().toUpperCase());
        lbSeccion4.setText("SECCION " + estadio.getSecciones().get(3).getNombreSeccion().toUpperCase());
        lbSeccion5.setText("SECCION " + estadio.getSecciones().get(4).getNombreSeccion().toUpperCase());
        lbSeccion6.setText("SECCION " + estadio.getSecciones().get(5).getNombreSeccion().toUpperCase());
    }
}
