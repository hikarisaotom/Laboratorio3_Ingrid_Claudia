/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ingrid_claudia;

import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Ataque {
    private ArrayList<Jugador> Jugadores_Partida = new ArrayList();

    public Ataque() {
    }

    public ArrayList<Jugador> getJugadores_Partida() {
        return Jugadores_Partida;
    }

    public void setJugadores_Partida(ArrayList<Jugador> Jugadores_Partida) {
        this.Jugadores_Partida = Jugadores_Partida;
    }

    @Override
    public String toString() {
        return "Ataque{" + "Jugadores_Partida=" + Jugadores_Partida + '}';
    }
    
    
    
    
}
