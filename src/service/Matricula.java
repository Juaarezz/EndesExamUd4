package service;

import model.Profesor;
import model.Alumno;

public class Matricula {

    private Alumno alumno;
    private Asignatura asignatura;
    private Profesor profesor;
    private double nota;

    public Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void mostrar() {
        System.out.println(alumno.getNombre() + " - " +
                asignatura.getNombre() + " - " +
                profesor.getNombre() + " - Nota: " + nota);
    }
}
