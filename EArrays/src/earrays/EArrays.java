
package earrays;

import javax.swing.JOptionPane;

public class EArrays {

   
       public static int tam = PedirDatos.pedirInt("tamaño :");
    public static void main(String[] args) {
      
        int opcion ;
         Metodos obx = new Metodos();
        int[]numeros = new int [tam];       
        do{
      opcion= Integer.parseInt(JOptionPane.showInputDialog(" *** MENU****\n 1 crear \n 2 amosar \n 3 buscar \n 4 borrar \n 5 ordenar\n 6 salir \n** teclea opcion"));
          
            
         switch(opcion){
             case 1 : obx.crearArray(numeros);
                      break;
             case 2 : obx.amosar(numeros, tam);
                     break;
             case 3 : obx.buscarElemento(numeros, PedirDatos.pedirInt("numero :"));
                     break;
             case 4 : obx.borrar(numeros, PedirDatos.pedirInt("numero a borrar"));
                     break;
             case 5 : obx.ordenar(numeros);
                      break;
             case 6 : obx.sair();
         }             
        
        }while(opcion!=6);
  /*      
     Xogador[]xogadores = new Xogador[4];
     
     xogadores= obx.encherArray(xogadores);
     obx.ver(xogadores);
     obx.ordenar(xogadores);
        System.out.println("*************************");
     obx.ver(xogadores);
     
    }*/
    
}
}