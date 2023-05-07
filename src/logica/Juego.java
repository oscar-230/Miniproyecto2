
package logica;

import modelo.Jugador;


/**
 *
 * @author Sebastián
 */
public class Juego {
   
    private Jugador jugador;
    private Jugador jugadorEst;
    
    public Juego(Jugador jugador, String Tematica[]){
        this.jugador = jugador;
        
    }
    
    public Juego(Jugador jugadorEst){
        this.jugadorEst = jugadorEst;
    }
    
    public String getJugador(){
        return jugador.getNombre();
    }

    public int getPuntos(){
        return jugadorEst.getPuntos();
    }
    
    
}

