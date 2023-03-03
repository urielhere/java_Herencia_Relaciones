/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2;

import herenciaextra2.Entidades.Edificio;
import herenciaextra2.Entidades.EdificioDeOficinas;
import herenciaextra2.Entidades.Servicios.ServiEdificioOficinas;
import herenciaextra2.Entidades.Servicios.ServiPolideportivo;
import java.util.ArrayList;

/**
 *
 * @author PC01
 */
public class HerenciaExtra2 {

    /**
     *  *Por último, en el main vamos a crear un ArrayList de tipo Edificio. El
     * ArrayList debe contener dos polideportivos y dos edificios de oficinas.
     * Luego, recorrer este array y ejecutar los métodos calcularSuperficie y
     * calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el
     * volumen de cada edificio. Además de esto, para la clase Polideportivo nos
     * interesa saber cuántos polideportivos son techados y cuantos abiertos. Y
     * para la clase EdificioDeOficinas deberemos llamar al método
     * cantPersonas() y mostrar los resultados de cada edificio de oficinas.
     *
     * @param args the command line arguments
     */
     

    public static void main(String[] args) {
        ArrayList<Edificio> estructuras = new ArrayList();
        ServiPolideportivo sp = new ServiPolideportivo();
        ServiEdificioOficinas se = new ServiEdificioOficinas();
        int cantT = 0;
        int techados = 0;
        for (int i = 0; i < 2; i++) {
            estructuras.add(se.crearEdificio());
            estructuras.add(sp.crearPoli());
        }
       
        for (int i = 0; i < 4; i++) {
           System.out.println(estructuras.get(i));
                System.out.println("superficie: " + estructuras.get(i).calcularSuperficie());
                System.out.println("volumen: " + estructuras.get(i).calcularVolumen());
        }
        /*  */
    }
    
}
