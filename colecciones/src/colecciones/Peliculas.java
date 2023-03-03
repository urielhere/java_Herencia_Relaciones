/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.servi.ServPeliculas;

/**
 *
 * @author PC01
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServPeliculas sv = new ServPeliculas();
        sv.crearPelicula();
        sv.mostrado();
    }
    
    
}
