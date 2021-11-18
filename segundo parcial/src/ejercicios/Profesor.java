package ejercicios;

import java.util.ArrayList;

public class Profesor extends Usuario{

    //ATRIBUTOS
    ArrayList<Comision> comisiones = new ArrayList<Comision>();

    //CONSTRUCTORES
    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    //Setter
    public void setComisiones(ArrayList<Comision> comisiones) {
        this.comisiones = comisiones;
    }

    //Getter
    public ArrayList<Comision> getComisiones() {
        return comisiones;
    }

    //Metodos
    public void imprimirComisiones(){
        System.out.println("Comisiones");
        for (int i = 0; i < this.comisiones.size(); i++) {
            System.out.println(this.comisiones.get(i));
        }
    }

}
