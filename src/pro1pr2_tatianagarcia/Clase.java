
package pro1pr2_tatianagarcia;

import com.toedter.calendar.JYearChooser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Clase implements Serializable{
    private JFormattedTextField ID;
    private JTextField nombre;
    private Date hora;
    private JFormattedTextField UV;
    private JFormattedTextField semestre;
    private JFormattedTextField periodo;
    private int year;
    private ArrayList<Examen> examenes = new ArrayList();

    public Clase() {
    }

    public Clase(JFormattedTextField ID, JTextField nombre, Date hora, JFormattedTextField UV, JFormattedTextField semestre, JFormattedTextField periodo,int year) {
        this.ID = ID;
        this.nombre = nombre;
        this.hora = hora;
        this.UV = UV;
        this.semestre = semestre;
        this.periodo = periodo;
        this.year = year;
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

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public JFormattedTextField getUV() {
        return UV;
    }

    public void setUV(JFormattedTextField UV) {
        this.UV = UV;
    }

    public JFormattedTextField getSemestre() {
        return semestre;
    }

    public void setSemestre(JFormattedTextField semestre) {
        this.semestre = semestre;
    }

    public JFormattedTextField getPeriodo() {
        return periodo;
    }

    public void setPeriodo(JFormattedTextField periodo) {
        this.periodo = periodo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }
    
    @Override
    public String toString() {
        return ID.getText()+"";
    }
    public String toString2() {
        return nombre.getText()+"";
    }
    
}
