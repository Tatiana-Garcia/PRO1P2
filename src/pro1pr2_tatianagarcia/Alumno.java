
package pro1pr2_tatianagarcia;

import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Alumno extends Usuario{
    private JFormattedTextField cuenta = new JFormattedTextField(); 
    private JTextField nombre = new JTextField(); 
    private JTextField carrera = new JTextField();
    private ArrayList <Clase> clases = new ArrayList();
    private JTextField rol = new JTextField();
    

    public Alumno() {
        super();
    }

    public Alumno(JFormattedTextField cuenta, JTextField nombre, JTextField carrera, JTextField rol, JTextField user, JPasswordField pass) {
        super(user, pass);
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.rol = rol;
    }

    public JFormattedTextField getCuenta() {
        return cuenta;
    }

    public void setCuenta(JFormattedTextField cuenta) {
        this.cuenta = cuenta;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getCarrera() {
        return carrera;
    }

    public void setCarrera(JTextField carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public JTextField getRol() {
        return rol;
    }

    public void setRol(JTextField rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return nombre.getText() ;
    }
    
    
}
