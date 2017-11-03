/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ingrid_claudia;

/**
 *
 * @author 1234
 */
public class Elfo extends Guerrero {
    private String Tipo_Arma;
    private int Rango_Militar;

    public Elfo() {
        super();
    }

    public Elfo(String Tipo_Arma, int Rango_Militar, String Nombre, int Edad, String Lugar_Nacimiento, int Poder_Ataque, int Salud, int Costo) {
        super(Nombre, Edad, Lugar_Nacimiento, Poder_Ataque, Salud, Costo);
        this.Tipo_Arma = Tipo_Arma;
        this.Rango_Militar = Rango_Militar;
    }

    public String getTipo_Arma() {
        return Tipo_Arma;
    }

    public void setTipo_Arma(String Tipo_Arma) {
        this.Tipo_Arma = Tipo_Arma;
    }

    public int getRango_Militar() {
        return Rango_Militar;
    }

    public void setRango_Militar(int Rango_Militar) {
        this.Rango_Militar = Rango_Militar;
    }

    @Override
    public String toString() {
        return "Elfo{" + "Tipo_Arma=" + Tipo_Arma + ", Rango_Militar=" + Rango_Militar + '}';
    }
    
    public int  Ataque(){
        return super.getPoder_Ataque();
    }
    /* public static void IniciarPartida(){
         boolean Ganador=false;
         int Turno=0;
             Jugadores_Partidas.add(Jugadores.get(Agregar_Jugador()));
             Jugadores_Partidas.add(Jugadores.get(Agregar_Jugador()));
                Partidas.add(new Partida());
                int Tamano=Partidas.size()-1;
                Partidas.get(Tamano).setJugadores_Partida(Jugadores_Partidas);
                while (true){
             if (Ganador) {
                 break;
             }
             switch(Turno){
                 case 0:
                     Turno=1;
                     break;
                 case 1:
                     Turno=0;
                     break;
             }
         }
      
     }*/
    
    
    /*YA CASI
     public static void IniciarPartida(){
         boolean Ganador=false;
         int Turno=0;
         int TurnoOP=0;
             Jugadores_Partidas.add(Jugadores.get(Agregar_Jugador()));
             Jugadores_Partidas.add(Jugadores.get(Agregar_Jugador()));
                Partidas.add(new Partida());
                int Tamano=Partidas.size()-1;
                Partidas.get(Tamano).setJugadores_Partida(Jugadores_Partidas);
                
                while (true){
             if (Ganador) {
                 break;
             }
             switch(Turno){
                 case 0:
                     Turno=1;
                     TurnoOP=0;
                     break;
                 case 1:
                     Turno=0;
                     TurnoOP=1;
                     break;
             }
              System.out.println(Jugadores_Partidas.get(Turno).getNombre()+"  Esta Atacando:");
                    if (Jugadores_Partidas.get(Turno).getGuerrero() instanceof Mago ) {
                        
                    }else if (Jugadores_Partidas.get(Turno).getGuerrero() instanceof Mago ){
                        
                    }else if (Jugadores_Partidas.get(Turno).getGuerrero() instanceof Bruja ){
                        
                    }else if (Jugadores_Partidas.get(Turno).getGuerrero() instanceof Dragon ){
                          
                    }else if (Jugadores_Partidas.get(Turno).getGuerrero() instanceof Arquero){
                        
                    }else if (Jugadores_Partidas.get(Turno).getGuerrero() instanceof Elfo){
                        
                    }
         }
      
     }*/
    
}
