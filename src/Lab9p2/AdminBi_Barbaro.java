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
public class AdminBi_Barbaro {
    
    private ArrayList<Barbaro> listaBarbaros = new ArrayList();
    private File archivo = null;

    public AdminBi_Barbaro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Barbaro> getListaBarbaros() {
        return listaBarbaros;
    }

    public void setListaBarbaros(ArrayList<Barbaro> listaBarbaros) {
        this.listaBarbaros = listaBarbaros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargar() throws FileNotFoundException, IOException{
        
        listaBarbaros = new ArrayList();
        Barbaro tbarbaro;
        
        if (archivo.exists()) {
            
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream object = new ObjectInputStream(entrada);
            
            try {
                while ((tbarbaro = (Barbaro) object.readObject()) != null) {   
                    listaBarbaros.add(tbarbaro);
                    
                }
            } catch (Exception e) {
            }
        }
    }
    
    public void escribir(){
        
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            
            for (Barbaro t : listaBarbaros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                fw.close();
                bw.close();
            } catch (Exception e) {
            }
        }
    }
    
}//fin clase
