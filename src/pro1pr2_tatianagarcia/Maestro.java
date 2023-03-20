
package pro1pr2_tatianagarcia;

import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Maestro extends Usuario{
    private JFormattedTextField ID = new JFormattedTextField();
    private JTextField nombre = new JTextField(); 
    private JTextField profesion = new JTextField();
    private JFormattedTextField sueldo = new JFormattedTextField();
    private JTextField rol= new JTextField(); 
    private ArrayList <Clase> clases = new ArrayList();
    
    public Maestro() {
        super();
    }

    public Maestro(JFormattedTextField ID, JTextField nombre, JTextField profesion, JFormattedTextField sueldo, JTextField rol, JTextField user, JPasswordField pass) {
        super(user, pass);
        this.ID = ID;
        this.nombre = nombre;
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.rol = rol;
    }

    public JFormattedTextField getID() {
        return ID;
    }

    public void setID(JFormattedTextField ID) {
        this.ID = ID;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getProfesion() {
        return profesion;
    }

    public void setProfesion(JTextField profesion) {
        this.profesion = profesion;
    }

    public JFormattedTextField getSueldo() {
        return sueldo;
    }

    public void setSueldo(JFormattedTextField sueldo) {
        this.sueldo = sueldo;
    }

    public JTextField getRol() {
        return rol;
    }

    public void setRol(JTextField rol) {
        this.rol = rol;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    

    @Override
    public String toString() {
        return ID.getText();
    }
    public String toString2() {
        return nombre.getText();
    }
    
    
}
