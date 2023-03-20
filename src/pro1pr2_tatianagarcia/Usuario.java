
package pro1pr2_tatianagarcia;

import java.io.Serializable;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Usuario implements Serializable{
    private JTextField user = new JTextField(); 
    private JPasswordField pass = new JPasswordField(); 
    private static final long SerialVersionUID=777L;

    public Usuario() {
    }

    public Usuario(JTextField user, JPasswordField pass) {
        this.user = user;
        this.pass = pass;
    }

    public JTextField getUser() {
        return user;
    }

    public void setUser(JTextField user) {
        this.user = user;
    }

    public JPasswordField getPass() {
        return pass;
    }

    public void setPass(JPasswordField pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "\nUsuario: " + user + "\nContraseña: " + pass ;
    }
    
}
