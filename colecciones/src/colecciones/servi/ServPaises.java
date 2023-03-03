/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.servi;

import colecciones.servi.Entidades.Paises_5;
import colecciones.servi.Entidades.utilidades.comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author PC01
 */
public class ServPaises {

    Set<Paises_5> listaP;
    Set<String> listaIterator;
    Scanner l;

    public ServPaises() {
        this.listaP = new HashSet();
        this.listaIterator = new HashSet();
        this.l = new Scanner(System.in);
    }

    public void crearLista() {

        Paises_5 e = new Paises_5();
       
        boolean salir = false;
        do {
            System.out.println("ingresar un pais");
            String pais = l.next();
            listaP.add(new Paises_5(pais));
            listaIterator.add(pais);
            System.out.println("agregar otro pais? s) si  n) no");
            String leer = l.next();
            if (leer.equals("s")) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir == true);
        System.out.println("Lista ingresada: ");
        for (Paises_5 aux : listaP) {
            System.out.println(aux);
        }
    }

    public void mostrarListaOrdenada() {
        ArrayList<Paises_5> paisesLista = new ArrayList(listaP);
        Collections.sort(paisesLista, comparadores.ordenarPaises);
        System.out.println("Lista ordenada alfabeticamente");
        for (Paises_5 aux : paisesLista) {
            System.out.println(aux);
        }
    }
    public void eliminarPais(){
        

        Iterator <String> it = listaIterator.iterator();
        System.out.println("ingresar un pais a eliminar");
        String eliminado = l.next();
        int contador = 0;
        while (it.hasNext()) {            
            String a = it.next();
            if (a.equals(eliminado)) {
                it.remove();
                contador++;
            }
        }
        if (contador == 1) {
            System.out.println("el pais  se encontro enla lista");
        }else{
                    System.out.println("el pais NO se encontro enla lista");

        }
         for (String aux : listaIterator) {
            System.out.println(aux);
        }
    }

}
