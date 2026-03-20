package model;

/**
 * Clase abstracta para definir a una persona
 * @author Adrián Juárez
 */
public abstract class Persona {
    protected String nombre;

    /**
     * @param nombre Añades el nombre de la persona.
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Te devuelve el nombre de la persona.
     */
    public abstract String getNombre();

    /**
     * Cambias el nombre de la persona
     * @param nombre Estableces un nombre a la persona.
     */
    public abstract void setNombre(String nombre);
}
