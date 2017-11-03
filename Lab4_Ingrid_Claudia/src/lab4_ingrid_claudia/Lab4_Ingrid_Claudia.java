package lab4_ingrid_claudia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab4_Ingrid_Claudia {

    public static ArrayList<Guerrero> Guerreros = new ArrayList();
    public static ArrayList<Jugador> Jugadores = new ArrayList();
    public static ArrayList<Partida> Partidas = new ArrayList();
    public static ArrayList<Jugador> Jugadores_Partidas = new ArrayList();

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
                    Crear_Guerrero();
                    break;
                case "Eliminación de Guerreos":
                    Eliminar_Guerrero();
                    break;
                case "Registro de jugadores":
                    Crear_Jugador();

                    break;
                case "Iniciar Partida":
                    IniciarPartida();
                    break;

                case "Cargar Partida":
                    break;

                case "Listar Jugadores":
                    Listar_Jugador();
                    break;

                case "Salir":
                    System.out.println("Saliendo del Sistema......");
                    break;
            }//Fin del switch.
        }//Fin del while.
    }//Fin del main.

    public static void Eliminar_Guerrero() {
        String guerreros = "";
        for (int i = 0; i < Guerreros.size(); i++) {
            guerreros += "" + (i + 1) + ".- " + Guerreros.get(i).getNombre() + "\n";
        }

        int res = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion del Guerrero a eliminar: \n"
                + guerreros));

        Guerreros.remove(res - 1);
        JOptionPane.showMessageDialog(null, "Guerero eliminado");

    }

    public static void Crear_Guerrero() {
        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre dle guerrero: ");
        String Lugar_Nacimiento = JOptionPane.showInputDialog("Ingrese el lugar de nacimiento del guerrero: ");
        /*NECESITA VALIDACION DE PUNTOS MENORES A 50*/
        int Poder_Ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el poder de ataque"));
        int Salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese  la salud del guerrero"));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del guerrero: "));

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
                
               // OrdernarGuerreros();
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
        String cadena = "";
        int posicion = 0;
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

        Guerreros = Nuevo;

        System.out.println(Guerreros);
    }//Fin del metodo.

    public static int Agregar_Guerrero() {
        String guerreros = "";
        for (int i = 0; i < Guerreros.size(); i++) {
            guerreros += "" + (i + 1) + ".- " + Guerreros.get(i).getNombre() + "\n";
        }

        int res = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion del Guerrero que deseas: \n"
                + guerreros));

        //Guerreros.remove(res - 1);
        JOptionPane.showMessageDialog(null, "Guerero Seleccionado");
        //System.out.println("ds");
        return res - 1;

    }

    public static int Agregar_Jugador() {
        String guerreros = "";
        for (int i = 0; i < Jugadores.size(); i++) {
            guerreros += "" + (i + 1) + ".- " + Jugadores.get(i).getNombre() + "\n";
        }

        int res = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion del Jugador que deseas: \n"
                + guerreros));

        //Guerreros.remove(res - 1);
        JOptionPane.showMessageDialog(null, "Jugador Seleccionado");
        System.out.println("ds");
        return res - 1;

    }

   /* public static void IniciarPartida() {
        boolean Ganador = false;
        int Turno = 0;
        while (true) {
            if (Ganador) {
                break;
            }
            switch (Turno) {
                case 0:
                    Turno = 1;
                    break;
                case 1:
                    Turno = 0;
                    break;
            }
            Jugadores_Partidas.add(Jugadores.get(Agregar_Jugador()));

            Jugadores_Partidas.add(Jugadores.get(Agregar_Jugador()));
            Partidas.add(new Partida());
            int Tamano = Partidas.size() - 1;
            Partidas.get(Tamano).setJugadores_Partida(Jugadores_Partidas);

        }
    }*/

    public static void Crear_Jugador() {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre de jugador");
        double dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero de jugador"));
        int puntos = 0;
        int posicion_Guerrero = Agregar_Guerrero();
        Guerrero Guerrero_Seleccionado = Guerreros.get(posicion_Guerrero);

        while (Guerrero_Seleccionado.getCosto() > dinero) {
            posicion_Guerrero = Agregar_Guerrero();
            Guerrero_Seleccionado = Guerreros.get(posicion_Guerrero);

        }// fin del while

        dinero = dinero - Guerrero_Seleccionado.getCosto();
        Guerreros.remove(posicion_Guerrero);

        Jugadores.add(new Jugador(nombre, dinero, puntos, Guerrero_Seleccionado));
        System.out.println(Jugadores.get(Jugadores.size() - 1));
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Listar_Jugador() {
        String jugadores = "";
        for (int i = 0; i < Jugadores.size(); i++) {
            jugadores += "" + (i + 1) + ".- " + Jugadores.get(i)+ "\n";
        }

       /* int res = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion del Jugador que deseas: \n"
                + guerreros));

        //Guerreros.remove(res - 1);
        JOptionPane.showMessageDialog(null, "Jugador Seleccionado");
        System.out.println("ds");*/
       
       
       JOptionPane.showMessageDialog(null, jugadores);
    }
     
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
      
     }
}
