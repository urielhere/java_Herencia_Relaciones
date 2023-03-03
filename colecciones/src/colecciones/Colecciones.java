/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        ArrayList<Integer> numerosA = new ArrayList();
//        int x = 20;
//        numerosA.add(x);
//        for (int i = 0; i < 9; i++) {
//            int k = (i + 1);
//            numerosA.add(k);
//
//        }
//        numerosA.remove(3); //elimina por elemento
//        numerosA.remove(0); // elimina por posicion
//        System.out.println("ArrayList: ");
//        for (Integer aux : numerosA) {
//            System.out.print(aux + " ");
//        }
//        System.out.println("");
//        HashSet<Integer> numerosB = new HashSet();
//        System.out.println("HashSet: ");
//        int y = 20;
//        numerosB.add(y);
//        System.out.println(numerosB);
//        for (int i = 0; i < 10; i++) {
//            int j = (i + 1);
//            numerosB.add(j);
//        }
//        numerosB.remove(3);
//        numerosB.remove(20);
//        for (Integer integer : numerosB) {
//            System.out.print(integer + " ");
//        }
//        System.out.println("");
//        HashMap<Integer, String> alumnos = new HashMap();
//        System.out.println("HashMap: ");
//        int dni = 45718024;
//        String numbreAlumno = "pepe";
//        alumnos.put(dni, numbreAlumno);
//        for (int i = 0; i < 10; i++) {
//            int o = (i + 1);
//            String z = "caca";
//            alumnos.put(o, z);
//        }
//        alumnos.remove(3);
//        alumnos.remove(4, "caca");
//        for (Map.Entry<Integer, String> aux : alumnos.entrySet()) {
//            Integer key = aux.getKey();
//            String value = aux.getValue();
//            System.out.println("key: " + key + " value: " + value);
//        }
        ArrayList<String> libros = new ArrayList();
        for (int i = 0; i < 4; i++) {
            System.out.println("libro : "+(i+1));
            String x = leer.next();
            libros.add(x);
        }
        for (String libro : libros) {
            System.out.println(libro);
        }
    }
}
