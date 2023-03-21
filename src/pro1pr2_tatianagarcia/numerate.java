
package pro1pr2_tatianagarcia;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class numerate extends Answers {
    private JTextField respuesta = new JTextField();

    public numerate() {
    }

    public numerate(double valor, JTextArea pregunta,JTextField respuesta) {
        super(valor, pregunta);
        this.respuesta=respuesta;
    }

    public JTextField getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(JTextField respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "numerate{" + "respuesta=" + respuesta + '}';
    }
    
    
}
