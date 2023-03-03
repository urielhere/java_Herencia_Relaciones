/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.servi;

import colecciones.servi.Entidades.Peliculas_4;
import colecciones.servi.Entidades.utilidades.comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones:
 *
 * 22
 *
 * • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las
 * películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.
 *
 * @author PC01
 */
public class ServPeliculas {

    List<Peliculas_4> listaP = new ArrayList<Peliculas_4>();
    Scanner l = new Scanner(System.in).useDelimiter("\n");
    Peliculas_4 p = new Peliculas_4();

    public void crearPelicula() {
        boolean salir = false;
        listaP.add(new Peliculas_4("titanic", "lolalanda", 3));
        listaP.add(new Peliculas_4("la mona gimenez", "omero", 2));
        listaP.add(new Peliculas_4("tucuman", "miriam", 1));
        do {

            p.setDirector(null);
            p.setTitulo(null);
            p.setDuracion(0);

            System.out.println("ingresar el tirulo de la pelicula ");
            p.setTitulo(l.next());
            System.out.println("ingresar el director");
            p.setDirector(l.next());
            System.out.println("ingresar la duracion de la pelicula");
            p.setDuracion(l.nextInt());

            listaP.add(new Peliculas_4(p.getTitulo(), p.getDirector(), p.getDuracion()));

            System.out.println("crear otra pelicula? s) si  n) no");
            String leer = l.next();
            if (leer.equals("s")) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir == true);

    }

    /*
    • Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    pantalla.
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public void mostrado() {
        System.out.println("Lista ingresada");
        for (Peliculas_4 aux : listaP) {
            System.out.println(aux);
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("peliculas con duracion superior a 1h");
        for (int i = 0; i < listaP.size(); i++) {
            if (listaP.get(i).getDuracion() > 1) {
                System.out.println(listaP.get(i));
            }
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("ordenandas por duracion mayor a menor");
        Collections.sort(listaP, comparadores.ordenarPorDuracionDes);
        for (Peliculas_4 x : listaP) {
            System.out.println(x);
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("ordenandas por duracion menor a mayor");
        Collections.sort(listaP, comparadores.ordenarPorDuracionAscen);
        for (Peliculas_4 x : listaP) {
            System.out.println(x);
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("ordenandas por director A - Z");
        Collections.sort(listaP, comparadores.ordenarPorDirectorAZ);
        for (Peliculas_4 x : listaP) {
            System.out.println(x);
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("ordenandas por director Z - A");
        Collections.sort(listaP, comparadores.ordenarPorDirectorZA);
        for (Peliculas_4 x : listaP) {
            System.out.println(x);
        }
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("ordenandas por titulo A - Z");
        Collections.sort(listaP, comparadores.ordenarPorTituloAZ);
        for (Peliculas_4 x : listaP) {
            System.out.println(x);
        }
    }
}
