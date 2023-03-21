/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1pr2_tatianagarcia;

import java.io.Serializable;
import javax.swing.JTextArea;

/**
 *
 * @author tatig
 */
public class Answers implements Serializable{
    protected JTextArea pregunta = new JTextArea(); 
    protected double valor; 
    protected boolean correct; 

    public Answers() {
    }
    

    public Answers(double valor, JTextArea pregunta) {
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

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answers{" + "pregunta=" + pregunta + ", valor=" + valor + ", correct=" + correct + '}';
    }
    
}
