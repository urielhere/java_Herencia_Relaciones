/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4.Entidades;

import herencia4.Entidades.Interfaces.calculoFormas;

/**
 *Se plantea desarrollar un programa que nos permita calcular el área y el
     * perímetro de formas geométricas, en este caso un círculo y un rectángulo.
     * Ya que este cálculo se va a repetir en las dos formas geométricas, vamos
     * a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos
     * para calcular el área, el perímetro y el valor de PI como constante.
     * Desarrollar el ejercicio para que las formas implementen los métodos de
     * la interfaz y se calcule el área y el perímetro de los dos. En el main se
     * crearán las formas y se mostrará el resultado final. Área circulo: PI *
     * radio ^ 2 / Perímetro circulo: PI * diámetro. Área rectángulo: base *
     * altura / Perímetro rectángulo: (base + altura) * 2.
 * @author PC01
 */
public class ciculo implements calculoFormas{
    double radio;
    double diametro;

    public ciculo() {
    }

    public ciculo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double area() {
       return Math.pow((getRadio()), 2)*Pi;
               
    }

    @Override
    public double perimetro() {
        return Pi*getDiametro();
    }
    
    
}
