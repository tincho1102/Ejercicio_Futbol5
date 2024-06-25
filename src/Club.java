import java.util.*;
import java.util.List;

public class Club {
    private ArrayList<Socio> listaSocios;

    public Club() {
    this.listaSocios = new ArrayList<>();
    }

    public void addSocio(Socio nuevoSocio){
        listaSocios.add(nuevoSocio);
    }
    //
    public ArrayList<Socio> filtrar(Condicion cond){
        ArrayList<Socio> salida =new ArrayList<Socio>();
        for(int i=0; i<listaSocios.size(); i++){
            if(cond.cumple(listaSocios.get(i))){
                salida.add(listaSocios.get(i));
                System.out.println(listaSocios.get(i));
            }
        }
        return salida;
    }
    //
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Socio socio : listaSocios) {
            sb.append(socio).append("\n");
        }
        return sb.toString();
    }
    public void ordenar(){
        Collections.sort(listaSocios);
    }
}
