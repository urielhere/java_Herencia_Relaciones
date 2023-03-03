/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2.Entidades;

/**
 *• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 * @author PC01
 */
public final class EdificioDeOficinas extends Edificio {
    int numeroDeOficinas;
    int cantidadDePersonas;
    int numeroDePisos;
    int personasPorPiso;
    int personasEnEdificio;
    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int cantidadDePersonas, int numeroDePisos, int personasPorPiso, int personasEnEdificio, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
        this.numeroDePisos = numeroDePisos;
        this.personasPorPiso = personasPorPiso;
        this.personasEnEdificio = personasEnEdificio;
    }

    public int getPersonasPorPiso() {
        return personasPorPiso;
    }

    public void setPersonasPorPiso(int personasPorPiso) {
        this.personasPorPiso = personasPorPiso;
    }

    public int getPersonasEnEdificio() {
        return personasEnEdificio;
    }

    public void setPersonasEnEdificio(int personasEnEdificio) {
        this.personasEnEdificio = personasEnEdificio;
    }


    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
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
        return super.toString()
                +"\nPersonas por Piso: "+getPersonasPorPiso()
                +"\nPersonas en el Edificio: "+getPersonasEnEdificio();
                 //To change body of generated methods, choose Tools | Templates.
        
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


    
}
