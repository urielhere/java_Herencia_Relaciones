/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Entidades.Equipo;
import Entidades.Jugador;

/**
 *
 * @author PC01
 */
public class mainJuagador {

    /**
     * Realiza un programa en donde exista una clase Jugador que contenga
     * nombre, apellido, posición y número. Luego otra clase Equipo que contenga
     * una colección de jugadores. Una vez hecho esto, desde el main
     * recorreremos el equipo mostrando la información de cada jugador.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Equipo j = new Equipo();

        j.equipo.add(new Jugador("mesi", "lol", "polas", 10));
        j.equipo.add(new Jugador("molas", "alejo", "puto", 8));

        for (Jugador jugador : j.equipo) {
            System.out.println(jugador);
        }
    }

}
