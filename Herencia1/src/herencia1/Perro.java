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
public class Perro extends Animal {
    protected String tipo = "Perro";

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        System.out.println(tipo);
    }

   
     
    
    
}
