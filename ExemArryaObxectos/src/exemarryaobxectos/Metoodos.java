
package exemarryaobxectos;

import java.util.Arrays;

public class Metoodos {
    
 
       
   public static int elementos(){
      
      return PedirDatos.pedirInt("numero de elementos: ");
   }
    public Xogador[] crearArray(Xogador[]xogadores){
      //  xogadores = new Xogador[elementos()];
        String nom;
        int dor;
        for(int i=0;i<xogadores.length;i++){
          nom=PedirDatos.pedirString(" nome : ");
          dor = PedirDatos.pedirInt("dorsal : ");
          xogadores[i]= new Xogador(nom,dor);  
 // xogadores[i]=new Xogad  or(PedirDatos.pedirString(),PedirDatos.pedirInt());          
                  
        }
         return xogadores; 
    }
    public void amosaArray(Xogador[]lista){
        for(Xogador elemento:lista)
            System.out.println(elemento);  
    }
    
    public void ordenarDorsal(Xogador[]lista){
        Arrays.sort(lista);
    }
    public void ordenarNome(Xogador[]lista){
        Arrays.sort(lista);
    }
    
    
}
