/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1pr2_tatianagarcia;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author tatig
 */
public class ToF  extends Answers{
    private ButtonGroup botones = new ButtonGroup(); 
    private JRadioButton bottons[];

    public ToF() {
        super();
    }

    
    public ToF(double valor, JTextArea pregunta,ButtonGroup botones,JRadioButton bottons[]) {
        super(valor, pregunta);
        this.botones= botones;
        this.bottons= bottons;
    }
    

    public ButtonGroup getBotones() {
        return botones;
    }

    public void setBotones(ButtonGroup botones) {
        this.botones = botones;
    }

    public JRadioButton[] getBottons() {
        return bottons;
    }

    public void setBottons(JRadioButton[] bottons) {
        this.bottons = bottons;
    }

    @Override
    public String toString() {
        return "ToF{" + "botones=" + botones + ", bottons=" + bottons + '}';
    }
    
}
