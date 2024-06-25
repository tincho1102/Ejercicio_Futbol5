public class CondicionCuota extends Condicion {
    private boolean cuota;
    public boolean cumple(Socio s){
        if(s.isCuota() == this.cuota){
            return true;
        }
        else return false;
    }

    public CondicionCuota(boolean cuota) {
        this.cuota = cuota;
    }
}
