import java.util.ArrayList;
import java.util.List;

public class Socio implements Comparable<Socio>{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuota;
    private ArrayList<Cancha> listaAlquileres;

    public Socio(String nombre, String apellido, int edad, boolean cuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuota = cuota;
        this.listaAlquileres = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCuota() {
        return cuota;
    }

    public void addCancha(Cancha nuevaCancha){
        listaAlquileres.add(nuevaCancha);
    }

    @Override
    public String toString() {
        return "Socio[nombre=" + nombre + ", apellido=" + apellido + ", cuota=" + cuota + ", edad=" + edad + "]";
    }
    public int compareTo(Socio s){
        return this.edad - s.edad;
    }
}
