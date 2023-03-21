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
    private ArrayList<Answers> respuestas = new ArrayList();
    
    private Clase clase; 
    private double puntuacion;
    private boolean valid;
    
    public Examen() {
    }

    public Examen(Date inicio, Date fin, JTextField nombre, JTextArea descripcion, Clase clase) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clase=clase;
        valid = true;
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

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public ArrayList<Answers> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Answers> respuestas) {
        this.respuestas = respuestas;
    }
    
    @Override
    public String toString() {
        return nombre.getText();
    }
    
    
    
}
