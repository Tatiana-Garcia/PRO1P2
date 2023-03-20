
package pro1pr2_tatianagarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admUsuario {
    private ArrayList<Usuario> listaUsers = new ArrayList();
    private File archivo = null;

    public admUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsers() {
        return listaUsers;
    }

    public void setListaUsers(ArrayList<Usuario> listaUsers) {
        this.listaUsers = listaUsers;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admUsuario{" + "listaUsers=" + listaUsers + ", archivo=" + archivo + '}';
    }
    
    //extra mutador
    public void setUsuario(Usuario p) {
        this.listaUsers.add(p);
    }

    public void cargarArchivo() {
        try {            
            listaUsers = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listaUsers.add(temp);
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
            for (Usuario t : listaUsers) {
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
