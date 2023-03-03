/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author PC01
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("fatiga", "carne vaca", 4, "pitbull");
        perro1.mostrado();
        Animal perro2 = new Perro("ulises", "todo", 15, "obejero aleman");
        perro2.mostrado();
        Animal gato = new Gato("puchi", "gatchau", 5, "siames");
        gato.mostrado();
        Animal caballo = new Caballo("pepe", "comida", 6, "mapuche");
        caballo.mostrado();
    }
    
}
