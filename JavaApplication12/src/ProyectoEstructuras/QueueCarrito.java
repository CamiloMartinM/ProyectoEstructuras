
package ProyectoEstructuras;

import ProyectoEstructuras.Implementaci√≥nEstructuras.Queue;

public class QueueCarrito {
    private static Queue carrito = new Queue();

    public static void setCarrito(Queue carro){
         QueueCarrito.carrito = carro;
     }
     
   public static  Queue getCarrito(){
         return carrito;
     }

}
