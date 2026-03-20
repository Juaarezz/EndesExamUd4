package model;

import service.Informacion;

/**
 * Clase profesor para definir un profesor del curso.
 * @author Adrián Juárez
 */
public class Profesor extends Persona implements Informacion {

    private String especialidad;

    /**
     * @param nombre Estableces el nombre del profesor.
     * @param especialidad Estableces la especialidad del profesor.
     */
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Muestra la especialidad del profesor.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Estableces la especialidad del profesor.
     * @param especialidad Indicas la especialidad del profesor.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombre + " - " + especialidad);
    }
}
