
package pro1pr2_tatianagarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admRespuesta {
    private ArrayList<Respuesta> listaRespuesta = new ArrayList();
    private File archivo = null;

    public admRespuesta(String path) {
        archivo = new File(path);
    }

    
    public ArrayList<Respuesta> getListaRespuesta() {
        return listaRespuesta;
    }

    public void setListaRespuesta(ArrayList<Respuesta> listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setRespuesta(Respuesta a){
        listaRespuesta.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaRespuesta = new ArrayList();
            Respuesta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Respuesta) objeto.readObject()) != null) {
                        listaRespuesta.add(temp);
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
            for (Respuesta t : listaRespuesta) {
                bw.writeObject(t);
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
