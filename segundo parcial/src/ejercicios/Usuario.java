package ejercicios;

public abstract class Usuario {

    //ATRIBUTOS
    private int dni;
    private String nombre;
    private String apellido;

    //CONSTRUCTORES
    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Setters

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Getters

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //METODOS

    @Override
    public String toString() {
        return "El dni del " + this.getClass().getSimpleName() + " es " + dni;
    }
}
