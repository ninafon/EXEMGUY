
package exemgui;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.*;
   
public class EventosClaseAnonima {
     JFrame marco;
     JPanel panel;
     JButton bVerde,bAzul ;
     
     public EventosClaseAnonima(){

    
     marco = new JFrame (" marco con eventos ");
     marco.setSize(800,500);
     panel = new JPanel();
     panel.setSize(800,500);
     bVerde = new JButton (" VERDE ");
     bAzul = new JButton(" AZUL "); 
      
     bVerde.addActionListener(new ActionListener(){            

         @Override
         public void actionPerformed(ActionEvent e) {
              panel.setBackground(Color.GREEN);
         }
     });
     bAzul.addActionListener(new ActionListener (){
         
         public void actionPerformed(ActionEvent e){
             panel.setBackground(Color.BLUE);
         }      
      
     });
     panel.add(bVerde);
     panel.add(bAzul);
     marco.add(panel);
     
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     marco.setVisible(true);    
     
    
     } 
    
    
}
