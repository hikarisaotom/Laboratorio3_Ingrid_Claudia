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
    
    public void Ataque(){
        
    }
    
}
