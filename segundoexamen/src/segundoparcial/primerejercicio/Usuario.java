package segundoparcial.primerejercicio;

public abstract class Usuario {

    //ATRIBUTOS
    private int dni;
    private String nombre;
    private String apellido;

    //CONSTRUCTORES
    public Usuario(int dni, String nombre,String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido=apellido;
    }

    //GETTERS Y SETTERS
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //METODO TO STRING

    @Override
    public String toString() {
        return "El Dni de " + this.nombre + "es :" + this.dni;
    }
}
