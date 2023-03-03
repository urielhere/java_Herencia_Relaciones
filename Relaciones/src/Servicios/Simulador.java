package Servicios;

import entidades.Alumno;
import entidades.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Simulador {

    Scanner l;
    List<String> nombres;
    List<String> apellidos;
    List<Integer> dni;
    List<Alumno> listaA;
    List<Alumno> listaVotacion;
    HashMap<Alumno, HashSet> votacion;
    HashSet<String> facilitadores;
    String [] facilitadoresSuplentes;
    public Simulador() {
        this.nombres = new ArrayList();
        this.apellidos = new ArrayList();
        this.listaA = new ArrayList();
        this.dni = new ArrayList();
        this.l = new Scanner(System.in);
        this.listaVotacion = new ArrayList();
        this.votacion = new HashMap();
        this.facilitadores = new HashSet();
        this.facilitadoresSuplentes = new String[5];
    }

    public void crearPersona() {
        System.out.println("alumnos creados: 6");
        int cantidad = 6;
        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.add("Martin");
        nombres.add("Andi");
        nombres.add("German");
        nombres.add("Paola");
        apellidos.add("Fernandez");
        apellidos.add("Romero");
        apellidos.add("Herrera");
        apellidos.add("Andrade");
        apellidos.add("Villa Nueva");
        apellidos.add("Mercado");
        Collections.shuffle(nombres);
        Collections.shuffle(apellidos);

        for (int i = 0; i < cantidad; i++) {
            generadorDNI(cantidad);

            listaA.add(new Alumno(nombres.get(i), apellidos.get(i), dni.get(i), 0));
            listaVotacion.add(new Alumno(nombres.get(i), apellidos.get(i), dni.get(i), 0));
        }
        System.out.println("------------------------------------");

        for (Object aux : listaA) {
            System.out.println(aux);
        }
        System.out.println("------------------------------------");

        votacion(cantidad);
    }

    public void generadorDNI(int c) {
        int arreglo[] = new int[c];
        arreglo[0] = (int) (Math.random() * (100000000 - 10000000 + 1) + 10000000);//(Math.random()*(maximo-minimo+1)+minimo)
        for (int i = 1; i < c; i++) {
            arreglo[i] = (int) (Math.random() * (100000000 - 10000000 + 1) + 10000000);
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            dni.add(arreglo[i]);
        }

    }
    Voto v1 = new Voto();

    public void votacion(int c) {

        for (int i = 0; i < c; i++) {
            HashSet<String> axiliarVotados = new HashSet();
            Alumno aux2 = listaA.get(i);
            listaA.remove(listaA.get(i));
            int aux;
            do {
                aux = (int) (Math.random() * 4 + 1);
                if (!axiliarVotados.contains(listaA.get(aux).getNombre())) {
                    listaA.get(aux).setCantidadDeVotos(listaA.get(aux).getCantidadDeVotos() + 1);
                    facilitadores.add(listaA.get(aux).getNombre());
                }
                
                axiliarVotados.add(listaA.get(aux).getNombre());
                
                
            } while (axiliarVotados.size() < 3);
           
            listaA.add(i, aux2);
            votacion.put(aux2, axiliarVotados);
        }
        System.out.println("Votacion");
        for (Map.Entry<Alumno, HashSet> entry : votacion.entrySet()) {
            Alumno key = entry.getKey();
            HashSet value = entry.getValue();
            System.out.println("alumno: " + key);
            System.out.println("votos: " + value);
            System.out.println("");
            System.out.println("----------------------");

        }
        System.out.println("FACILITADORES");
        System.out.println(facilitadores);
        //solucionar error de votacion, al primero nuncalo vota nadie;
    }
  
}
