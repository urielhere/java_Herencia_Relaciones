/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4.Entidades;

import herencia4.Entidades.Interfaces.calculoFormas;

/**
 *Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 * @author PC01
 */
public class rectangulo implements calculoFormas {
    double base;
    double altura;

    public rectangulo() {
    }

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return getBase()*getAltura();
    }

    @Override
    public double perimetro() {
        return (getBase()+getAltura())*2;
    }
    
}
