
package pro1pr2_tatianagarcia;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import javax.swing.JTextField;

public class Tarea implements Serializable{
    private Date inicio; 
    private Date fin; 
    private JTextField nombre =new JTextField(); ; 
    private Clase clase;
    private double puntuacion;

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }
    private File archivo;
    private int tam; 
    
    private boolean disponible;

    public Tarea(Date inicio, Date fin,JTextField nombre,Clase clase) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre=nombre;
        this.clase = clase;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    
    
    @Override
    public String toString() {
        return "Tarea{" + "inicio=" + inicio + ", fin=" + fin + ", nombre=" + nombre + '}';
    }
    
}
