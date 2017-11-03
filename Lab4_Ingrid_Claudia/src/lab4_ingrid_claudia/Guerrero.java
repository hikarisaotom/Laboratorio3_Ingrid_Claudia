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
public abstract class Guerrero {
    private String Nombre;
    private int Edad;
    private String Lugar_Nacimiento;
    private double Poder_Ataque;
    private double Salud;
    private int Costo;

    public Guerrero() {
    }

    public Guerrero(String Nombre, int Edad, String Lugar_Nacimiento, int Poder_Ataque, int Salud, int Costo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Lugar_Nacimiento = Lugar_Nacimiento;
        this.Poder_Ataque = Poder_Ataque;
        this.Salud = Salud;
        this.Costo = Costo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getLugar_Nacimiento() {
        return Lugar_Nacimiento;
    }

    public void setLugar_Nacimiento(String Lugar_Nacimiento) {
        this.Lugar_Nacimiento = Lugar_Nacimiento;
    }

    public double getPoder_Ataque() {
        return Poder_Ataque;
    }

    public void setPoder_Ataque(double Poder_Ataque) {
        this.Poder_Ataque = Poder_Ataque;
    }

    public double getSalud() {
        return Salud;
    }

    public void setSalud(double Salud) {
        this.Salud = Salud;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    @Override
    public String toString() {
        return "Guerrero{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Lugar_Nacimiento=" + Lugar_Nacimiento + ", Poder_Ataque=" + Poder_Ataque + ", Salud=" + Salud + ", Costo=" + Costo + '}';
    }
    public abstract double Ataque();
        
    
    
}
