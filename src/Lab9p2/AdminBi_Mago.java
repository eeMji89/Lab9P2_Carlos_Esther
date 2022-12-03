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
public class AdminBi_Mago {
    
    private ArrayList<Mago> listaMagos = new ArrayList();
    private File archivo = null;

    public AdminBi_Mago(String path) {
        archivo = new File(path);
    }

    public ArrayList<Mago> getListaMagos() {
        return listaMagos;
    }

    public void setListaMagos(ArrayList<Mago> listaMagos) {
        this.listaMagos = listaMagos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargar() throws FileNotFoundException, IOException{
        
        listaMagos = new ArrayList();
        Mago tmago;
        
        if (archivo.exists()) {
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            
            try {
                while ((tmago = (Mago) objeto.readObject()) != null) {
                        listaMagos.add(tmago);
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
            
            for (Mago a : listaMagos) {
                bw.writeObject(a);
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
