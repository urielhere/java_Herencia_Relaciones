/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.JugadorRuleta;
import Entidades.revolverDeAgua;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el
 * juego se trata de un número de jugadores, que, con un revolver de agua, el
 * cual posee una sola carga de agua, se dispara y se moja. Las clases por hacer
 * del juego son las siguientes: Clase Revolver de agua: esta clase posee los
 * siguientes atributos: posición actual (posición del tambor que se dispara,
 * puede que esté el agua o no) y posición agua (la posición del tambor donde se
 * encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 * Métodos: • llenarRevolver(): le pone los valores de posición actual y de
 * posición del agua. Los valores deben ser aleatorios. • mojar(): devuelve true
 * si la posición del agua coincide con la posición actual • siguienteChorro():
 * cambia a la siguiente posición del tambor • toString(): muestra información
 * del revolver (posición actual y donde está el agua) Clase Jugador: esta clase
 * posee los siguientes atributos: id (representa el número del jugador), nombre
 * (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si
 * está mojado o no el jugador). El número de jugadores será decidido por el
 * usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto
 * será 6. Métodos: • disparo(Revolver r): el método, recibe el revolver de agua
 * y llama a los métodos de mojar() y siguienteChorro() de Revolver. El jugador
 * se apunta, aprieta el gatillo y si el revolver tira el agua, el jugador se
 * moja. El atributo mojado pasa a false y el método devuelve true, sino false.
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver Métodos: • llenarJuego(ArrayList<Jugador>jugadores,
 * Revolver r): este método recibe los jugadores y el revolver para guardarlos
 * en los atributos del juego.
 *
 * 10 • ronda(): cada ronda consiste en un jugador que se apunta con el revolver
 * de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja
 * y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que
 * uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe
 * mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto,
 * usando los atributos de la clase Juego.
 *
 * @author PC01
 */
public class serviRuleta {

    revolverDeAgua r;
    JugadorRuleta j;
    Scanner l;
    int contador = 0;
    int contadorJ = 0;
    List<JugadorRuleta> listaJ;

    public serviRuleta() {
        this.r = new revolverDeAgua();
        this.j = new JugadorRuleta();
        this.l = new Scanner(System.in);
        this.listaJ = new ArrayList();
    }

    public void menu() throws InterruptedException {
        boolean salir = false;
        System.out.println("RULETA DE AGUA");
        System.out.println("ingresar la cantided de jugadores");
        int cantJ = l.nextInt();
        boolean cargado = true;
        do {
            if (cargado == false) {
                System.out.println("intentar nuevamente");
                System.out.print("cantidad de jugadores: ");
                cantJ = l.nextInt();
                System.out.println("");
            }
            cargado = crearJugador(cantJ);
        } while (cargado == false);
        mostradoJugadores();
        do {
            System.out.println("COMIENZA EL JUEGO");
            llenarRevolver();
            disparo();
            System.out.println("deseas salir? s/n");
            String s = l.next();
            if (s.equalsIgnoreCase("s")) {
                salir = true;
            }
        } while (salir == false);
    }

    ;
    public boolean crearJugador(int ju) {
        if (ju > 6 || ju <= 0) {
            System.out.println("la cantidad de jugadores ingresada es incorrecta");
            return false;
        } else {
            for (int i = 0; i < ju; i++) {
                System.out.println("ingresar el nombre del jugador (" + (i + 1) + ")");
                j.setNombre(l.next());

                j.setId(i + 1);

                listaJ.add(new JugadorRuleta(j.getId(), j.getNombre(), false));
            }
            return true;
        }

    }

    ;
    
    public void llenarRevolver() throws InterruptedException  {
        System.out.print("llenando revolver");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }

        System.out.println("");
        r.setPosicionAtual(random() * 6 + 1);
        r.setEposicionAgua(random() * 6 + 1);
        System.out.println("revolver lleno ");

    }

    public boolean mojar() {
        if ((int) r.getEposicionAgua() == (int) r.getPosicionAtual()) {
            return true;
        } else {
            return false;
        }
    }

    public void siguienteChorro() {
        for (int i = (int) r.getPosicionAtual(); i < 6; i++) {
            if (i == 5) {
                i = 0;
            }
            r.setPosicionAtual(i + 1);
            break;
        }

    }

    public void disparo() throws InterruptedException {

        int contador = 0;
        System.out.println("ingresar el nombre del jugador que empieza ");
        String nombre = l.next();
        for (int i = 0; i < listaJ.size(); i++) {
            if (listaJ.get(i).getNombre().equals(nombre)) {
                contador++;
                int j = (int) r.getPosicionAtual();
                for (int m = 0; m < (int)r.getEposicionAgua(); m++) {
                    
                    if (contador > 1) {
                        System.out.println("ingresar el nombre del jugador que sigue ");
                        nombre = l.next();
                    }

                    System.out.println("disparo : " + (contador ));
                    mostradoPosiciones();
                    if (mojar() == true) {
                        System.out.println("te dieron el tiro!!!");

                        for (int k = 0; k < listaJ.size(); k++) {
                            if (listaJ.get(k).getNombre().equals(nombre)) {
                                listaJ.get(k).setMojado(true);

                                System.out.println("quedaste mojado:(");
                                m = (int) r.getEposicionAgua();
                            }
                        }
                    } else {
                        System.out.println("te salvaste");
                        contador++;
                    }

                }
            }
        }

    }

    public void mostradoPosiciones() {
        System.out.println("------------------------------------------");
        System.out.println("posicion agua: " + (int) r.getEposicionAgua());
        System.out.println("posicion actual: " + (int) r.getPosicionAtual());
        System.out.println("------------------------------------------");
    }

    public void mostradoJugadores() {
        System.out.println("-------------------------");
        System.out.println("JUGADORES INGRESADOS   ");
        for (JugadorRuleta jugadorRuleta : listaJ) {
            System.out.println(jugadorRuleta);
        }
        System.out.println("-------------------------");

    }
}
