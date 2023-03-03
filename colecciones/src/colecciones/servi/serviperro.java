/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.servi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * @author PC01
 *
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 */
public class serviperro {

    public void crearPerros() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList();

        String salir = "n";
        while (salir.equals("n")) {
            System.out.println("ingresar una raza de perro");
            perros.add(leer.next());
            System.out.println("salir? s) si n) no");
            salir = leer.next();
        }
        for (String aux : perros) {
            System.out.print(aux + " ");
        }
        System.out.println("");
        System.out.println("ingresar un perro a eliminar");
        String perE = leer.next();
        Iterator<String> it = perros.iterator();
        boolean esta = false;
        while (it.hasNext()) {

            if (it.next().equals(perE)) {
               esta = true;
            }

        }
        if (esta) {
            perros.remove(perE);
        } else {
            System.out.println("el perro no se encontro en la lista");
        }
        Collections.sort(perros);
        for (String aux : perros) {
            System.out.print(aux + " ");
        }
        System.out.println("");
    }
}
