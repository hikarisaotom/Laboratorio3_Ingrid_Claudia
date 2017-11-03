/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ingrid_claudia;

import java.awt.Color;

/**
 *
 * @author 1234
 */
public class Dragon extends Guerrero{
    private Color Color;
    private String Raza;

    public Dragon() {
        super();
    }

    public Dragon(Color Color, String Raza, String Nombre, int Edad, String Lugar_Nacimiento, int Poder_Ataque, int Salud, int Costo) {
        super(Nombre, Edad, Lugar_Nacimiento, Poder_Ataque, Salud, Costo);
        this.Color = Color;
        this.Raza = Raza;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Dragon{" + "Color=" + Color + ", Raza=" + Raza + '}';
    }
    
    @Override
    public void Ataque(){
        
    }
    
}
