
package lab4_ingrid_claudia;

/**
 *
 * @author 1234
 */
public class Mago extends Guerrero{
    private String Tipo_Magia;
    private String Elemento_Ataque;

    public Mago() {
        super();
    }

    public Mago(String Tipo_Magia, String Elemento_Ataque, String Nombre, int Edad, String Lugar_Nacimiento, int Poder_Ataque, int Salud, int Costo) {
        super(Nombre, Edad, Lugar_Nacimiento, Poder_Ataque, Salud, Costo);
        this.Tipo_Magia = Tipo_Magia;
        this.Elemento_Ataque = Elemento_Ataque;
    }

    public String getTipo_Magia() {
        return Tipo_Magia;
    }

    public void setTipo_Magia(String Tipo_Magia) {
        this.Tipo_Magia = Tipo_Magia;
    }

    public String getElemento_Ataque() {
        return Elemento_Ataque;
    }

    public void setElemento_Ataque(String Elemento_Ataque) {
        this.Elemento_Ataque = Elemento_Ataque;
    }

    @Override
    public String toString() {
        return "Mago{" + "Tipo_Magia=" + Tipo_Magia + ", Elemento_Ataque=" + Elemento_Ataque + '}';
    }
  
    
    @Override
    public double  Ataque(){
        return super.getPoder_Ataque();
    }
}
