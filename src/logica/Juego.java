
package logica;

import modelo.Jugador;

public class Juego {
    private String [] Tematica;
    private Jugador jugador;
    private Jugador jugadorEst;
    
    public Juego(Jugador jugador, String Tematica[]){
        this.jugador = jugador;
        this.Tematica = Tematica;
    }
    
    public Juego(Jugador jugadorEst){
        this.jugadorEst = jugadorEst;
    }
    
    public String getJugador(){
        return jugador.getNombre();
    }

    public String[] getTematica() {
        return Tematica;
    }
    
    public int getPalabras(){
        return jugadorEst.getPalabras();
    }
    
    public int getAciertos(){
        return jugadorEst.getAciertos();
    }
    
    public int getFallos(){
        return jugadorEst.getFallos();
    }
}
