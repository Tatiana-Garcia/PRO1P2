
package pro1pr2_tatianagarcia;

import java.io.Serializable;
import javax.swing.JTextArea;

/**
 *
 * @author tatig
 */
class Respuesta implements Serializable{
    private JTextArea res = new JTextArea();

    public Respuesta(JTextArea res) {
        this.res = res;
    }

    public JTextArea getRes() {
        return res;
    }

    public void setRes(JTextArea res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "res=" + res + '}';
    }
    
}
