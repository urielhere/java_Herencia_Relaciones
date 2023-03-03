/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejpractico;

import herenciaejpractico.Interfaz.primerInterfaz;
import java.util.ArrayList;

/**
 *
 * @author PC01
 */
public class NewMain  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Animal1> animales = new ArrayList();
       Animal1 a = new Animal1();
       Animal1 b = new Perro();
       Animal1 c = new Gato();
       animales.add(a);
       animales.add(b);
       animales.add(c);
       
        for (Animal1 animale : animales) {
          animale.hacerRuido();
        }
        a.saludar();
    }

   
    
}
