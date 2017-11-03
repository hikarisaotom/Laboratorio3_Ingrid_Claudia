package lab4_ingrid_claudia;
public class Jugador {
    private String Nombre;
    private double Dinero_Disponible;
    private int Puntos;
    private Guerrero Guerrero;

    public Jugador() {
    }

    public Jugador(String Nombre, double Dinero_Disponible, int Puntos, Guerrero Guerrero) {
        this.Nombre = Nombre;
        this.Dinero_Disponible = Dinero_Disponible;
        this.Puntos = Puntos;
        this.Guerrero = Guerrero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDinero_Disponible() {
        return Dinero_Disponible;
    }

    public void setDinero_Disponible(double Dinero_Disponible) {
        this.Dinero_Disponible = Dinero_Disponible;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public Guerrero getGuerrero() {
        return Guerrero;
    }

    public void setGuerrero(Guerrero Guerrero) {
        this.Guerrero = Guerrero;
    }

    @Override
    public String toString() {
        return "Jugador \n" + "Nombre =" + Nombre + "\nDinero_Disponible = " + Dinero_Disponible + "\nPuntos =" + Puntos + ",\nGuerrero = " + Guerrero + "\n";
    }
    
}
