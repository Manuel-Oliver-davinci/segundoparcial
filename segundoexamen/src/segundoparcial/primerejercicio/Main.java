package segundoparcial.primerejercicio;

public class Main {
    public static void main(String[] args) {

        Profesor primerProfesor = new Profesor(100,"John","Doe");

        Estudiante primerEstudiante= new Estudiante(44596198,"Manuel","Oliver","Analista");

        System.out.println(primerEstudiante);
        System.out.println(primerProfesor);

       primerEstudiante.getMateriasInscriptas().add("POO");
       primerEstudiante.getMateriasInscriptas().add("UX");
       primerEstudiante.getMateriasInscriptas().add("BASE DE DATOS");



       primerEstudiante.getMateriasAprobadas().add("POO");
       primerEstudiante.getMateriasAprobadas().add("UX");

       primerEstudiante.imprimirMateriasInscriptas();
       primerEstudiante.imprimirMateriasAprobadas();

    }
}
