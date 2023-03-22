
package pro1pr2_tatianagarcia;

import java.io.File;

public class Archivo {
    private File archivo;

    public Archivo(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Archivo{" + "archivo=" + archivo + '}';
    }
    
}
