/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9p2;

import java.io.Serializable;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Picaro extends Personajes implements Serializable{
    private String instrumento;
    private int robos;
    private static final long SerialVersionUID=771L;
    public Picaro() {
        super();
    }

    public Picaro(String instrumento, int robos) {
        this.instrumento = instrumento;
        this.robos = robos;
    }

    public Picaro(String instrumento, int robos, String nombre, String raza, int estatura, int peso, int edad, int hp,String descripcion, String nacionalidad, String tipo,int Ac) {
        super(nombre, raza, estatura, peso, edad, hp,descripcion, nacionalidad, tipo,Ac);
        this.instrumento = instrumento;
        this.robos = robos;
    }  
    
    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getRobos() {
        return robos;
    }

    public void setRobos(int robos) {
        this.robos = robos;
    }

    @Override
    public String toString() {
        return super.toString()+ "Picaro{" + "instrumento=" + instrumento + ", robos=" + robos + '}';
    }
    
    
}
