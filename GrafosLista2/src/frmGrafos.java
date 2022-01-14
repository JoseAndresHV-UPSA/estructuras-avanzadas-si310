
import javax.swing.*;

public class frmGrafos extends javax.swing.JFrame {

    Grafo G;
    Grafo H;

    /**
     * Creates new form Formulario
     */
    public frmGrafos() {
        initComponents();
        G = new Grafo();
        H = new Grafo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLeerGrafo = new javax.swing.JToggleButton();
        btnImprimirGrafo = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        btnExisteCamino = new javax.swing.JButton();
        btnConexo = new javax.swing.JButton();
        btnIguales = new javax.swing.JButton();
        btnDFS = new javax.swing.JButton();
        btnBFS = new javax.swing.JButton();
        btnCantidadCaminos = new javax.swing.JButton();
        existeCaminoBFS = new javax.swing.JButton();
        btnUnicoCamino = new javax.swing.JButton();
        btnCaminoMasCorto = new javax.swing.JButton();
        mostrarCaminos = new javax.swing.JButton();
        btnMostrarUnicoCamino = new javax.swing.JButton();
        btnEsArbolBinario = new javax.swing.JButton();
        btnMostrarCaminos = new javax.swing.JButton();
        btnCaminoMasLargo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GRAFOS DIRIGIDOS");

        btnLeerGrafo.setText("Leer Grafo");
        btnLeerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerGrafoActionPerformed(evt);
            }
        });

        btnImprimirGrafo.setText("Imprimir Grafo");
        btnImprimirGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirGrafoActionPerformed(evt);
            }
        });

        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        btnExisteCamino.setText("existe Camino");
        btnExisteCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExisteCaminoActionPerformed(evt);
            }
        });

        btnConexo.setText("Conexo");
        btnConexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConexoActionPerformed(evt);
            }
        });

        btnIguales.setText("iguales");
        btnIguales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualesActionPerformed(evt);
            }
        });

        btnDFS.setText("DFS");
        btnDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDFSActionPerformed(evt);
            }
        });

        btnBFS.setText("BFS");
        btnBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBFSActionPerformed(evt);
            }
        });

        btnCantidadCaminos.setText("cantidad Caminos");
        btnCantidadCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadCaminosActionPerformed(evt);
            }
        });

        existeCaminoBFS.setText("Existe CaminoBFS");
        existeCaminoBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existeCaminoBFSActionPerformed(evt);
            }
        });

        btnUnicoCamino.setText("Existe Unico Camino");
        btnUnicoCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnicoCaminoActionPerformed(evt);
            }
        });

        btnCaminoMasCorto.setText("Camino mas corto");
        btnCaminoMasCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminoMasCortoActionPerformed(evt);
            }
        });

        mostrarCaminos.setText("Mostrar Caminos");
        mostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCaminosActionPerformed(evt);
            }
        });

        btnMostrarUnicoCamino.setText("Mostrar Unico Camino");
        btnMostrarUnicoCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUnicoCaminoActionPerformed(evt);
            }
        });

        btnEsArbolBinario.setText("Es Arbol Binario");
        btnEsArbolBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsArbolBinarioActionPerformed(evt);
            }
        });

        btnMostrarCaminos.setText("Mostrar Caminos");
        btnMostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCaminosActionPerformed(evt);
            }
        });

        btnCaminoMasLargo.setText("Camino mas largo");
        btnCaminoMasLargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminoMasLargoActionPerformed(evt);
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
                        .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnLeerGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnImprimirGrafo))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIguales, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExisteCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCantidadCaminos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(mostrarCaminos)
                                .addGap(196, 196, 196))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConexo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(existeCaminoBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarCaminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCaminoMasCorto, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(btnCaminoMasLargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarUnicoCamino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUnicoCamino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEsArbolBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLeerGrafo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImprimirGrafo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDFS)
                                    .addComponent(btnBFS)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIguales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnExisteCamino)
                                    .addComponent(btnConexo))
                                .addGap(14, 14, 14)
                                .addComponent(btnCantidadCaminos)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUnicoCamino)
                                    .addComponent(existeCaminoBFS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrarUnicoCamino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEsArbolBinario)
                                    .addComponent(btnMostrarCaminos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCaminoMasCorto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCaminoMasLargo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(mostrarCaminos)))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerGrafoActionPerformed
        //ejercicio1();
        ejercicio2();
        //G.crearVertice("A");

    }//GEN-LAST:event_btnLeerGrafoActionPerformed

    private void ejercicio1() {
        G.crearVertice("A");
        G.crearVertice("B");
        G.crearVertice("C");
        G.crearVertice("D");
        G.crearVertice("E");
        G.crearVertice("F");
        G.crearVertice("G");
        G.crearVertice("H");
        G.insertarArco("A", "B", 2);
        G.insertarArco("A", "C", 3);
        G.insertarArco("B", "F", 4);
        G.insertarArco("B", "E", 5);
        G.insertarArco("F", "G", 7);
        G.insertarArco("E", "H", 8);
        G.insertarArco("C", "D", 6);
    }

    private void ejercicio2() {
        G.crearVertice("A");
        G.crearVertice("B");
        G.crearVertice("C");
        G.crearVertice("D");
        G.crearVertice("E");
        G.crearVertice("F");
        G.crearVertice("G");
        G.crearVertice("H");
        G.insertarArco("A", "B", 10);
        G.insertarArco("A", "C", 8);
        G.insertarArco("C", "B", 8);
        G.insertarArco("B", "D", 4);
        G.insertarArco("C", "E", 5);
        G.insertarArco("E", "D", 5);
        G.insertarArco("E", "F", 7);
        G.insertarArco("D", "F", 5);
        G.insertarArco("F", "G", 12);
        G.insertarArco("F", "H", 4);
        G.insertarArco("G", "C", 7);
        G.insertarArco("G", "H", 5);
        G.insertarArco("G", "E", 2);
    }

    private void btnImprimirGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirGrafoActionPerformed
        // TODO add your handling code here:   
        //G.ordenarVertices();
        G.imprimir(jta);
    }//GEN-LAST:event_btnImprimirGrafoActionPerformed

    private void btnExisteCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExisteCaminoActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        if (G.existeCamino(A, B))
            JOptionPane.showMessageDialog(rootPane, "Existe camino..!!");
        else
            JOptionPane.showMessageDialog(rootPane, "No existe camino..!!");
    }//GEN-LAST:event_btnExisteCaminoActionPerformed

    private void btnIgualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualesActionPerformed
        //TODO add your handling code here:
        Grafo A1, A2;
        A1 = G;
        A2 = H;
        A1.ordenarVerticesAlf();
        A2.ordenarVerticesAlf();
        if (A1.iguales(A2)) {
            JOptionPane.showMessageDialog(rootPane, "Iguales..!!!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No son iguales..!!!");
        }
        A1.imprimir(jta);
        jta.append("\n");
        A2.imprimir(jta);
    }//GEN-LAST:event_btnIgualesActionPerformed

    private void btnDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFSActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice inicial (DFS):");
        G.ordenarVerticesAlf();
        G.DFS(A, jta);
    }//GEN-LAST:event_btnDFSActionPerformed

    private void btnBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBFSActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice inicial (BFS):");
        G.ordenarVerticesAlf();
        G.BFS(A, jta);
    }//GEN-LAST:event_btnBFSActionPerformed

    private void btnConexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConexoActionPerformed
        // TODO add your handling code here:
        if (G.esConexo())
            JOptionPane.showMessageDialog(rootPane, "Es conexo..!!");
        else
            JOptionPane.showMessageDialog(rootPane, "No es conexo..!!");
    }//GEN-LAST:event_btnConexoActionPerformed

    private void btnCantidadCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadCaminosActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        int c = G.cantidadCaminos(A, B);
        if (c == -1)
            JOptionPane.showMessageDialog(rootPane, "No existe referencia de los vértices");
        else
            JOptionPane.showMessageDialog(rootPane, "Tiene" + String.valueOf(c) + " caminos");
    }//GEN-LAST:event_btnCantidadCaminosActionPerformed

    private void existeCaminoBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existeCaminoBFSActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        if (G.existeCaminoBFS(A, B))
            JOptionPane.showMessageDialog(rootPane, "Existe camino..!!");
        else
            JOptionPane.showMessageDialog(rootPane, "No existe camino..!!");
    }//GEN-LAST:event_existeCaminoBFSActionPerformed

    private void btnUnicoCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnicoCaminoActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        if (G.unicoCamino(A, B))
            JOptionPane.showMessageDialog(rootPane, "Existe un unico camino");
        else
            JOptionPane.showMessageDialog(rootPane, "No existe un unico camino, existen " + G.cantidadCaminos(A, B) + " caminos");
    }//GEN-LAST:event_btnUnicoCaminoActionPerformed

    private void btnCaminoMasCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminoMasCortoActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        G.caminoMasCorto(A, B, jta);
    }//GEN-LAST:event_btnCaminoMasCortoActionPerformed

    private void mostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCaminosActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        G.mostrarCaminos(A, B, jta);
    }//GEN-LAST:event_mostrarCaminosActionPerformed

    private void btnMostrarUnicoCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUnicoCaminoActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        G.mostrarUnicoCamino2(A, B, jta);
    }//GEN-LAST:event_btnMostrarUnicoCaminoActionPerformed

    private void btnEsArbolBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsArbolBinarioActionPerformed
        // TODO add your handling code here:
        String str = JOptionPane.showInputDialog(null, "Vertice origen");
        if(G.esArbolBinario(str))
            JOptionPane.showMessageDialog(null, "Es arbol binario");
        else
            JOptionPane.showMessageDialog(null, "No es arbol binario");
    }//GEN-LAST:event_btnEsArbolBinarioActionPerformed

    private void btnMostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCaminosActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        G.mostrarCaminos(A, B, jta);
    }//GEN-LAST:event_btnMostrarCaminosActionPerformed

    private void btnCaminoMasLargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminoMasLargoActionPerformed
        // TODO add your handling code here:
        String A = JOptionPane.showInputDialog("Vertice Origen:");
        String B = JOptionPane.showInputDialog("Vertice Destino:");
        G.caminoMasLargo(A, B, jta);
    }//GEN-LAST:event_btnCaminoMasLargoActionPerformed

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
    private javax.swing.JButton btnBFS;
    private javax.swing.JButton btnCaminoMasCorto;
    private javax.swing.JButton btnCaminoMasLargo;
    private javax.swing.JButton btnCantidadCaminos;
    private javax.swing.JButton btnConexo;
    private javax.swing.JButton btnDFS;
    private javax.swing.JButton btnEsArbolBinario;
    private javax.swing.JButton btnExisteCamino;
    private javax.swing.JButton btnIguales;
    private javax.swing.JToggleButton btnImprimirGrafo;
    private javax.swing.JToggleButton btnLeerGrafo;
    private javax.swing.JButton btnMostrarCaminos;
    private javax.swing.JButton btnMostrarUnicoCamino;
    private javax.swing.JButton btnUnicoCamino;
    private javax.swing.JButton existeCaminoBFS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta;
    private javax.swing.JButton mostrarCaminos;
    // End of variables declaration//GEN-END:variables

}
