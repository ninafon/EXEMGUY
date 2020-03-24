
package exemgui;

import javax.swing.JFrame;

public class Ventana1 {
    
    // creamos unha clase ventana que non herda de ninguen 
    
    JFrame marco ;
    public Ventana1(){
        marco = new JFrame();
        // dámoslle caracteristicas  ao marco 
        //tamaño
        marco.setSize(600,400);
        // para ramatar a execución cando prememos X
        marco.setDefaultCloseOperation(0);
        
        // facemos visible a ventana
        marco.setVisible(true);
    }
   
    
}
