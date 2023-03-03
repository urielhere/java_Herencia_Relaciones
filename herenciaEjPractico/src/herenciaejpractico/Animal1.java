/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejpractico;

import herenciaejpractico.Interfaz.primerInterfaz;

/**
 *
 * @author PC01
 */
public class Animal1 implements primerInterfaz {
    protected void hacerRuido(){
        System.out.println("HOLA");
    }

    @Override
    public void saludar() {
        System.out.println("primera interfaz saludando");
    }
}
