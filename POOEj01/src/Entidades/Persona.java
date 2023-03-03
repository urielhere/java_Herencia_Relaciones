/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author PC01
 */
public class Persona {

    public String nombre;
    public int edad;
    public int documento;

    public Persona() {
    }

    public Persona(String nombre, int edad, int documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

   
    public void Mostrado(){
        System.out.println(getNombre());
        System.out.println(getDocumento());
        System.out.println(getEdad());
    }
 
}
