/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.servi.serviperro;

/**
 *
 * @author PC01
 */
public class NewMain {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       serviperro sv = new serviperro();
       sv.crearPerros();
    }
    
}
