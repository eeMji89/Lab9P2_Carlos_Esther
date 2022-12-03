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
public class AdminBi_Clerigo {
    
    private ArrayList<Clerigo> listaClerigos = new ArrayList();
    private File archivo = null;

    public AdminBi_Clerigo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clerigo> getListaClerigos() {
        return listaClerigos;
    }

    public void setListaClerigos(ArrayList<Clerigo> listaClerigos) {
        this.listaClerigos = listaClerigos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargar() throws FileNotFoundException, IOException{
        listaClerigos = new ArrayList();
        Clerigo tclerigo;
        
        if (archivo.exists()) {
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream object = new ObjectInputStream(entrada);
            
            try {
                while ((tclerigo = (Clerigo)object.readObject()) != null) {                    
                    listaClerigos.add(tclerigo);
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
            
            for (Clerigo c : listaClerigos) {
                bw.writeObject(c);
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
