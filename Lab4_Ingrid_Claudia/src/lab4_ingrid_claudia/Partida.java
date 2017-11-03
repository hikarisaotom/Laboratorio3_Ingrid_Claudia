package lab4_ingrid_claudia;

import java.util.ArrayList;

public class Partida {

    private ArrayList<Object> Ataques = new ArrayList();
    private ArrayList<Jugador> Jugadores_Partida = new ArrayList();

    public Partida() {
    }

    public ArrayList<Object> getAtaques() {
        return Ataques;
    }

    public void setAtaques(ArrayList<Object> Ataques) {
        this.Ataques = Ataques;
    }

   
}
    

