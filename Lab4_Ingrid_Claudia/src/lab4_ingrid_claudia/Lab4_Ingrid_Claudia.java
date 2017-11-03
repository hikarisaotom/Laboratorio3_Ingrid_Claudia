package lab4_ingrid_claudia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab4_Ingrid_Claudia {

    public static ArrayList<Guerrero> Guerreros = new ArrayList();
    public static ArrayList<Jugador> Jugadores = new ArrayList();
    public static ArrayList<Partida> Partidas = new ArrayList();

    public static void main(String[] args) {
        String Opcion = "";
        //System.out.println("ldgdgdjh");
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
                    Crear_Guerrero();
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
                    OrdernarGuerreros();
                    break;

                case "Salir":
                    System.out.println("Saliendo del Sistema......");
                    break;
            }//Fin del switch.
        }//Fin del while.
    }//Fin del main.
public static void Crear_Guerrero(){
    String Nombre= JOptionPane.showInputDialog("Ingrese el nombre dle guerrero: ");
    String Lugar_Nacimiento=JOptionPane.showInputDialog("Ingrese el lugar de nacimiento del guerrero: ");
   /*NECESITA VALIDACION DE PUNTOS MENORES A 50*/
    int Poder_Ataque=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el poder de ataque"));
    int Salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese  la salud del guerrero"));
   int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del guerrero: "));

    double Costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Costo del guerrero: "));
        String Opcion = "";
        String[] Opciones = {"Mago", "Elfo", "Dragon", "Arquero", "Bruja"};
        Opcion = (String) JOptionPane.showInputDialog(null,
                "Seleccione una opción", //Mensaje
                "                                  Seleccione el tipo de guerrero: ",//TITULO
                JOptionPane.QUESTION_MESSAGE,
                null,
                Opciones,
                Opciones[0]);

        switch (Opcion) {
            case "Mago":
                Guerreros.add(new Mago());
                OrdernarGuerreros();
                break;
            case "Elfo":
                Guerreros.add(new Elfo());
                break;
            case "Dragon":
                Guerreros.add(new Dragon());
                break;
            case "Arquero":
                Guerreros.add(new Arquero());
                break;
            case "Bruja":
                Guerreros.add(new Mago());
                break;
        }
        int Pos = Guerreros.size() - 1;
        Guerreros.get(Pos).setNombre(Nombre);
        Guerreros.get(Pos).setEdad(Edad);
        Guerreros.get(Pos).setLugar_Nacimiento(Lugar_Nacimiento);
        Guerreros.get(Pos).setPoder_Ataque(Poder_Ataque);
        Guerreros.get(Pos).setSalud(Salud);
    }

    public static void OrdernarGuerreros() {
        ArrayList<Guerrero> Nuevo = new ArrayList();
        
        for (Guerrero Guerrero1 : Guerreros) {
            if (Guerrero1 instanceof Mago) {
                Nuevo.add(Guerrero1);
            }
        }
         for (Guerrero Guerrero1 : Guerreros) {
            if (Guerrero1 instanceof Bruja) {
                Nuevo.add(Guerrero1);
            }
        }
         
          for (Guerrero Guerrero1 : Guerreros) {
            if (Guerrero1 instanceof Elfo) {
                Nuevo.add(Guerrero1);
            }
        }
          
           for (Guerrero Guerrero1 : Guerreros) {
            if (Guerrero1 instanceof Dragon) {
                Nuevo.add(Guerrero1);
            }
        }
            for (Guerrero Guerrero1 : Guerreros) {
            if (Guerrero1 instanceof Arquero) {
                Nuevo.add(Guerrero1);
            }
        }
            Guerreros=Nuevo;
            System.out.println(Guerreros);
    }//Fin del metodo.
    
    
}
