/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.servi.Entidades.Persona;


/**
 *
 * @author PC01
 */
public class personaMain {

    /**
     * Realiza un programa en donde una clase Persona tenga como atributo
     * nombre, apellido y un objeto de clase Dni. La clase Dni tendrá como
     * atributos la serie (carácter) y número. Prueba acceder luego a los
     * atributos del dni de la persona creando objetos y jugando desde el main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("juan");
        p.setApellido("andrade");
        p.dni.setSerie('j');
        p.dni.setNumero(45718024);
        System.out.println( p.toString());
    }

}
