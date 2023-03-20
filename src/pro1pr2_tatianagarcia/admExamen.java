/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1pr2_tatianagarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author tatig
 */
public class admExamen {
    private ArrayList<Examen> listaExamen = new ArrayList();
    private File archivo = null;

    public admExamen(String path) {
        archivo = new File(path);
    }

    public ArrayList<Examen> getListaExamen() {
        return listaExamen;
    }

    public void setListaExamen(ArrayList<Examen> listaExamen) {
        this.listaExamen = listaExamen;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admExamen{" + "listaClases=" + listaExamen + ", archivo=" + archivo + '}';
    }
    
    public void setExamen(Examen a){
        listaExamen.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaExamen = new ArrayList();
            Examen temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Examen) objeto.readObject()) != null) {///////?
                        listaExamen.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Examen t : listaExamen) {
                bw.writeObject(t);/////
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
