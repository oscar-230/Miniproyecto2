/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miniproyecto2;

import java.awt.Panel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
/**
 *
 * @author ASUS
 */
public class NewJFrame extends javax.swing.JFrame {
    
    int v1, v2, v3, v4, v5, v6, v7, v8, v9;
    boolean done = false;
    boolean fin = false;

    void reset() {
        v1 = 0;
        v2 = 0;
        v3 = 0;
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v7 = 0;
        v8 = 0;
        v9 = 0;
        p1.setText("");
        p1.setEnabled(true);
        p2.setText("");
        p2.setEnabled(true);
        p3.setText("");
        p3.setEnabled(true);
        p4.setText("");
        p4.setEnabled(true);
        p5.setText("");
        p5.setEnabled(true);
        p6.setText("");
        p6.setEnabled(true);
        p7.setText("");
        p7.setEnabled(true);
        p8.setText("");
        p8.setEnabled(true);
        p9.setText("");
        p9.setEnabled(true);
        done=false;
        fin=false;
    }

    void TicTac(int player, int poss) {

        switch (player) {
            case 1:
                switch (poss) {

                    case 1:
                        v1 = 1;
                        p1.setText("X");
                        p1.setEnabled(false);
                        break;
                    case 2:
                        v2 = 1;
                        p2.setText("X");
                        p2.setEnabled(false);
                        break;
                    case 3:
                        v3 = 1;
                        p3.setText("X");
                        p3.setEnabled(false);
                        break;
                    case 4:
                        v4 = 1;
                        p4.setText("X");
                        p4.setEnabled(false);
                        break;
                    case 5:
                        v5 = 1;
                        p5.setText("X");
                        p5.setEnabled(false);
                        break;
                    case 6:
                        v6 = 1;
                        p6.setText("X");
                        p6.setEnabled(false);
                        break;
                    case 7:
                        v7 = 1;
                        p7.setText("X");
                        p7.setEnabled(false);
                        break;
                    case 8:
                        v8 = 1;
                        p8.setText("X");
                        p8.setEnabled(false);
                        break;
                    case 9:
                        v9 = 1;
                        p9.setText("X");
                        p9.setEnabled(false);
                        break;
                }
                break;


            case 2:
                switch (poss) {
                    case 1:
                        v1 = 2;
                        p1.setText("O");
                        p1.setEnabled(false);
                        break;
                    case 2:
                        v2 = 2;
                        p2.setText("O");
                        p2.setEnabled(false);
                        break;
                    case 3:
                        v3 = 2;
                        p3.setText("O");
                        p3.setEnabled(false);
                        break;
                    case 4:
                        v4 = 2;
                        p4.setText("O");
                        p4.setEnabled(false);
                        break;
                    case 5:
                        v5 = 2;
                        p5.setText("O");
                        p5.setEnabled(false);
                        break;
                    case 6:
                        v6 = 2;
                        p6.setText("O");
                        p6.setEnabled(false);
                        break;
                    case 7:
                        v7 = 2;
                        p7.setText("O");
                        p7.setEnabled(false);
                        break;
                    case 8:
                        v8 = 2;
                        p8.setText("O");
                        p8.setEnabled(false);
                        break;
                    case 9:
                        v9 = 2;
                        p9.setText("O");
                        p9.setEnabled(false);
                        break;

                }
                break;

        }
    }

    boolean winner(int player) {

        boolean gano = false;

        switch (player) {

            case 1:
                if (v1 == 1 && v2 == 1 && v3 == 1) {
                    gano = true;
                }
                if (v4 == 1 && v5 == 1 && v6 == 1) {
                    gano = true;
                }
                if (v7 == 1 && v8 == 1 && v9 == 1) {
                    gano = true;
                }
                if (v1 == 1 && v4 == 1 && v7 == 1) {
                    gano = true;
                }
                if (v2 == 1 && v5 == 1 && v8 == 1) {
                    gano = true;
                }
                if (v3 == 1 && v6 == 1 && v9 == 1) {
                    gano = true;
                }
                if (v1 == 1 && v5 == 1 && v9 == 1) {
                    gano = true;
                }
                if (v3 == 1 && v5 == 1 && v7 == 1) {
                    gano = true;
                }
                break;

            case 2:
                if (v1 == 2 && v2 == 2 && v3 == 2) {
                    gano = true;
                }
                if (v4 == 2 && v5 == 2 && v6 == 2) {
                    gano = true;
                }
                if (v7 == 2 && v8 == 2 && v9 == 2) {
                    gano = true;
                }
                if (v1 == 2 && v4 == 2 && v7 == 2) {
                    gano = true;
                }
                if (v2 == 2 && v5 == 2 && v8 == 2) {
                    gano = true;
                }
                if (v3 == 2 && v6 == 2 && v9 == 2) {
                    gano = true;
                }
                if (v1 == 2 && v5 == 2 && v9 == 2) {
                    gano = true;
                }
                if (v3 == 2 && v5 == 2 && v7 == 2) {
                    gano = true;
                }
                break;


        }
        return gano;
    }

    void bloqueo() {
        //primera fila horizontal
        if (v1 == 2 && v2 == 2 && v3 == 0 && !done) {
            TicTac(1, 3);
            done = true;
        }
        if (v1 == 2 && v2 == 0 && v3 == 2 && !done) {
            TicTac(1, 2);
            done = true;

        }
        if (v1 == 0 && v2 == 2 && v3 == 2 && !done) {
            TicTac(1, 1);
            done = true;
        }

        //segunda fila horizontal
        if (v4 == 2 && v5 == 2 && v6 == 0 && !done) {
            TicTac(1, 6);
            done = true;
        }
        if (v4 == 2 && v5 == 0 && v6 == 2 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v4 == 0 && v5 == 2 && v6 == 2 && !done) {
            TicTac(1, 4);
            done = true;
        }
        //tercera fila horizontal
        if (v7 == 2 && v8 == 2 && v9 == 0 && !done) {
            TicTac(1, 9);
            done = true;
        }
        
        if (v7 == 2 && v8 == 0 && v9 == 2 && !done) {
            TicTac(1, 8);
            done = true;
        }
        if (v7 == 0 && v8 == 2 && v9 == 2 && !done) {
            TicTac(1, 7);
            done = true;
        }
        //primera vertical
        if (v1 == 2 && v4 == 2 && v7 == 0 && !done) {
            TicTac(1, 7);
            done = true;
        }
        if (v1 == 2 && v4 == 0 && v7 == 2 && !done) {
            TicTac(1, 4);
            done = true;
        }
        if (v1 == 0 && v4 == 2 && v7 == 2 && !done) {
            TicTac(1, 1);
            done = true;
        }
        //segunda vertical
        if (v2 == 2 && v5 == 2 && v8 == 0 && !done) {
            TicTac(1, 8);
            done = true;
        }
        if (v2 == 2 && v5 == 0 && v8 == 2 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v2 == 0 && v5 == 2 && v8 == 2 && !done) {
            TicTac(1, 2);
            done = true;
        }
        //tercera vertical
        if (v3 == 2 && v6 == 2 && v9 == 0 && !done) {
            TicTac(1, 9);
            done = true;
        }
        if (v3 == 2 && v6 == 0 && v9 == 2 && !done) {
            TicTac(1, 6);
            done = true;
        }
        if (v3 == 0 && v6 == 2 && v9 == 2 && !done) {
            TicTac(1, 3);
            done = true;
        }
        //primera diagonal
        if (v1 == 2 && v5 == 2 && v9 == 0 && !done) {
            TicTac(1, 9);
            done = true;
        }
        if (v1 == 2 && v5 == 0 && v9 == 2 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v1 == 0 && v5 == 2 && v9 == 2 && !done) {
            TicTac(1, 1);
            done = true;
        }
        //segunda diagonal
        if (v3 == 2 && v5 == 2 && v7 == 0 && !done) {
            TicTac(1, 7);
            done = true;
        }
        if (v3 == 2 && v5 == 0 && v7 == 2 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v3 == 0 && v5 == 2 && v7 == 2 && !done) {
            TicTac(1, 3);
            done = true;

        }


    }

    //pegar la funcion de bloqueo y cambiarle los "2" por "1" en las condiciones
    void ganar() {
        //

        if (v1 == 1 && v2 == 1 && v3 == 0 && !done) {
            TicTac(1, 3);

            done = true;
        }
        if (v1 == 1 && v2 == 0 && v3 == 1 && !done) {
            TicTac(1, 2);
            done = true;

        }
        if (v1 == 0 && v2 == 1 && v3 == 1 && !done) {
            TicTac(1, 1);
            done = true;
        }

        //segunda fila horizontal
        if (v4 == 1 && v5 == 1 && v6 == 0 && !done) {
            TicTac(1, 6);
            done = true;
        }
        if (v4 == 1 && v5 == 0 && v6 == 1 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v4 == 0 && v5 == 1 && v6 == 1 && !done) {
            TicTac(1, 4);
            done = true;
        }
        //tercera fila horizontal
        if (v7 == 1 && v8 == 1 && v9 == 0 && !done) {
            TicTac(1, 9);
            done = true;
        }
        if (v7 == 1 && v8 == 0 && v9 == 1 && !done) {
            TicTac(1, 8);
            done = true;
        }
        if (v7 == 0 && v8 == 1 && v9 == 1 && !done) {
            TicTac(1, 7);
            done = true;
        }
        //primera vertical
        if (v1 == 1 && v4 == 1 && v7 == 0 && !done) {
            TicTac(1, 7);
            done = true;
        }
        if (v1 == 1 && v4 == 0 && v7 == 1 && !done) {
            TicTac(1, 4);
            done = true;
        }
        if (v1 == 0 && v4 == 1 && v7 == 1 && !done) {
            TicTac(1, 1);
            done = true;
        }
        //segunda vertical
        if (v2 == 1 && v5 == 1 && v8 == 0 && !done) {
            TicTac(1, 8);
            done = true;
        }
        if (v2 == 1 && v5 == 0 && v8 == 1 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v2 == 0 && v5 == 1 && v8 == 1 && !done) {
            TicTac(1, 2);
            done = true;
        }
        //tercera vertical
        if (v3 == 1 && v6 == 1 && v9 == 0 && !done) {
            TicTac(1, 9);
            done = true;
        }
        if (v3 == 1 && v6 == 0 && v9 == 1 && !done) {
            TicTac(1, 6);
            done = true;
        }
        if (v3 == 0 && v6 == 1 && v9 == 1 && !done) {
            TicTac(1, 3);

            done = true;
        }
        //primera diagonal
        if (v1 == 1 && v5 == 1 && v9 == 0 && !done) {
            TicTac(1, 9);
            done = true;
        }
        if (v1 == 1 && v5 == 0 && v9 == 1 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v1 == 0 && v5 == 1 && v9 == 1 && !done) {
            TicTac(1, 1);
            done = true;
        }
        //segunda diagonal
        if (v3 == 1 && v5 == 1 && v7 == 0 && !done) {
            TicTac(1, 7);
            done = true;
        }
        if (v3 == 1 && v5 == 0 && v7 == 1 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v3 == 0 && v5 == 1 && v7 == 1 && !done) {
            TicTac(1, 3);

            done = true;
        }


    }

    void centro() {

        if (v5 == 0 && !done) {
            TicTac(1, 5);
            done = true;
        }

    }

    void recorrer() {
        if (v1 == 0 && !done) {
            TicTac(1, 1);
            done = true;
        }
        if (v2 == 0 && !done) {
            TicTac(1, 2);
            done = true;
            System.out.println("2");
        }
        if (v3 == 0 && !done) {
            TicTac(1, 3);
            done = true;
            System.out.println("3");
        }
        if (v4 == 0 && !done) {
            TicTac(1, 4);
            done = true;
        }
        if (v5 == 0 && !done) {
            TicTac(1, 5);
            done = true;
        }
        if (v6 == 0 && !done) {
            TicTac(1, 6);
            done = true;
        }
        if (v7 == 0 && !done) {
            TicTac(1, 7);
            done = true;
        }
        if (v8 == 0 && !done) {
            TicTac(1, 8);
            done = true;
        }
        if (v9 == 0 && !done) {
            TicTac(1, 9);
            done = true;
        }

    }

   void allBloqueo(){
            if(v4==2&&v5==1&&v9==2&&v7==0&&!done){
                TicTac(1,7);
                done=true;
            }
            if(v1==2&&v5==1&&v9==2&&v8==0&& !done){
                TicTac(1,8);
                done=true;
            }
            if(v3==2&&v5==1&&v7==2&&v4==0&& !done){
                TicTac(1,4);
                done=true;
            }
            if(v3==2&&v5==1&&v8==2&&v6==0&&!done){
                TicTac(1,6);
                done=true;
            }
            if(v1==2&&v5==1&&v8==2&&v7==0&&!done){
                TicTac(1,7);
                done=true;
            }

   }

    void machine() {
        //se marca que no hay ningun tiro realizado por parte de la makina
        //done cambia a true cuando la makina tire
        done = false;
        fin = false;
        //se almacena en gano el valor que recibe winner
        boolean gano = winner(2);

        //comprueba si el jugador gano
        if (gano) {
            JOptionPane.showMessageDialog(null, "Gano Persona", "TIC TAC", JOptionPane.PLAIN_MESSAGE);
            reset();
            fin = true;
        }


        //esta funcion comprueba si puede ganar
        if (!done && !fin) {
            System.out.println("gaanar");
            ganar();
        }

        //intenta bloquear los tiros del ususario en caso de uqe se pueda

        if (!done && !fin) {
            bloqueo();
            System.out.println("bloqueo");
        }

        //tira en el centro en caso de que este vacio
        if (!done && !fin) {
            centro();
        }

        if(!done && !fin){
            allBloqueo();
        }

        //si no puedo hacer nada de lo anterior

        if (!done && !fin && v3 == 0) {
            TicTac(1, 3);
            done=true;
        }
        //funcion  de comprobacion de casillas vacias

        if (!done && !fin) {
            recorrer();
        }


//comprueba si yo(makina) gane
        if (done && !fin) {
            gano = winner(1);
            if (gano) {
                JOptionPane.showMessageDialog(null, "GANA MAQUINA", "TIC TAC ", JOptionPane.PLAIN_MESSAGE);
                reset();
                fin = true;
            }

        }

        if(v1!=0&&v2!=0&&v3!=0&&v4!=0&&v5!=0&&v6!=0&&v7!=0&&v8!=0&&v9!=0){
            JOptionPane.showMessageDialog(null, "EMPATES ", "TIC TAC", JOptionPane.PLAIN_MESSAGE);
            reset();
        }

    }

    /** Creates new form NewJFrame */
    
    public NewJFrame() {
        initComponents();
    }
   
 
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        p1.setBackground(new java.awt.Color(51, 255, 255));
        p1.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p1.setForeground(new java.awt.Color(204, 0, 204));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1KeyPressed(evt);
            }
        });

        p2.setBackground(new java.awt.Color(51, 255, 255));
        p2.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p2.setForeground(new java.awt.Color(204, 0, 204));
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        p2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p2KeyPressed(evt);
            }
        });

        p3.setBackground(new java.awt.Color(51, 255, 255));
        p3.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p3.setForeground(new java.awt.Color(204, 0, 204));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        p3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p3KeyPressed(evt);
            }
        });

        p7.setBackground(new java.awt.Color(51, 255, 255));
        p7.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p7.setForeground(new java.awt.Color(204, 0, 204));
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });
        p7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p7KeyPressed(evt);
            }
        });

        p8.setBackground(new java.awt.Color(51, 255, 255));
        p8.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p8.setForeground(new java.awt.Color(204, 0, 204));
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        p8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p8KeyPressed(evt);
            }
        });

        p9.setBackground(new java.awt.Color(51, 255, 255));
        p9.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p9.setForeground(new java.awt.Color(204, 0, 204));
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });
        p9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p9KeyPressed(evt);
            }
        });

        p4.setBackground(new java.awt.Color(51, 255, 255));
        p4.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p4.setForeground(new java.awt.Color(204, 0, 204));
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        p4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p4KeyPressed(evt);
            }
        });

        p5.setBackground(new java.awt.Color(51, 255, 255));
        p5.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p5.setForeground(new java.awt.Color(204, 0, 204));
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        p5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p5KeyPressed(evt);
            }
        });

        p6.setBackground(new java.awt.Color(51, 255, 255));
        p6.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        p6.setForeground(new java.awt.Color(204, 0, 153));
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        p6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:;
        TicTac(2, 1);
        machine();
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 2);
        machine();
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 3);
        machine();
    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 4);
        machine();
    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 5);
        machine();
    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 6);
        machine();
    }//GEN-LAST:event_p6ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 7);
        machine();
    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 8);
        machine();
    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        // TODO add your handling code here:
        TicTac(2, 9);
        machine();
    }//GEN-LAST:event_p9ActionPerformed

    private void p1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p1.doClick();
        }
    }//GEN-LAST:event_p1KeyPressed

    private void p2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p2.doClick();
        }
    }//GEN-LAST:event_p2KeyPressed

    private void p3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p3.doClick();
        }
    }//GEN-LAST:event_p3KeyPressed

    private void p4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p4.doClick();
        }
    }//GEN-LAST:event_p4KeyPressed

    private void p5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p5.doClick();
        }
    }//GEN-LAST:event_p5KeyPressed

    private void p6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p6.doClick();
        }
    }//GEN-LAST:event_p6KeyPressed

    private void p7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p7.doClick();
        }
    }//GEN-LAST:event_p7KeyPressed

    private void p8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p8.doClick();
        }
    }//GEN-LAST:event_p8KeyPressed

    private void p9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p9.doClick();
        }
    }//GEN-LAST:event_p9KeyPressed
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    // End of variables declaration//GEN-END:variables

}
