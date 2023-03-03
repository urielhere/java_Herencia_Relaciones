/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    Scanner l = new Scanner(System.in).useDelimiter("\n");
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    public void crearElectrodomestico() {
         setPrecio(1000);
        
        System.out.println("COLOR (BLANCO, NEGRO, ROJO, AZUL, GRIS)");
        comprobarColor(l.next());
        System.out.println("COMSUMO ENERGETICO (A) (B) (C) (D) (E) (F)");
        comprobarConsumoEnergetico(l.next().charAt(0));
        System.out.println("PESO");
        setPeso(l.nextDouble());
    }

    public void precioFinal(char c, double p) {
        switch (Character.toUpperCase(c)) {
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
        }
        if (p >= 1 && p <= 19) {
            setPrecio(getPrecio() + 100);
        } else if (p >= 20 && p <= 49) {
            setPrecio(getPrecio() + 500);
        } else if (p >= 50 && p <= 80) {
            setPrecio(getPrecio() + 800);
        } else {
            setPrecio(getPrecio() + 1000);
        }
        

    }

    public void comprobarColor(String color) {
        String[] colores = new String[5];
        colores[0] = "BLANCO";
        colores[1] = "NEGRO";
        colores[2] = "ROJO";
        colores[3] = "AZUL";
        colores[4] = "GRIS";
        setColor("BLANCO");
        for (int i = 0; i < 5; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                setColor(color);
            }
        }

    }

    public void comprobarConsumoEnergetico(char c) {
        char[] letras = new char[6];
        String palabra = "ABCDEF";

        for (int i = 0; i < 6; i++) {
            char x = palabra.charAt(i);
            letras[i] = x;
        }
        c = Character.toUpperCase(c);
        setConsumoEnergetico('F');
        for (char letra : letras) {
            if (letra == c) {
                setConsumoEnergetico(letra);
                break;
            }

        }
    }
}
