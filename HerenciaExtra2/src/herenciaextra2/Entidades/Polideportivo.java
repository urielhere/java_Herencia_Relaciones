/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2.Entidades;

import herenciaextra2.Entidades.Servicios.SuperficieYVolumen;

/**
 *• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 * @author PC01
 */
public final class Polideportivo extends Edificio implements SuperficieYVolumen{
    String nombre ;
    boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void setLargo(double largo) {
        super.setLargo(largo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getLargo() {
        return super.getLargo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlto(double alto) {
        super.setAlto(alto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAlto() {
        return super.getAlto(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAncho(double ancho) {
        super.setAncho(ancho); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAncho() {
        return super.getAncho(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public double calcularVolumen() {
        return super.calcularVolumen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularSuperficie() {
        return super.calcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + '}';
    }

   
    
    
}
