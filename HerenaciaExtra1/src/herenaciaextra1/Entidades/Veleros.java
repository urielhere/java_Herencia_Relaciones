/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenaciaextra1.Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
 * Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
 * fecha de devolución, la posición del amarre y el barco que lo ocupará. Un
 * Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación. Sin embargo, se pretende diferenciar la información de algunos
 * tipos de barcos especiales: • Número de mástiles para veleros. • Potencia en
 * CV para barcos a motor. • Potencia en CV y número de camarotes para yates de
 * lujo. Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 * @author PC01
 */
public class Veleros extends Barco{
    private int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles, String matricula, int eslora, Date añoDeFabricacion) {
        super(matricula, eslora, añoDeFabricacion);
        this.mastiles = mastiles;
    }
    
    

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    @Override
    public String getMatricula() {
        return matricula;
    }
    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public int getEslora() {
        return eslora;
    }
    @Override
    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
    @Override
    public Date getAñoDeFabricacion() {
        return añoDeFabricacion;
    }
    @Override
    public void setAñoDeFabricacion(Date añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }
    

    @Override
    public String toString() {
        return "mastiles: " + mastiles ;
    }

   
    
}
