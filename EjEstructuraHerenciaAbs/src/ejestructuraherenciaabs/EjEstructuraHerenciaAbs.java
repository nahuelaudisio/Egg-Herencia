/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejestructuraherenciaabs;

import ejestructuraherenciaabs.Entidades.CasaCampo;
import ejestructuraherenciaabs.Entidades.Edificio;
import ejestructuraherenciaabs.Entidades.Estructura;

/**
 *
 * @author nahue
 */
public class EjEstructuraHerenciaAbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estructura e1 = new CasaCampo(true, 1000d);
        e1.calcularSuperficie(10, 30);
        System.out.println(e1.getSuperficieCubierta() + " mt2");

        Estructura e2 = new Edificio(4, 300d);
        e2.calcularSuperficie(10, 30);
        System.out.println(e2.getSuperficieCubierta() + " mt2");
    }

}
