package service;

import model.Alumno;
import model.Profesor;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Profesor> profesores;

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
        asignaturas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public void agregarAsignatura(Asignatura a) {
        asignaturas.add(a);
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void mostrarTodo() {
        System.out.println("CURSO: " + nombre);

        for (Alumno a : alumnos) {
            System.out.println("model.Alumno: " + a.getNombre());
        }

        for (Asignatura as : asignaturas) {
            System.out.println("service.Asignatura: " + as.getNombre());
        }

        for (Profesor p : profesores) {
            System.out.println("model.Profesor: " + p.getNombre());
        }
    }
}
