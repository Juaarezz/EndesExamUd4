package service;

/**
 * Clase Asignatura para crear una asignatura.
 * @author Adrián Juárez
 */
public class Asignatura implements Informacion {

    private String nombre;

    /**
     * Constructor para inicializar la asignatura.
     * @param nombre Indicas el nombre de la asignatura.
     */
    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve el nombre de la asignatura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Estableces un nuevo nombre de la asignatura.
     * @param nombre Indicas el nombre de la asignatura.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Asignatura: " + nombre);
    }
}
