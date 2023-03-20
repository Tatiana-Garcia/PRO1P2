
package pro1pr2_tatianagarcia;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class Enumerate extends Pregunta{
    private ArrayList <Respuesta> res = new ArrayList();

    public Enumerate() {
        super();
    }

    public Enumerate(double valor, JTextArea pregunta, ArrayList <Respuesta> res) {
        super(valor, pregunta);
        this.res=new ArrayList(res);
    }

    public ArrayList<Respuesta> getRes() {
        return res;
    }

    public void setRes(ArrayList<Respuesta> res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Enumerate{" + "res=" + res + '}';
    }
    
    
}
