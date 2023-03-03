/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidades.Persona;

/**
 *
 * @author PC01
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona primerPersona = new Persona();
      Persona segundaPersona = new Persona("uriel",18,45718024);
      
      primerPersona.getNombre();
      segundaPersona.setNombre("dardo");
      segundaPersona.setEdad(20);
      segundaPersona.setDocumento(44718024);
      segundaPersona.Mostrado();
    }
    
    
}
