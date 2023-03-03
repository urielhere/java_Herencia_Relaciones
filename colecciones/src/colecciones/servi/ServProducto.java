/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.servi;

import colecciones.servi.Entidades.Producto_6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 */
public class ServProducto {

    Producto_6 p;
    Scanner l;
    HashMap<String, Double> listaProductos;

    public ServProducto() {
        this.l = new Scanner(System.in);
        this.listaProductos = new HashMap();
        this.p = new Producto_6();
    }

    public void menu() {
        boolean salir = true;
        do {
            System.out.println("(1)Ingresar Producto|(2)Eliminar Producto|(3)Modificar Precio|(4)Mostrar Productos");
            int opcion = l.nextInt();
            switch (opcion) {
                case 1:
                    ingresarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    mostrarProductos();
                    break;
            }
            System.out.println("salir? s/n");
            String continuar = l.next();
            if (continuar.equals("s")) {
                salir = false;
            }
        } while (salir);

    }

    public void ingresarProducto() {
        System.out.println("ingresar el nombre del producto");
        p.setProducto(l.next());
        System.out.println("ingresar el preco del producto");
        p.setPrecio(l.nextDouble());
        listaProductos.put(p.getProducto(), p.getPrecio());
    }

    public void eliminarProducto() {
        System.out.println("ingresar un producto a eliminar");
        String eliminar = l.next();
        for (Map.Entry<String, Double> aux : listaProductos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if (key.equals(eliminar)) {
                listaProductos.remove(key, value);
            }

        }
    }

    public void modificarPrecio() {
        System.out.println("ingresar un producto a modificar");
        String modificar = l.next();
        System.out.println("ingresar el nuevo precio del producto");
        Double nuevoPrecio = l.nextDouble();
        for (Map.Entry<String, Double> aux : listaProductos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if (key.equals(modificar)) {
                listaProductos.put(key,nuevoPrecio);
            }

        }

    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + "  Precio :" + value);
        }
    }
}
