package pro1pr2_tatianagarcia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Examen implements Serializable{
    private Date inicio; 
    private Date fin; 
    private JTextField nombre =new JTextField(); ; 
    private JTextArea descripcion = new JTextArea(); 
    private ArrayList <Pregunta> preguntas = new ArrayList();
    
    public Examen() {
    }

    public Examen(Date inicio, Date fin, JTextField nombre, JTextArea descripcion) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextArea getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(JTextArea descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    

    
    @Override
    public String toString() {
        return nombre.getText();
    }
    
    
    
}
