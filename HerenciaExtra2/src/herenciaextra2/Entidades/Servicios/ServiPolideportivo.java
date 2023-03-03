/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra2.Entidades.Servicios;

import herenciaextra2.Entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
    
public class ServiPolideportivo {
    Scanner l;
   
    public ServiPolideportivo() {
    this.l = new Scanner(System.in).useDelimiter("\n");
    
    }
    public Polideportivo crearPoli(){
        Polideportivo p = new Polideportivo();
        System.out.println("POLIDEPORTIVO");
        System.out.print("Nombre: ");
        p.setNombre(l.next());
        System.out.print("Alto: ");
        p.setAlto(l.nextDouble());
        System.out.println("Ancho: ");
        p.setAncho(l.nextDouble());
        System.out.println("Largo: ");
        p.setLargo(l.nextDouble());
        System.out.println("Techado?: ");
        String techado = l.next();
        if (techado.equalsIgnoreCase("si")) {
            p.setTechado(true);
        }else{
            p.setTechado(false);
        }
        return p;
    }
}
