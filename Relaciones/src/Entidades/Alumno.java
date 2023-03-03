package entidades;

/**
 *
 * @author franc
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private Integer DNI;
    private Integer cantidadDeVotos;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int DNI, int cantidadDeVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(Integer cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", cantidadDeVotos=" + cantidadDeVotos + '}';
    }


  

}
