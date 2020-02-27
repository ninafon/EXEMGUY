
package exemarryaobxectos;


public class ExemArryaObxectos {

  
    public static void main(String[] args) {
         Xogador[] futbol = new Xogador[Metoodos.elementos()];
       Metoodos obx = new Metoodos();
      futbol= obx.crearArray(futbol);
       obx.amosaArray(futbol);
        System.out.println("** ordenado ***");
       //  obx.ordenarDorsal(futbol);
        obx.ordenarNome(futbol);
       obx.amosaArray(futbol);
    }
    
}
