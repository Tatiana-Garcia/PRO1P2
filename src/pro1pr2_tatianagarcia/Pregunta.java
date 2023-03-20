
package pro1pr2_tatianagarcia;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTextArea;


public class Pregunta implements Serializable{
    protected JTextArea pregunta = new JTextArea(); 
    protected double valor; 

    public Pregunta() {
    }

    public Pregunta(double valor,JTextArea pregunta) {
        this.valor = valor;
        this.pregunta = pregunta;
    }

    public JTextArea getPregunta() {
        return pregunta;
    }

    public void setPregunta(JTextArea pregunta) {
        this.pregunta = pregunta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "pregunta=" + pregunta + ", valor=" + valor + '}';
    }
    
    

}
