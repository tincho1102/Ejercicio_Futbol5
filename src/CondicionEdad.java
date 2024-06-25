public class CondicionEdad extends Condicion {
    private int edad;

    public boolean cumple(Socio s){
        boolean c = false;
        if (s.getEdad() > edad){
            c = true;
        }
        return c;
    }

    public CondicionEdad(int edad) {
        this.edad = edad;
    }
}
