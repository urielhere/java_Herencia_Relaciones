/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia4.Entidades.ciculo;
import herencia4.Entidades.rectangulo;

/**
 *
 * @author PC01
 */
public class Herencia4 {

    /**
     * Se plantea desarrollar un programa que nos permita calcular el área y el
     * perímetro de formas geométricas, en este caso un círculo y un rectángulo.
     * Ya que este cálculo se va a repetir en las dos formas geométricas, vamos
     * a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos
     * para calcular el área, el perímetro y el valor de PI como constante.
     * Desarrollar el ejercicio para que las formas implementen los métodos de
     * la interfaz y se calcule el área y el perímetro de los dos. En el main se
     * crearán las formas y se mostrará el resultado final. Área circulo: PI *
     * radio ^ 2 / Perímetro circulo: PI * diámetro. Área rectángulo: base *
     * altura / Perímetro rectángulo: (base + altura) * 2.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ciculo c = new ciculo(7, 4.5);
        rectangulo r = new rectangulo(9, 3);
        System.out.println("Area Circulo: "+ c.area());
        System.out.println("Perimetro Circulo: "+c.perimetro());
        System.out.println("Area Rectangulo: "+ r.area());
        System.out.println("Perimetro Rectangulo: "+r.perimetro());
    }

}
