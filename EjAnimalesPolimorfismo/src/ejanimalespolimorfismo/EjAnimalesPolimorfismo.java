
package ejanimalespolimorfismo;

import ejanimalespolimorfismo.Entidades.Gato;
import ejanimalespolimorfismo.Entidades.Perro;


public class EjAnimalesPolimorfismo {

 
    public static void main(String[] args) {
Gato g = new Gato("NARANJOSO", 4, true, 3,1000d );
Perro p = new Perro("BEAGLE", 4, true,13 , 1000d);


g.calcularEdad();
g.hacerRuido();
//Metodo propio del GATO
g.ronronear();


        System.out.println("--------------------------------");
    p.calcularEdad();
    p.hacerRuido();
    //Metodo propio del perro
    p.jugarEnParque(4);
    
    }
    
}
