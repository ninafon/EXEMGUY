
package earrays;

import java.util.Arrays;


public class Metodos {
    public void crearArray(int []lista){
        for(int i=0;i< lista.length;i++)
            lista[i]=PedirDatos.pedirInt("numero ");
    }
     public void amosar(int[]lista,int tamano){
        for(int i=0;i<tamano;i++)
            System.out.println(lista[i]); 
        
    }
    public int buscarElemento(int []lista, int elemento){
        int atopado =0; //non esta
        int indice=0;
        for(int i =0;i<lista.length;i++){
            if(lista[i]== elemento){
               indice = i;             
                atopado = 1;
            }    
        }
        if(atopado ==0){
            System.out.println(elemento +"non esta na lista");
            return -1;
        }
        else {
            System.out.println(elemento + "  esta na lista");
        
            return indice;
        }
    }
    public void borrar(int[]lista,int elemento){
        int atopado= buscarElemento(lista,elemento);
        if (atopado!=-1){
            for(int i = atopado;i<lista.length-1;i++)
                lista[i]=lista[i+1];
            System.out.println(elemento +"borrado da lista");
            EArrays.tam --;
        }
        else
            System.out.println(elemento +" non esta na lista");
        
    }
    
    public void sair(){
        System.exit(0);
    }
    public void ordenar(int[]lista){
        Arrays.sort(lista);
    }
    
    
    
    
   /*  
    public Xogador[] encherArray(Xogador[]lista){
        for(int i =0;i< lista.length;i++){
            lista[i]= new Xogador(PedirDatos.pedirString("nome"),PedirDatos.pedirInt("dorsal : "));
        }
        return lista;
    }
    public void ver(Xogador[]lista){
        for(int i=0;i< lista.length;i++){            
            System.out.println( lista [i]);
        }
        
    }
    public void ordenar(Xogador[]lista){
        Arrays.sort(lista);
    }*/
    
 
}
