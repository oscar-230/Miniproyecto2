package miniproyecto2;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;


public class MenuDeJuego extends javax.swing.JFrame {
    String puntajeNecesario;
    int puntosWin = 0;
    
    
        
    public MenuDeJuego() {
        initComponents();
    }
    
    public void puntajeParaGanar() {
        // Obtener el botón seleccionado
        
        ButtonModel selectedButton = Puntos.getSelection();
        
        if (selectedButton != null) {
            
            puntajeNecesario = selectedButton.getActionCommand();
            puntosWin = Integer.parseInt(puntajeNecesario);
            //System.out.println(puntosParaGanar);
        }
         
        else {
            
            puntosWin = 0;
         }
    }
    
      
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Puntos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        primerjugador = new javax.swing.JTextField();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        segundojugador = new javax.swing.JTextField();
        Partida = new javax.swing.JLabel();
        persona = new javax.swing.JButton();
        maquina = new javax.swing.JButton();
        Partida1 = new javax.swing.JLabel();
        PuntajeGanar1 = new javax.swing.JRadioButton();
        PuntajeGanar2 = new javax.swing.JRadioButton();
        PuntajeGanar3 = new javax.swing.JRadioButton();
        PuntajeGanar4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(77, 207, 192));
        setLocation(500, 200);

        primerjugador.setBackground(new java.awt.Color(153, 255, 255));
        primerjugador.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        primerjugador.setForeground(new java.awt.Color(255, 51, 51));
        primerjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerjugadorActionPerformed(evt);
            }
        });

        jugador1.setBackground(new java.awt.Color(153, 255, 153));
        jugador1.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 18)); // NOI18N
        jugador1.setForeground(new java.awt.Color(168, 0, 0));
        jugador1.setText("JUGADOR 1 ");

        jugador2.setBackground(new java.awt.Color(153, 255, 153));
        jugador2.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 18)); // NOI18N
        jugador2.setForeground(new java.awt.Color(168, 0, 0));
        jugador2.setText("JUGADOR 2");

        segundojugador.setBackground(new java.awt.Color(153, 255, 255));
        segundojugador.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        segundojugador.setForeground(new java.awt.Color(255, 51, 51));
        segundojugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundojugadorActionPerformed(evt);
            }
        });

        Partida.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 18)); // NOI18N
        Partida.setForeground(new java.awt.Color(168, 0, 0));
        Partida.setText("SELECCIONAR CATEGORIA");

        persona.setBackground(new java.awt.Color(153, 255, 255));
        persona.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        persona.setText("1vs1");
        persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaActionPerformed(evt);
            }
        });

        maquina.setBackground(new java.awt.Color(153, 255, 255));
        maquina.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        maquina.setText("1vsPC");
        maquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maquinaActionPerformed(evt);
            }
        });

        Partida1.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 18)); // NOI18N
        Partida1.setForeground(new java.awt.Color(168, 0, 0));
        Partida1.setText("PUNTOS PARA GANAR");

        PuntajeGanar1.setBackground(new java.awt.Color(77, 207, 192));
        Puntos.add(PuntajeGanar1);
        PuntajeGanar1.setText("1");
        PuntajeGanar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntajeGanar1ActionPerformed(evt);
            }
        });

        PuntajeGanar2.setBackground(new java.awt.Color(77, 207, 192));
        Puntos.add(PuntajeGanar2);
        PuntajeGanar2.setText("2");
        PuntajeGanar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntajeGanar2ActionPerformed(evt);
            }
        });

        PuntajeGanar3.setBackground(new java.awt.Color(77, 207, 192));
        Puntos.add(PuntajeGanar3);
        PuntajeGanar3.setText("3");
        PuntajeGanar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntajeGanar3ActionPerformed(evt);
            }
        });

        PuntajeGanar4.setBackground(new java.awt.Color(77, 207, 192));
        Puntos.add(PuntajeGanar4);
        PuntajeGanar4.setText("4");
        PuntajeGanar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntajeGanar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jugador2)
                            .addComponent(jugador1))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(primerjugador, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundojugador, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Partida1)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PuntajeGanar3)
                                .addGap(18, 18, 18)
                                .addComponent(PuntajeGanar4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PuntajeGanar1)
                                .addGap(18, 18, 18)
                                .addComponent(PuntajeGanar2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Partida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(persona, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maquina))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1)
                    .addComponent(primerjugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador2)
                    .addComponent(segundojugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(persona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maquina))
                    .addComponent(Partida, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PuntajeGanar1)
                            .addComponent(PuntajeGanar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PuntajeGanar4)
                            .addComponent(PuntajeGanar3))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Partida1)
                        .addGap(51, 51, 51))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void maquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maquinaActionPerformed
   
        String nombre = primerjugador.getText();
        puntajeParaGanar();
        
        if((!nombre.trim().isEmpty() || nombre.trim().length() > 0) && puntosWin != 0){
            //Jugador jugador = new Jugador(nombre);
            dispose();
            PlayerVsPC newframe = new PlayerVsPC();
            newframe.setVisible(true);
            this.dispose();//para que no se acumulen las ventanas
            PlayerVsPC.campopersonamaquina.setText(nombre);
            PlayerVsPC.puntosParaGanar.setText(puntajeNecesario);
            } else {
            JOptionPane.showMessageDialog(null,"Revise que su nombre este correcto \n Y que haya seleccionado la cantidad de puntos para Ganar", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            primerjugador.requestFocusInWindow();
                               
    }//GEN-LAST:event_maquinaActionPerformed
        
    }
    

    
    private void personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaActionPerformed
        // ESPACIO L¿PARA ANCLAR A LA VENTANAOSCAR ASNDJNFAKJNJFVBIERFBRGEGUBTRGRUJ PROXIMA
        
        
        String nombre = primerjugador.getText();
        String nombre2 = segundojugador.getText();
        puntajeParaGanar();

        if(((!nombre.trim().isEmpty() || nombre.trim().length() > 0) && (!nombre.trim().isEmpty() || nombre.trim().length() > 0)) && puntosWin != 0){
            //Jugador jugador = new Jugador(nombre);
            dispose();
            PlayerVsPlayer newframe = new PlayerVsPlayer();
            newframe.setVisible(true);
            this.dispose();//para que no se acumulen las ventanas
            PlayerVsPlayer.campojugadoruno.setText(nombre);
            PlayerVsPlayer.campojugadordos.setText(nombre2);
            PlayerVsPlayer.puntosParaGanar.setText(puntajeNecesario);
            } else {
            JOptionPane.showMessageDialog(null,"Revise que su nombre este correcto \n Y que haya seleccionado la cantidad de puntos para Ganar", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            primerjugador.requestFocusInWindow();
        }
        
        
        
        
    }//GEN-LAST:event_personaActionPerformed

    private void primerjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerjugadorActionPerformed
  
    }//GEN-LAST:event_primerjugadorActionPerformed

    private void PuntajeGanar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntajeGanar1ActionPerformed
       PuntajeGanar1.setActionCommand("1");
    }//GEN-LAST:event_PuntajeGanar1ActionPerformed

    private void PuntajeGanar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntajeGanar2ActionPerformed
        PuntajeGanar2.setActionCommand("2");
    }//GEN-LAST:event_PuntajeGanar2ActionPerformed

    private void PuntajeGanar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntajeGanar3ActionPerformed
        PuntajeGanar3.setActionCommand("3");    }//GEN-LAST:event_PuntajeGanar3ActionPerformed

    private void PuntajeGanar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntajeGanar4ActionPerformed
        PuntajeGanar4.setActionCommand("4");
    }//GEN-LAST:event_PuntajeGanar4ActionPerformed

    private void segundojugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundojugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundojugadorActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(MenuDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDeJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Partida;
    private javax.swing.JLabel Partida1;
    private javax.swing.JRadioButton PuntajeGanar1;
    private javax.swing.JRadioButton PuntajeGanar2;
    private javax.swing.JRadioButton PuntajeGanar3;
    private javax.swing.JRadioButton PuntajeGanar4;
    private javax.swing.ButtonGroup Puntos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    public javax.swing.JButton maquina;
    private javax.swing.JButton persona;
    public static javax.swing.JTextField primerjugador;
    public static javax.swing.JTextField segundojugador;
    // End of variables declaration//GEN-END:variables
}
