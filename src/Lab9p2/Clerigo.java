
package Lab9p2;

import java.io.Serializable;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Clerigo extends Personajes  {
    private String Dcreyente;
    private String Tinvocacion;
    private static final long SerialVersionUID = 772L;
    public Clerigo() {
        super();
    }

    public Clerigo(String Dcreyente, String Tinvocacion) {
        this.Dcreyente = Dcreyente;
        this.Tinvocacion = Tinvocacion;
    }

    public Clerigo(String Dcreyente, String Tinvocacion, String nombre, String raza, int estatura, int peso, int edad,int hp, String descripcion, String nacionalidad, String tipo,int Ac) {
        super(nombre, raza, estatura, peso, edad,hp, descripcion, nacionalidad, tipo,Ac);
        this.Dcreyente = Dcreyente;
        this.Tinvocacion = Tinvocacion;
    }

   

    public String getDcreyente() {
        return Dcreyente;
    }

    public void setDcreyente(String Dcreyente) {
        this.Dcreyente = Dcreyente;
    }

    public String getTinvocacion() {
        return Tinvocacion;
    }

    public void setTinvocacion(String Tinvocacion) {
        this.Tinvocacion = Tinvocacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "Es un Clerigo";
    }
    
    
    
    
}
