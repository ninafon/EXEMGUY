
package exemgui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Componentes2 {
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    JTextField liñaTexto;
    
    public Componentes2(){
       // instanciamos todas as compoñentes GUI
        marco = new JFrame(" Ventana con componentes 2 ");
        panel = new JPanel ();
        boton = new JButton(" BOTON ");
        etiqueta = new JLabel();
        liñaTexto = new JTextField(" texto por defecto ");
        // dámoslle caracteristicas  as compoñentes 
        //tamaño
        marco.setSize(800,600);
        panel.setBounds(0, 0, 800,600);
        panel.setBackground(Color.red);
        etiqueta.setText(" NOME ");
        // anulamos o distribuidor de compoñentes
        marco.setLayout(null);
      
        
        // engadimos as compoñentes ao panel 
        panel.add(etiqueta);
          etiqueta.setBounds(200,100, 100, 50);
        panel.add(liñaTexto);
         liñaTexto.setBounds(400, 100, 150, 100);
        panel.add(boton);
          //poñemos os compoñentes nas coordenadas 
      
       
        boton.setBounds(600,200, 200,150);
        // engadimos o panel ao marco
        marco.add(panel);
           
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // facemos visible a ventana
        marco.setVisible(true);
        
           
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
