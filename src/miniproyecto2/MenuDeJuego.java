package miniproyecto2;

import modelo.Jugador;
import javax.swing.JOptionPane;




public class MenuDeJuego extends javax.swing.JFrame {

    public MenuDeJuego() {
        initComponents();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
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
        jugador1.setForeground(new java.awt.Color(255, 0, 204));
        jugador1.setText("JUGADOR 1 ");

        jugador2.setBackground(new java.awt.Color(153, 255, 153));
        jugador2.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 18)); // NOI18N
        jugador2.setForeground(new java.awt.Color(255, 0, 204));
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
        Partida.setForeground(new java.awt.Color(102, 102, 255));
        Partida.setText("SELECCIONAR CATEGORIA");

        persona.setBackground(new java.awt.Color(255, 0, 0));
        persona.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        persona.setText("1vs1");
        persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaActionPerformed(evt);
            }
        });

        maquina.setBackground(new java.awt.Color(255, 0, 0));
        maquina.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        maquina.setText("1vsPC");
        maquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maquinaActionPerformed(evt);
            }
        });

        Partida1.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 18)); // NOI18N
        Partida1.setForeground(new java.awt.Color(102, 102, 255));
        Partida1.setText("PUNTOS PARA GANAR");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 0));
        Puntos.add(jRadioButton1);
        jRadioButton1.setText("1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 0));
        Puntos.add(jRadioButton2);
        jRadioButton2.setText("2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 0));
        Puntos.add(jRadioButton3);
        jRadioButton3.setText("3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 0));
        Puntos.add(jRadioButton4);
        jRadioButton4.setText("4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
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
                                .addComponent(jRadioButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))))
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
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3))
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
   
        String nombre =primerjugador.getText();
        
        if(!nombre.trim().isEmpty() || nombre.trim().length() > 0){
            Jugador jugador = new Jugador(nombre);
            dispose();
            PlayerVsPC newframe = new PlayerVsPC();
            newframe.setVisible(true);
            this.dispose();//para que no se acumulen las ventanas
            } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            primerjugador.requestFocusInWindow();
           
    }//GEN-LAST:event_maquinaActionPerformed
        PlayerVsPC.campopersonamaquina.setText(nombre);
        System.out.println(nombre);
    }
    

    
    private void personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaActionPerformed
        // ESPACIO L¿PARA ANCLAR A LA VENTANAOSCAR ASNDJNFAKJNJFVBIERFBRGEGUBTRGRUJ PROXIMA
        
        
        String nombre =primerjugador.getText();
        String nombre2 = segundojugador.getText();

        if((!nombre.trim().isEmpty() || nombre.trim().length() > 0) && (!nombre.trim().isEmpty() || nombre.trim().length() > 0)){
            Jugador jugador = new Jugador(nombre);
            dispose();
            PlayerVsPlayer newframe = new PlayerVsPlayer();
            newframe.setVisible(true);
            this.dispose();//para que no se acumulen las ventanas
            } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            primerjugador.requestFocusInWindow();
        }
        
        PlayerVsPlayer.campojugadoruno.setText(nombre);
        System.out.println(nombre);
        PlayerVsPlayer.campojugadordos.setText(nombre2);
        System.out.println(nombre2);
        
    }//GEN-LAST:event_personaActionPerformed

    private void primerjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerjugadorActionPerformed
  
    }//GEN-LAST:event_primerjugadorActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
    private javax.swing.ButtonGroup Puntos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    public javax.swing.JButton maquina;
    private javax.swing.JButton persona;
    public static javax.swing.JTextField primerjugador;
    public static javax.swing.JTextField segundojugador;
    // End of variables declaration//GEN-END:variables
}
