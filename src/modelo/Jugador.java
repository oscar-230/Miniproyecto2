/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Jugador {
    private String nombre;
    private int puntos;
    
    
    public Jugador(){
        nombre = "Jugador 1";
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public Jugador(int puntos) {
        this.puntos = puntos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public int getPuntos() {
        return puntos;
    }
}
