
package exemgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Eventos implements ActionListener{
    
JFrame marco;
 JPanel panel;
 JButton bVerde,bAzul ;
 
 public void crearEventos(){
     
     marco = new JFrame (" marco con eventos ");
     marco.setSize(800,500);
     panel = new JPanel();
     panel.setSize(800,500);
     bVerde = new JButton (" VERDE ");
     bAzul = new JButton(" AZUL ");             
     bVerde.addActionListener(this);
     bAzul.addActionListener(this);
     panel.add(bVerde);
     panel.add(bAzul);
     marco.add(panel);
     
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     marco.setVisible(true);    
     
   
     
 }

    @Override
    public void actionPerformed(ActionEvent e) {
    Object obx = e.getSource(); // que obxecto é  
    if(obx == bVerde)
       panel.setBackground(Color.GREEN);
    else 
        panel.setBackground(Color.BLUE);
    }
    
}
