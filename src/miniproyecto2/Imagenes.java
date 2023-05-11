/*
Autores:  Luis Carlos Lucero A <lucero.luis@correounivalle.edu.co> <202027560>
          Oscar David Cuaical L <cuaical.oscar@correounivalle.edu.co> <202270657>
Grupo: 01
N° Laboratorio: 02
Fecha de realización: 11/05/2023
*/

package miniproyecto2;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


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