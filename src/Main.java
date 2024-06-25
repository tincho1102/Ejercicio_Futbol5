import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Socio socio1 = new Socio("Martin", "Di Marco", 11, false);
        Socio socio2 = new Socio("Nehuen", "Alvarez", 14, false);
        Socio socio3 = new Socio("Felipe", "Costa", 22, false);
        Socio socio4 = new Socio("Mario", "Di Marco", 53, false);
        Socio socio5 = new Socio("Victoria", "Cicciato", 17, false );
        Socio socio6 = new Socio("Gonzalo", "Dacasto", 31, false);
        //
        Club Santamarina = new Club();
        //
        Cancha talleres = new Cancha(10, 25000);
        Cancha independiente = new Cancha(11, 28000);
        Cancha rivadavia = new Cancha(12, 21000);
        //
        Santamarina.addSocio(socio1);
        Santamarina.addSocio(socio2);
        Santamarina.addSocio(socio3);
        Santamarina.addSocio(socio4);
        Santamarina.addSocio(socio5);
        Santamarina.addSocio(socio6);
        //
        //System.out.println(Santamarina);
        CondicionCuota c1 = new CondicionCuota(false);
        CondicionEdad c2 = new CondicionEdad(18);
        //Collections.sort(Santamarina, new OrdenEdad());
        Santamarina.ordenar();
        Santamarina.filtrar(c1);

    }
}
