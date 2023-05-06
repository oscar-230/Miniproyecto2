/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto2;

/**
 *
 * @author User
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextArea;

/**
 *
 * @author Sebastián
 */
public class Instrucciones extends JFrame {
    
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JTextArea instrucciones;
    private JButton btnAtras;
   
    
    public Instrucciones() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Instrucciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,530);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        
        
        //String texto = "Escoge la vocal que le falta a la palabra";
        
        jlTitulo = new JLabel("INSTRUCCIONES",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 48));
        //instrucciones = new JLabel(texto);
        instrucciones = new JTextArea();
        instrucciones.setEditable(false);
        instrucciones.setFont(new Font("Calibri",Font.PLAIN,18));
        instrucciones.setBounds(25,100, 450,300);
        instrucciones.setBackground(new Color(0,0,0));
        instrucciones.setForeground(new Color(255,255,255));
        this.add(instrucciones);
        instrucciones.append("\n  El Tic Tac Toe se juega en una cuadrícula de 3x3 casillas.\n");
        instrucciones.append("  Hay dos jugadores en el juego: uno juega con las X\n");
        instrucciones.append("  y otro con las O. El jugador con las X comienza el juego.\n");
        instrucciones.append("  Los jugadores se turnan para marcar una casilla vacía\n");
        instrucciones.append("  en la cuadrícula con su símbolo (X o O).\n");
        instrucciones.append("  El objetivo del juego es conseguir tres símbolos iguales\n");
        instrucciones.append("  en línea, ya sea en horizontal, vertical o diagonal.\n");
        instrucciones.append("  El primer jugador que consigue esto gana el juego.\n");
        instrucciones.append("  Si no hay más casillas vacías en la cuadrícula y nadie\n");
        instrucciones.append("  ha ganado,entonces el juego termina en empate.");
                        
        jpContenido.setBackground(new java.awt.Color(255, 255, 0));
        jpContenido.setSize(520,500);        
        jpContenido.setBounds(0,0, 520, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,20, 520,80);
        jlTitulo.setForeground(Color.BLACK); 
        
        jpContenido.add(jlTitulo);
        jpContenido.add(instrucciones);
        
        btnAtras = new JButton("VOLVER");
        btnAtras.setFont(new java.awt.Font("Arial", 0, 25));
        btnAtras.setBounds(110,420, 300,50);
        btnAtras.setBackground(new java.awt.Color(204,255,204));
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnAtras);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnAtras.addActionListener(manejadorEventos);
        
       
    }
    
    private void Inicio(){
        
    }
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnAtras){                
                dispose();
                new Inicio().setVisible(true);
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
           /* System.out.println("Se liberó la tecla " + e.getKeyChar() +
                    " Con codigo " + e.getKeyCode());*/
            if(e.getKeyCode() == e.VK_ENTER){
                btnAtras.doClick();
            }
        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            /*System.out.println("Se presionó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
            
        }
        
        @Override
        public void keyTyped(KeyEvent e) {
            /*System.out.println("Se digitó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
        }
    }
}