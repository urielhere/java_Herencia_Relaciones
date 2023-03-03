
import Entidades.Electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package Entidades;

/**
 *
 * @author PC01
 */
public class Lavadora extends Electrodomestico {

    public ArrayList<Lavadora> listaLavadoras = new ArrayList();

    int carga;
    public int totalLavadora = 0;
    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "Carga: ";

    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    public void crearLavadora() {
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico("BLACO", 'A', 62.8);
        setCarga(14);
        listaLavadoras.add(new Lavadora(getCarga(), getPrecio(), getColor(), getConsumoEnergetico(), getPeso()));
        crearElectrodomestico("gris", 'B', 17d);
        setCarga(31);
        listaLavadoras.add(new Lavadora(getCarga(), getPrecio(), getColor(), getConsumoEnergetico(), getPeso()));
        crearElectrodomestico("azul", 'C', 14d);
        setCarga(29);
        listaLavadoras.add(new Lavadora(getCarga(), getPrecio(), getColor(), getConsumoEnergetico(), getPeso()));
        crearElectrodomestico("rojo", 'D', 15d);
        setCarga(30);
        listaLavadoras.add(new Lavadora(getCarga(), getPrecio(), getColor(), getConsumoEnergetico(), getPeso()));
        System.out.println("LAVADORAS");
        for (Lavadora listaLavadora : listaLavadoras) {
            System.out.print(listaLavadora.toString() + listaLavadora.getCarga()+" ");
            precioFinal(listaLavadora.getConsumoEnergetico(), listaLavadora.getPeso());
            totalLavadora += getPrecio();
            System.out.println("");
        }
        System.out.println("total lavadoras: "+ totalLavadora);
    }

    ;
    @Override
    public void precioFinal(char c, double p) {
        super.precioFinal(c, p);
        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500);
        }
        System.out.println("Precio final :" + getPrecio());
    }

}
