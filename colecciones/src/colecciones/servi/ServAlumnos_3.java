/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.servi;

import colecciones.servi.Entidades.Alumnos3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @author PC01
 */
public class ServAlumnos_3 {

    Scanner leer = new Scanner(System.in);
    List<Alumnos3> alumnos = new ArrayList();
    List<Integer> not = new ArrayList();
    List<String> nom = new ArrayList();
    Alumnos3 a = new Alumnos3();

    public void crearAlumno() {
        boolean crear = false;

        do {
            System.out.println("ingresar nombre");
            nom.add(leer.next());
            a.setNombre(nom);
            for (int i = 0; i < 3; i++) {
                not.add(leer.nextInt());
            }
            a.setNotas(not);
            alumnos.add(a);

            System.out.println("");
            System.out.println("crear otro alumno? s) si  n) no");
            String aux = leer.next();
            if (aux.equals("s")) {
                crear = true;
            } else {
                crear = false;
            }
        } while (crear);
        int contador = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.print(nom.get(i) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(not.get(contador) + " ");
                contador++;
            }
            System.out.println("");
        }

    }

    public void notaFinal() {
        System.out.println("ingresar el alumno para calcular su nota final");
        String nombre = leer.next();       
       
        int notaF = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (nom.contains(nombre)) {

                System.out.println("el nombre se encontro en la lista");

                for (int j = (i ); j < (i + 3); j++) {
                    notaF += not.get(j);
                    System.out.println(not.get(j));
                }

                System.out.println("la nota final es de: " + notaF / 3);
                break;
            } else {
                System.out.println("no se encontro el nopmbre en la lista");

            }
            
        }

    }

}

