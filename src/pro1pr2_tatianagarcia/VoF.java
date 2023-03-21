/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1pr2_tatianagarcia;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author tatig
 */
public class VoF extends Pregunta {
    private ButtonGroup botones = new ButtonGroup(); 
    private JRadioButton v = new JRadioButton();
    private JRadioButton f = new JRadioButton();
    private JRadioButton bottons[];

    public VoF() {
        super();
    }
    

    public VoF(double valor, JTextArea pregunta, ButtonGroup botones,JRadioButton bottons[]) {
        super(valor, pregunta);
        this.botones=botones;
        this.bottons = bottons;
    }
    public VoF(double valor, JTextArea pregunta, ButtonGroup botones, JRadioButton v,JRadioButton f) {
        super(valor, pregunta);
        this.botones=botones;
        this.v=v;
        this.f = f;
    }
    

    public ButtonGroup getBotones() {
        return botones;
    }

    public void setBotones(ButtonGroup botones) {
        this.botones = botones;
    }

    public JRadioButton getV() {
        return v;
    }

    public void setV(JRadioButton v) {
        this.v = v;
    }

    public JRadioButton getF() {
        return f;
    }

    public void setF(JRadioButton f) {
        this.f = f;
    }

    public JRadioButton[] getBottons() {
        return bottons;
    }

    public void setBottons(JRadioButton[] bottons) {
        this.bottons = bottons;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString() + " " + botones.getSelection().toString() ;
    }
    
}
