
package pro1pr2_tatianagarcia;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MultipleChoice extends Pregunta{
    private ButtonGroup botones = new ButtonGroup();
    private JRadioButton bottons[];

    public MultipleChoice() {
        super();
    }

    public MultipleChoice(double valor, JTextArea pregunta,ButtonGroup botones,JRadioButton bottons[]) {
        super(valor, pregunta);
        this.botones = botones; 
        this.bottons = bottons;
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
        return super.toString()+"MultipleChoice{" + "botones=" + botones + '}';
    }
    
    
    
    
}
