package ejercicios;

public class Main {
    public static void main(String[] args) {

      Profesor primerProfesor = new Profesor(100, "Juan", "Doe");
      Estudiante primerEstudiante = new Estudiante(43323345, "Alejo", "Amillano", "Analsita");

      materiasAprobadas.add("Historia");
      materiasAprobadas.add("Literatura");
      materiasAprobadas.add("Matematica");

        System.out.println(primerEstudiante.imprimirMateriasAprobadas(););

      materiasInscriptas.add("Programacion");
      materiasInscriptas.add("Filosofia");

        System.out.println(primerEstudiante.imprimirMateriasInscriptas(););

    }
}
