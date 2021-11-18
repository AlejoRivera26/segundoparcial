package ejercicios;

import java.util.ArrayList;

public class Estudiante extends Usuario{

    //ATRIBUTOS
    private String carrera;
    private ArrayList<Aprobadas> materiasAprobadas = new ArrayList<Aprobadas>();
    private ArrayList<Inscriptas> materiasInscriptas = new ArrayList<Inscriptas>();

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //Setters

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Getters

    public String getCarrera() {
        return carrera;
    }

    //METODOS

    public void imprimirMateriasAprobadas(){
        System.out.println("Materias aprobadas");
        for (int i = 0; i < this.materiasAprobadas.size(); i++) {
            System.out.println(this.materiasAprobadas.get(i));
        }
    }

    public void imprimirMateriasInscriptas(){
        System.out.println("Materias inscriptas");
        for (int i = 0; i < this.materiasInscriptas.size(); i++) {
            System.out.println(this.materiasInscriptas.get(i));
        }
    }

}
