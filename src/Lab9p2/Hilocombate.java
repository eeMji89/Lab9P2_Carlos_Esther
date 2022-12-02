
package Lab9p2;

import javax.swing.JTextArea;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Hilocombate extends Thread{
    private javax.swing.JTextArea ta;
    private String texto;

    public Hilocombate() {
    }

    public JTextArea getTa() {
        return ta;
    }

    public void setTa(JTextArea ta) {
        this.ta = ta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
