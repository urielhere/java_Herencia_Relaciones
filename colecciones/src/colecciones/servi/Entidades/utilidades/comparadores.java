/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.servi.Entidades.utilidades;

import colecciones.servi.Entidades.Paises_5;
import colecciones.servi.Entidades.Peliculas_4;
import java.util.Comparator;

/**
 *
 * @author PC01
 */
public class comparadores {

    public static Comparator<Peliculas_4> ordenarPorDuracionDes = new Comparator<Peliculas_4>() {
        @Override
        public int compare(Peliculas_4 t, Peliculas_4 t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };
    public static Comparator<Peliculas_4> ordenarPorDuracionAscen = new Comparator<Peliculas_4>() {
        @Override
        public int compare(Peliculas_4 t, Peliculas_4 t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }

    };
    public static Comparator<Peliculas_4> ordenarPorDirectorAZ = new Comparator<Peliculas_4>() {
        @Override
        public int compare(Peliculas_4 t, Peliculas_4 t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }

    };
    public static Comparator<Peliculas_4> ordenarPorDirectorZA = new Comparator<Peliculas_4>() {
        @Override
        public int compare(Peliculas_4 t, Peliculas_4 t1) {
            return t1.getDirector().compareTo(t.getDirector());
        }

    };
    public static Comparator<Peliculas_4> ordenarPorTituloAZ = new Comparator<Peliculas_4>() {
        @Override
        public int compare(Peliculas_4 t, Peliculas_4 t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }

    };
    public static Comparator<Paises_5> ordenarPaises = new Comparator<Paises_5>() {

        @Override
        public int compare(Paises_5 t, Paises_5 t1) {
            return t.getPais().compareTo(t1.getPais());
        }
    
    };
}
