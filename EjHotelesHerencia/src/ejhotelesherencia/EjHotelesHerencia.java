/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejhotelesherencia;

import ejhotelesherencia.Entidades.Hotel;
import ejhotelesherencia.Entidades.Hotel1;
import ejhotelesherencia.Entidades.Hotel2;
import ejhotelesherencia.Entidades.Hotel3;
import ejhotelesherencia.Entidades.Hotel4;
import ejhotelesherencia.Entidades.Hotel5;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nahue
 */
public class EjHotelesHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
List <Hotel> hoteles = new ArrayList();
Hotel1 h1 = new Hotel1(1500d, 9d, 10);
Hotel2 h2 = new Hotel2(15030d, 12d, 15);
Hotel3 h3 = new Hotel3(15100d, 15d, 20);
Hotel4 h4 = new Hotel4(150320d, 20d, 25);
Hotel5 h5 = new Hotel5(1512300d, 30d, 50);


hoteles.add(h1);
hoteles.add(h2);
hoteles.add(h3);
hoteles.add(h4);
hoteles.add(h5);

        for (Hotel aux : hoteles) {
            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                System.out.println("Soy un hotel 5 estrellas");
                continue;
            }
            
              if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un hotel 4 estrellas");
                continue;
            }
                if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un hotel 3 estrellas");
                continue;
            }
                  if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un hotel 2 estrellas");
                continue;
            }
                    if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un hotel 1 estrellas");
                continue;
            }
        }
    }
    
}
