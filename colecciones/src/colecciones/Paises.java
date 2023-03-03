/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import colecciones.servi.ServPaises;

/**
 *
 * @author PC01
 */
public class Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServPaises sv = new ServPaises();
        sv.crearLista();
       sv.mostrarListaOrdenada();
       sv.eliminarPais();
    }
    
}
