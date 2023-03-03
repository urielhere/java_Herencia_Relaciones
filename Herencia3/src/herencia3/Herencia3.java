
import java.util.function.Consumer;

/**
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
 * Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
 * televisores, con valores ya asignados. Luego, recorrer este array y ejecutar
 * el método precioFinal() en cada electrodoméstico. Se deberá también mostrar
 * el precio de cada tipo de objeto, es decir, el precio de todos los
 * televisores y el de las lavadoras. Una vez hecho eso, también deberemos
 * mostrar, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
 * tenemos una lavadora con un precio de 2000 y un televisor de 5000, el
 * resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para
 * lavadora y 5000 para televisor.
 *
 * @param args the command line arguments
 */
/**
 *
 * @author PC01
 */
public class Herencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();
        l.crearLavadora();
        t.crearTelevisor();
        System.out.println("-------------------------------------------");
        System.out.println("total a pagar: " + (l.totalLavadora + t.totalTelevisore));
        System.out.println("-------------------------------------------");

    }

}
