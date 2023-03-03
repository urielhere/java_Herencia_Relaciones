/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
 * @author PC01
 */

public class Televisor extends Electrodomestico {
    protected int  resolucion;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("RESOLUCION(en pulgadas)");
        setResolucion(l.nextInt());
        System.out.println("TDT? s/n");
        String respuesta = l.next();
        if (respuesta.toLowerCase().equalsIgnoreCase("si")) {
            setTDT(true);
        } else {
            setTDT(false);
        }
    }
/*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    @Override
    public void precioFinal(char c, double p) {
        super.precioFinal(c, p); //To change body of generated methods, choose Tools | Templates.
        if(getResolucion()> 40){
            setPrecio(getPrecio()+((30*getPrecio())/100));
        }
        if(isTDT() == true){
            setPrecio(getPrecio()+500);
        }
        System.out.println("Precio final Televisor:"+getPrecio());

    }
    

    
    
    
}
