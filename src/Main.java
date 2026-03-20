import model.Alumno;
import model.Persona;
import model.Profesor;
import service.Asignatura;
import service.Curso;
import service.GestorMatriculas;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso("1 DAM");

        Persona a1 = new Alumno("Carlos", 20);
        Persona a2 = new Alumno("Ana", 22);

        Persona p1 = new Profesor("Juan", "Matematicas");
        Persona p2 = new Profesor("Laura", "Programacion");

        Asignatura as1 = new Asignatura("Matematicas");
        Asignatura as2 = new Asignatura("Programacion");

        curso.agregarAlumno((Alumno) a1);
        curso.agregarAlumno((Alumno) a2);
        curso.agregarProfesor((Profesor) p1);
        curso.agregarProfesor((Profesor) p2);
        curso.agregarAsignatura(as1);
        curso.agregarAsignatura(as2);

        GestorMatriculas gestor = new GestorMatriculas();

        gestor.crearMatricula((Alumno) a1, as1, (Profesor) p1, 7);
        gestor.crearMatricula((Alumno) a1, as2, (Profesor) p2, 4);
        gestor.crearMatricula((Alumno) a2, as1, (Profesor) p1, 9);

        curso.mostrarTodo();

        System.out.println("------ MATRÍCULAS ------");
        gestor.mostrarTodas();

        System.out.println("------ APROBADOS ------");
        gestor.mostrarAprobados();

        System.out.println("Media global: " + gestor.mediaGlobal());

        gestor.subirNotaTodos(1);

        System.out.println("------ TRAS SUBIR NOTAS ------");
        gestor.mostrarTodas();

    }
}
