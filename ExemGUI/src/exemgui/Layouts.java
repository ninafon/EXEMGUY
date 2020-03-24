
package exemgui;

import java.awt.*;
import javax.swing.*;

public class Layouts {
    
    JFrame marco;
    JPanel panel;
    JButton boton1,boton2,boton3,boton4,boton5;
    public Layouts(){
        marco = new JFrame("xanela Layouts");
        panel = new JPanel();
        boton1 = new JButton("boton 1 ");
        boton2= new JButton("boton 2");
        boton3= new JButton("boton 3");
        boton4= new JButton("boton 4");
        boton5= new JButton("boton 5");
    }
    public void distFlowLayout(){
        marco = new JFrame("xanela Layouts");
        panel = new JPanel();
        boton1 = new JButton("boton 1 ");
        boton2= new JButton("boton 2");
        boton3= new JButton("boton 3");
        boton4= new JButton("boton 4");
        boton5= new JButton("boton 5");
       
        
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setSize(600,300);
         
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        marco.setVisible(true);
         
    }
    public void DistBoxLayout(){
     
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setSize(600,300);
         
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        marco.setVisible(true); 
    }
    public void disBorderLayout(){
        panel.setLayout(new BorderLayout());
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.SOUTH);
        panel.add(boton3,BorderLayout.EAST);
        panel.add(boton4,BorderLayout.WEST);
        panel.add(boton5,BorderLayout.CENTER);
         marco.add(panel);
        marco.setSize(600,300);
         
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        marco.setVisible(true);
        
    }
    public void disGridLayout(){
        panel.setLayout(new GridLayout(2,3));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setSize(600,300);
         
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        marco.setVisible(true); 
        
    }  
}
