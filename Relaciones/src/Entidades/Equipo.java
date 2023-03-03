/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author PC01
 */
public class Equipo {
    public  ArrayList<Jugador>equipo = new ArrayList();

    public Equipo() {
    }

    @Override
    public String toString() {
        return "Equipo{" + "equipo=" + equipo + '}';
    }

   
    
}
