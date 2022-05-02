/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejhotelesherencia.Entidades;

/**
 *
 * @author nahue
 */
public class Hotel1 extends Hotel {

    protected Double precio;
    protected Double superficie;
    protected boolean baño = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;

    public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(cantidadHabitaciones);
        this.precio = precio;
        this.superficie = superficie;
    }

}
