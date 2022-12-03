
package Lab9p2;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Hilocombate extends Thread{
    private javax.swing.JList ta;
    private String texto;
    private boolean stop;

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    
    public Hilocombate() {
    }

    public JList getTa() {
        return ta;
    }

    public void setTa(JList ta) {
        this.ta = ta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void run (){
        DefaultListModel lista = new DefaultListModel();
        while (stop == true) {  
            lista.addElement(texto);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
         
}
