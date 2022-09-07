package ejerciciouno;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;

    public Persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre) && apellido.equals(persona.apellido);
    }

    @Override
    public String toString() {
        return this.getNombre() + " " + this.getApellido();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public int compareTo(Persona o) {
        return 0;
    }
}
