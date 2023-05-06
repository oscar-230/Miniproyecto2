package miniproyecto2;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class FormTicTacToe extends javax.swing.JFrame {

    private TicTacToe juego;
    private JLabel[][] tablero;
    private int J1Puntos;
    private int J2Puntos;

    /**
     * Creates new form FormTicTacToe
     */
    public FormTicTacToe() {
        initComponents();

        // Para crear el tablero
        JLabel[][] t = {
            {lbl00, lbl01, lbl02},
            {lbl10, lbl11, lbl12},
            {lbl20, lbl21, lbl22}
        };
        this.tablero = t;
        this.J1Puntos = 0;
        this.J2Puntos = 0;
        this.reset();

    }

    private int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;

    }

    public void elegirTurnoInicial() {
        int n = this.generaNumeroAleatorio(1, 2);
        //this.juego.setTurno(n == 1);

    }

    public void actualizarPuntuacion() {
        this.txtJ1puntos.setText(this.J1Puntos + "");
        this.txtJ2puntos.setText(this.J2Puntos + "");
    }

    public void mostrarTurno() {
        if (this.juego.isTurno()) {
            this.lblTurno.setText("JUGADOR 1");
        } else {
            this.lblTurno.setText("JUGADOR 2");
        }
    }

    public void inicializarTablero() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {

                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

                Image img = new ImageIcon("-").getImage();
                ImageIcon img2 = new ImageIcon(img.getScaledInstance(
                        this.tablero[i][j].getWidth(),
                        this.tablero[i][j].getHeight(),
                        Image.SCALE_SMOOTH)
                );

                this.tablero[i][j].setIcon(img2);
                this.tablero[i][j].setBorder(border);

            }

        }
    }

    public void elegirPosicion(int i, int j) {
        if (this.juego.getSimboloAt(i, j) == Simbolo.VACIO) {
            juego.insertarEn(i, j);

            Image img;
            if (this.juego.isTurno()) {
                img = new ImageIcon("img/x.png").getImage();

            } else {
                img = new ImageIcon("img/o.png").getImage();
            }

            ImageIcon img2 = new ImageIcon(img.getScaledInstance(
                    this.tablero[i][j].getWidth(),
                    this.tablero[i][j].getHeight(),
                    Image.SCALE_SMOOTH)
            );

            this.tablero[i][j].setIcon(img2);
            this.juego.cambiarTurno();
            this.mostrarTurno();
            // COMPROBAR FINAL DE LA PARTIDA
            if (this.juego.finPartida()) {
                Simbolo ganador = juego.ganador();
                if (ganador == null) {
                    JOptionPane.showMessageDialog(rootPane, "EMPATE");

                } else if (ganador == Simbolo.X) {
                    this.J1Puntos++;
                    JOptionPane.showMessageDialog(rootPane, "GANA JUGADOIR 1");

                } else {
                    this.J2Puntos++;
                    JOptionPane.showMessageDialog(rootPane, "GANA JUGADOR 2");

                }
                //Reiniciar partida
                this.reset();
            }

        }
    }

    public void reset() {
        this.juego = new TicTacToe();
        this.elegirTurnoInicial();
        this.mostrarTurno();
        this.actualizarPuntuacion();
        this.inicializarTablero();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lbl00 = new javax.swing.JLabel();
        lbl01 = new javax.swing.JLabel();
        lbl02 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        txtJ1puntos = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        txtJ2puntos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setBackground(new java.awt.Color(153, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(5, 3));
        getContentPane().add(jLabel1);

        turno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turno.setText("Turno");
        getContentPane().add(turno);

        lblTurno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurno.setText("J1");
        getContentPane().add(lblTurno);

        lbl00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl00MouseClicked(evt);
            }
        });
        lbl00.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl00KeyPressed(evt);
            }
        });
        getContentPane().add(lbl00);

        lbl01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl01MouseClicked(evt);
            }
        });
        lbl01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl01KeyPressed(evt);
            }
        });
        getContentPane().add(lbl01);

        lbl02.setBackground(new java.awt.Color(102, 255, 255));
        lbl02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl02MouseClicked(evt);
            }
        });
        lbl02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl02KeyPressed(evt);
            }
        });
        getContentPane().add(lbl02);

        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });
        lbl10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl10KeyPressed(evt);
            }
        });
        getContentPane().add(lbl10);

        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });
        lbl11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl11KeyPressed(evt);
            }
        });
        getContentPane().add(lbl11);

        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });
        lbl12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl12KeyPressed(evt);
            }
        });
        getContentPane().add(lbl12);

        lbl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl20MouseClicked(evt);
            }
        });
        lbl20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl20KeyPressed(evt);
            }
        });
        getContentPane().add(lbl20);

        lbl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl21MouseClicked(evt);
            }
        });
        lbl21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl21KeyPressed(evt);
            }
        });
        getContentPane().add(lbl21);

        lbl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl22MouseClicked(evt);
            }
        });
        lbl22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl22KeyPressed(evt);
            }
        });
        getContentPane().add(lbl22);

        txtJ1puntos.setEditable(false);
        txtJ1puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJ1puntosActionPerformed(evt);
            }
        });
        getContentPane().add(txtJ1puntos);

        btnreset.setText("Reiniciar");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset);

        txtJ2puntos.setEditable(false);
        txtJ2puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJ2puntosActionPerformed(evt);
            }
        });
        getContentPane().add(txtJ2puntos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//  MAUSE PARA EL TABLERO 

    private void txtJ1puntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJ1puntosActionPerformed

    }//GEN-LAST:event_txtJ1puntosActionPerformed

    private void txtJ2puntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJ2puntosActionPerformed

    }//GEN-LAST:event_txtJ2puntosActionPerformed

    private void lbl00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl00MouseClicked
        elegirPosicion(0, 0);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl00MouseClicked

    private void lbl01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MouseClicked
        elegirPosicion(0, 1);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl01MouseClicked

    private void lbl02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MouseClicked
        elegirPosicion(0, 2);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl02MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        elegirPosicion(1, 0);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        elegirPosicion(1, 1);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        elegirPosicion(1, 2);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl20MouseClicked
        elegirPosicion(2, 0);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl20MouseClicked

    private void lbl21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl21MouseClicked
        elegirPosicion(2, 1);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl21MouseClicked

    private void lbl22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl22MouseClicked
        elegirPosicion(2, 2);
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_lbl22MouseClicked

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        reset();
        System.out.println("AQUI PASO");
    }//GEN-LAST:event_btnresetActionPerformed

    private void lbl00KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl00KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbl00KeyPressed

    private void lbl01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl01KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl01KeyPressed

    private void lbl02KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl02KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl02KeyPressed

    private void lbl10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl10KeyPressed

    private void lbl11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl11KeyPressed

    private void lbl12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl12KeyPressed

    private void lbl20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl20KeyPressed

    private void lbl21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl21KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl21KeyPressed

    private void lbl22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl22KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl22KeyPressed

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
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel turno;
    private javax.swing.JTextField txtJ1puntos;
    private javax.swing.JTextField txtJ2puntos;
    // End of variables declaration//GEN-END:variables
}
