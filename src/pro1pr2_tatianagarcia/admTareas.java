
package pro1pr2_tatianagarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class admTareas {
    private ArrayList<Tarea> list = new ArrayList();
    private File archivo = null;

    public admTareas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Tarea> getList() {
        return list;
    }

    public void setList(ArrayList<Tarea> list) {
        this.list = list;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admTareas{" + "list=" + list + ", archivo=" + archivo + '}';
    }
    public void setTarea(Tarea t){
        list.add(t);
    }
    public void cargarArchivo() {
        try {            
            list = new ArrayList();
            Tarea temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Tarea) objeto.readObject()) != null) {///////?
                        list.add(temp);
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
            for (Tarea t : list) {
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
