/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;


/**
 *
 * @author PC01
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();
        l.crearLavadora();
        l.precioFinal(l.getConsumoEnergetico(),l.getPeso());
        t.crearTelevisor();
        t.precioFinal(t.getConsumoEnergetico(), t.getPeso());
        
    }
    
}
