/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class serviPersonaPerro {

    Scanner leer;
    List<Persona> listaPersona;
    List<Perro> listaPerro;

    public serviPersonaPerro() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPersona = new ArrayList();
        this.listaPerro = new ArrayList();
    }

    public void crear() {
        boolean salir = false;

        do {
            System.out.println("(1)crear persona(2)crear perro (3)adoptar perro(4)mostrado");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    crearPerro();
                    break;
                case 3:
                    adoptarPerro();
                    break;
                case 4:
                    mostrado();
                    break;
                default:
                    System.out.println("la opcion ingresada no coincide ");
            }
            System.out.println("deseas continuar? s/n");
            String ss = leer.next();
            if (ss.equals("s")) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir == true);

    }

    public Persona crearPersona() {
        Perro mascota = null;
//        System.out.println("ingresar el nombre de la persona");
//        String nombre = leer.next();
//        System.out.println("ingresar el apellido de la persona");
//        String apellido = leer.next();
//        System.out.println("ingresar la edad ");
//        Integer edad = leer.nextInt();
//        System.out.println("ingresar el documento");
//        Integer documento = leer.nextInt();
//        System.out.println("ingresar el nombre de la mascota ");
//        String nombreM = leer.next();
//        if (listaPerro.isEmpty()) {
//            System.out.println("no hay mascotas cargadas");
//            mascota = null;
//        } else {
//            for (int i = 0; i < listaPerro.size(); i++) {
//                if (listaPerro.get(i).getNombre().equals(nombreM)) {
//                    mascota = listaPerro.get(i);
//
//                }
//            }
//
//        }
        listaPersona.add(new Persona("noelia", "gallo", 27, 46511315, null));
        listaPersona.add(new Persona("camello", "zapata", 27, 674646843, null));
//        listaPersona.add(new Persona(nombre, apellido, edad, documento, mascota));
        return null;
    }

    public Perro crearPerro() {
//        System.out.println("ingresar nombre de la mascota");
//        String nombre = leer.next();
//        System.out.println("ingresar raxa de la mascota");
//        String raza = leer.next();
//        System.out.println("ingresar edad de la mascota");
//        Integer edad = leer.nextInt();
//        System.out.println("ingresar tamaño de la mascota");
//        Double tamaño = leer.nextDouble();
        listaPerro.add(new Perro("pelota", "socrates", 42, 63.0));
        listaPerro.add(new Perro("zapallo", "manola", 105, 1.6));

//        listaPerro.add(new Perro(nombre, raza, edad, tamaño));
//        return new Perro(nombre, raza, edad, tamaño);
        return null;
    }

    public void adoptarPerro() {
        Perro mascota = null;
        System.out.println("ingresar el nombre de la mascota ");
        String nombreM = leer.next();
        System.out.println("ingresar el nombre del nuevo dueño");
        String persona = leer.next();
        if (listaPerro.isEmpty()) {
            System.out.println("la lista de mascotas se encuentra vacia");

        } else if (listaPersona.isEmpty()) {
            System.out.println("la lista de personas se encuentra vacia");
        } else {
            for (int i = 0; i < listaPerro.size(); i++) {
                if (listaPerro.get(i).getNombre().equals(nombreM)) {
                    mascota = listaPerro.get(i);

                }
            }
            for (int i = 0; i < listaPersona.size(); i++) {
                if (listaPersona.get(i).getNombre().equals(persona)) {
                    listaPersona.get(i).setMascota(mascota);
                    
                }
            }
            for (int i = 0; i < listaPerro.size(); i++) {
                if (listaPerro.get(i).getNombre().equalsIgnoreCase(nombreM)) {
                    listaPerro.remove(listaPerro.get(i));
                }
            }
            System.out.println("perro adoptado :)");
        }

    }

    public void mostrado() {
        System.out.println("Personas");
        System.out.println("");
        for (Persona persona : listaPersona) {
            System.out.println(persona);
        }
        System.out.println("-------------------");
        System.out.println("Perros");
        System.out.println("");
        for (Perro persona : listaPerro) {
            System.out.println(persona);
        }
        System.out.println("-------------------");

    }
}
