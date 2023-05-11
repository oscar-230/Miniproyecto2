/*
Autores:  Luis Carlos Lucero A <lucero.luis@correounivalle.edu.co> <202027560>
          Oscar David Cuaical L <cuaical.oscar@correounivalle.edu.co> <202270657>
Grupo: 01
N° Laboratorio: 02
Fecha de realización: 11/05/2023
*/

package miniproyecto2;

import java.awt.Color;
import java.awt.Font;
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

public class Instrucciones2 extends JFrame {
    
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JTextArea instrucciones;
    private JButton btnAtras;
    private Imagenes ejemplo;
    private Imagenes teclado;
   
    
    public Instrucciones2() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Instrucciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520,700);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        ejemplo = new Imagenes("/imagenes/ejemplo.png");
        teclado = new Imagenes("/imagenes/flechas.png");
            
        jlTitulo = new JLabel("JUGAR CON TECLADO",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 48));
        instrucciones = new JTextArea();
        instrucciones.setEditable(false);
        instrucciones.setFont(new Font("Calibri",Font.PLAIN,19));
        instrucciones.setBounds(45,460, 420,130);
        instrucciones.setBackground(new Color(0,0,0));
        instrucciones.setForeground(new Color(255,255,255));
        this.add(instrucciones);
        instrucciones.append("  Al estar en la pantalla de juego se te mostraran 9\n");
        instrucciones.append("  Botones, los puedes seleccionar usando La tecla Tab\n");
        instrucciones.append("  y las flechas de tu teclado. Para confirmar el sitio\n");
        instrucciones.append("  donde haras tu movimiento debes pulsar la tecla \n");
        instrucciones.append("                             Enter y listo Diviertete");              
        jpContenido.setBackground(new java.awt.Color(255, 255, 0));
        jpContenido.setSize(520,700);        
        jpContenido.setBounds(0,0, 520, 700);
        jpContenido.setLayout(null);
        
        ejemplo.setSize(250,245);
        ejemplo.setBounds(135,65, 250,245);
        
        teclado.setSize(180,117);
        teclado.setBounds(165,330, 180,117);
        
        
        add(jpContenido);
                
        jlTitulo.setBounds(0,2, 520,80);
        jlTitulo.setForeground(Color.BLACK); 
        
        jpContenido.add(jlTitulo);
        jpContenido.add(ejemplo);
        jpContenido.add(teclado);
        jpContenido.add(instrucciones);
        
        btnAtras = new JButton("VOLVER");
        btnAtras.setFont(new java.awt.Font("Arial", 0, 25));
        btnAtras.setBounds(110,600, 300,50);
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