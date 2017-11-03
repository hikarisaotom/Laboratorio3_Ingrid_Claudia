package lab4_ingrid_claudia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab4_Ingrid_Claudia {

    public static ArrayList<Guerrero> Gurerros = new ArrayList();
    public static ArrayList<Jugador> Jugadores = new ArrayList();
    public static ArrayList<Partida> Partidas = new ArrayList();

    public static void main(String[] args) {
        String Opcion = "";
        System.out.println("ldgdgdjh");
        while (Opcion != "Salir") {
            String[] Opciones = {"Creacion de guerreros", "Eliminación de Guerreos", "Registro de jugadores", "Iniciar Partida", "Cargar Partida", "Listar Jugadores", "Salir"};
            Opcion = (String) JOptionPane.showInputDialog(null,
                    "Seleccione una opción", //Mensaje
                    "                                  MENU",//TITULO
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    Opciones,
                    Opciones[0]);
            switch (Opcion) {
                case "Creacion de guerreros":
                    break;
                case "Eliminación de Guerreos":
                    break;
                case "Registro de jugadores":
                    break;
                case "Iniciar Partida":
                    break;

                case "Cargar Partida":
                    break;

                case "Listar Jugadores":
                    break;

                case "Salir":
                    System.out.println("Saliendo del Sistema......");
                    break;
            }//Fin del switch.
        }//Fin del while.
    }//Fin del main.

}
