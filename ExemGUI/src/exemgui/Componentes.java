

package exemgui;

import java.awt.Color;
import javax.swing.*;

public class Componentes {
    
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    JTextField liñaTexto;
    
    public Componentes(){
        // instanciamos todas as compoñentes GUI
        marco = new JFrame(" Ventana con componentes ");
        panel = new JPanel ();
        boton = new JButton(" BOTON ");
        etiqueta = new JLabel();
        liñaTexto = new JTextField(" texto por defecto ");
        // dámoslle caracteristicas  as compoñentes 
        //tamaño
        marco.setSize(600,400);
        panel.setBounds(0, 0, 600,400);
        panel.setBackground(Color.red);
        etiqueta.setText(" NOME ");
        
        // engadimos as compoñentes ao panel 
        panel.add(etiqueta);
        panel.add(liñaTexto);
        panel.add(boton);
        // engadimos o panel ao marco
        marco.add(panel);
           
        
        marco.setDefaultCloseOperation(0);
        
        // facemos visible a ventana
        marco.setVisible(true);
        
        
        
        
        
        
    }
    
}
