import java.util.Comparator;

public class OrdenEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return o2.getEdad() - o1.getEdad();
    }
}
