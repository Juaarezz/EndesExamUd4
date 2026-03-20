package service;

public class Asignatura implements Informacion {

    private String nombre;

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Asignatura: " + nombre);
    }
}
