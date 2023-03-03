/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenaciaextra1.Servicios;

import herenaciaextra1.Entidades.Alquiler;
import herenaciaextra1.Entidades.Barco;
import herenaciaextra1.Entidades.Veleros;
import herenaciaextra1.Entidades.barcoAMotor;
import herenaciaextra1.Entidades.yatesDeLujo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 *
 * @author PC01
 */
public class serviAlquiler extends Alquiler {

    Scanner l;
    Alquiler a;
    Barco bc;
    Veleros vel;
    barcoAMotor bam;
    yatesDeLujo ydl;
    public String tipoBarco;

    public serviAlquiler() {
        this.a = new Alquiler();
        this.l = new Scanner(System.in).useDelimiter("\n");
        this.bc = new Barco();
        this.vel = new Veleros();
        this.bam = new barcoAMotor();
        this.ydl = new yatesDeLujo();
    }

    /*
    String nombre;
     int documento;
     LocalDate fechaAlquiler;
     LocalDate fechaDevolucion;
     String posicionAmarre;
     Barco barco
     */
    public void crearAlquiler() throws ParseException {
        System.out.print("Nombre: ");
        a.setNombre(l.next());
        System.out.print("\nDocumento: ");
        a.setDocumento(l.nextInt());
        System.out.print("\nFecha del Alquiler: ");
        String fechaString = l.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");
        Date date = formatter.parse(fechaString);
        a.setFechaAlquiler(date);
        System.out.print("\nFecha de Devolucion: ");
        String fechaString1 = l.next();
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/M/yyyy");
        Date date1 = formatter1.parse(fechaString1);
        a.setFechaDevolucion(date1);
        System.out.print("\nPosicion Amarre (Alto|Medio|Bajo): ");
        a.setPosicionAmarre(l.next());
        System.out.print("\ntipo de barco(Comun|Velero|A Motor|Yate De Lujo): ");
        tipoBarco = l.next();
        switch (tipoBarco.toLowerCase()) {
            case "comun":
                comun();
                mostrado(bc);

                break;
            case "velero":
                velero();
                mostrado(vel);

                break;
            case "a motor":
                aMotor();
                mostrado(bam);
                break;
            case "yate de lujo":
                yateDeLujo();
                mostrado(ydl);
                break;
            default:
                System.out.println("la opcion ingresada no se encuentra en la lista");

        }
        calcularAlquiler(tipoBarco);
    }

    /*
     protected String matricula;
    protected int eslora;
    protected LocalDate añoDeFabricacion;
     */
    public void comun() throws ParseException {
        System.out.println("\nComun");
        System.out.print("\nAño de fabricacion del barco: ");
        String fechaString = l.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");
        Date date = formatter.parse(fechaString);
        bc.setAñoDeFabricacion(date);
        System.out.print("Matricula: ");
        bc.setMatricula(l.next());
        System.out.print("Eslora: ");
        bc.setEslora(l.nextInt());
        a.setNombreBarco("Comun");
        a.setBarco(bc);
    }

    public void velero() throws ParseException {
        System.out.println("\nVelero");
        System.out.print("\nAño de fabricacion del barco: ");
        String fechaString = l.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");
        Date date = formatter.parse(fechaString);
        vel.setAñoDeFabricacion(date);
        System.out.print("Matricula: ");
        vel.setMatricula(l.next());
        System.out.print("Eslora: ");
        vel.setEslora(l.nextInt());
        System.out.print("Cantidad Mastiles: ");
        vel.setMastiles(l.nextInt());
        a.setNombreBarco("Velero");
        a.setBarco(vel);
    }

    public void aMotor() throws ParseException {
        System.out.println("\nA Motor");
        System.out.print("\nAño de fabricacion del barco: ");
        String fechaString = l.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");
        Date date = formatter.parse(fechaString);
        bam.setAñoDeFabricacion(date);
        System.out.print("Matricula: ");
        bam.setMatricula(l.next());
        System.out.print("Eslora: ");
        bam.setEslora(l.nextInt());
        System.out.print("Potencia en CV: ");
        bam.setPotenciaCv(l.nextInt());
        a.setNombreBarco("A Motor");
        a.setBarco(bam);
    }

    public void yateDeLujo() throws ParseException {
        System.out.println("\nYate De Lujo");
        System.out.print("\nAño de fabricacion del barco: ");
        String fechaString = l.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");
        Date date = formatter.parse(fechaString);
        ydl.setAñoDeFabricacion(date);
        System.out.print("Matricula: ");
        ydl.setMatricula(l.next());
        System.out.print("Eslora: ");
        ydl.setEslora(l.nextInt());
        System.out.print("Potencia en CV: ");
        ydl.setPotenciaCv(l.nextInt());
        System.out.print("Numero de Camarotes: ");
        ydl.setNumeroCamarotes(l.nextInt());
        a.setNombreBarco("Yate De Lujo");
        a.setBarco(ydl);
    }

//    public void ClearConsole() {
//        // Imprime 50 saltos de línea para limpiar la pantalla
//        for (int i = 0; i < 50; i++) {
//            System.out.println("\n");
//        }
//        // Continúa con el resto del programa
//       
//    }
    public void mostrado(Barco b) {

        if (b == bc) {
            System.out.println(a.toString());
            System.out.println(bc.toString());
        } else {
            System.out.println(a.toString());
            System.out.println("Matricula: " + b.getMatricula());
            System.out.println("Eslora: " + b.getEslora());
            System.out.println("Año De Fabricacion: " + b.getAñoDeFabricacion());
            System.out.println(b.toString());
        }

    }

    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/
 /*En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
    public void calcularAlquiler(String tipoBarco) {
        long dias;
        long modulo;
        long alquiler = 0;
        Date fechaInicio0 = a.getFechaAlquiler();
        LocalDate fechaInicio = fechaInicio0.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date fechaDevolucion0 = a.getFechaDevolucion();
        LocalDate fechaDevolucion = fechaDevolucion0.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        dias = ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);

        switch (tipoBarco.toLowerCase()) {
            case "comun":
                modulo = (bc.getEslora() * 10);
                alquiler = dias * modulo;
                break;
            case "velero":
                modulo = (vel.getEslora() * 10);
                alquiler = ((dias * modulo) + vel.getMastiles());
                break;
            case "a motor":
                modulo = (bam.getEslora() * 10);
                alquiler = ((dias * modulo) + bam.getPotenciaCv());
                break;
            case "yate de lujo":
                modulo = (ydl.getEslora() * 10);
                alquiler = ((dias * modulo) + ydl.getPotenciaCv() + ydl.getNumeroCamarotes());
                break;
            default:
                System.out.println("la opcion ingresada no se encuentra en la lista");
        }
        
        System.out.println("Alquiler: "+alquiler);
    }
}
