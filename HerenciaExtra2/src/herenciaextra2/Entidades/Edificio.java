/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2.Entidades;

import herenciaextra2.Entidades.Servicios.SuperficieYVolumen;

/**
 *Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
 * @author PC01
 */
public  class Edificio implements SuperficieYVolumen {
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
/*Superficie Total = 2AB + 2BC + 2AC*/
    /*
    A= LARGO;
    B= ANCHO
    C = ALTO
    */
    @Override
    public double calcularSuperficie() {
        return (2*(getLargo()+getAncho()))+(2*(getAncho()+getAlto()))+(2*(getLargo()+getAlto()));
    }
/*Volumen = base x altura x profundidad*/
    @Override
    public double calcularVolumen() {
        return getAncho()*getLargo()*getAlto();
    }
    
    
}
