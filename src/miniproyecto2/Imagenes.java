/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto2;

/**
 *
 * @author User
 */
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
class Imagenes extends JPanel{
    ImageIcon imagen;
    String nombre;
    
    public Imagenes(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void paint(Graphics g){
        Dimension tamano = getSize();
        imagen = new ImageIcon(getClass().getResource(nombre));
        g.drawImage(imagen.getImage(), 0, 0, null);
        setOpaque(false);
        super.paint(g);
    }
}