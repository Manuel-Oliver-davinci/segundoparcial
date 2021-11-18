package segundoparcial.primerejercicio;

import java.util.ArrayList;

public class Estudiante extends Usuario{

    //ATRIBUTOS
    private String carrera;
    private ArrayList<String> materiasAprobadas= new ArrayList<String>();
    private ArrayList<String> materiasInscriptas= new ArrayList<String>();

    //CONSTRUCTORES


    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //GETTERS Y SETTERS CARRERA
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //GETTERS Y SETTERS MATERIASAPROBADAS

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    //GETTERS Y SETTERS MATERIASINSCRIPTAS

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    //METODOS

    public void imprimirMateriasAprobadas(){
        System.out.println("Materias aprobadas: ");
        for (int i = 0; i < this.materiasAprobadas.size() ; i++) {
            System.out.println(this.materiasAprobadas.get(i));
        }
    }
    public void imprimirMateriasInscriptas(){
        System.out.println("Materias inscriptas: ");
        for (int i = 0; i < this.materiasInscriptas.size() ; i++) {
            System.out.println(this.materiasInscriptas.get(i));

        }
    }

}
