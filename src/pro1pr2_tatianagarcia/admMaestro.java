package pro1pr2_tatianagarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admMaestro {
    
    private ArrayList<Maestro> listaMaestros = new ArrayList();
    private File archivo = null;
    
    public admMaestro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Maestro> getListaMaestros() {
        return listaMaestros;
    }

    public void setListaMaestros(ArrayList<Maestro> listaMaestros) {
        this.listaMaestros = listaMaestros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setMaestro(Maestro a){
        listaMaestros.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaMaestros = new ArrayList();
            Maestro temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Maestro) objeto.readObject()) != null) {
                        listaMaestros.add(temp);
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
            for (Maestro t : listaMaestros) {
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
