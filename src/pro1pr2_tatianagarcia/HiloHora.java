/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1pr2_tatianagarcia;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author tatig
 */
public class HiloHora implements Runnable{
    private final JLabel hora;
    private Date h=new Date();
    public HiloHora(JLabel hora) {
        this.hora = hora;
    }  

    public Date getH() {
        return h;
    }

    public void setH(Date h) {
        this.h = h;
    }

    

    @Override
    public void run() {
        while(true){
            h=new Date();
//            if (h.getSeconds()%2==0) {
//                hora.setForeground(Color.BLACK);
//            }else{
//                hora.setForeground(Color.MAGENTA);
//            }
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            hora.setText( f.format(h) );
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }     
    }
    
}
