/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9p2;

import java.util.ArrayList;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author clago
 */
public class AdminBi_Picaro {
    
    private ArrayList<Picaro> listaPicaros = new ArrayList();
    private File archivo = null;

    public AdminBi_Picaro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Picaro> getListaPicaros() {
        return listaPicaros;
    }

    public void setListaPicaros(ArrayList<Picaro> listaPicaros) {
        this.listaPicaros = listaPicaros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargar() throws FileNotFoundException, IOException{
        
        listaPicaros = new ArrayList();
        Picaro tpicaro;
        
        if (archivo.exists()) {
            
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream object = new ObjectInputStream(entrada);
            
            try {
                while ((tpicaro = (Picaro)object.readObject()) != null) {                    
                    listaPicaros.add(tpicaro);
                }
            } catch (Exception e) {
            }
        }
    }
    
    
    
    
}//fin clase
