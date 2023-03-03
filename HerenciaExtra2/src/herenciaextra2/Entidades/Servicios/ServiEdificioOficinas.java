/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2.Entidades.Servicios;

import herenciaextra2.Entidades.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class ServiEdificioOficinas  {

    Scanner l;
    
    public ServiEdificioOficinas() {
        this.l = new Scanner(System.in).useDelimiter("\n");
    }
    
    /*De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
    public EdificioDeOficinas crearEdificio() {
        
        System.out.print("ingresar la cintidad de personas en una oficina: ");
        int cantdadP = l.nextInt();
        System.out.print("ingresar cantidad de oficinas por piso(minimo 1): ");
        int numeroO = l.nextInt();
        System.out.print("ingresar la cantidad de pisos de edificio: ");
        int cantidadPisos = l.nextInt();
        System.out.print("Ancho: ");
        double ancho = l.nextDouble();
        System.out.print("alto: ");
        double alto = l.nextDouble();
        System.out.print("largo: ");
        double largo = l.nextDouble();
         int personasPorPiso = cantdadP*numeroO; 
          int personasEnElEdificio = personasPorPiso * cantidadPisos;
       
        return new EdificioDeOficinas(numeroO,cantdadP ,cantidadPisos,personasPorPiso, personasEnElEdificio, ancho, alto, largo);
       
    }
  
    /*
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
    */
    
}
