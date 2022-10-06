package org.example;

import java.util.List;
import java.util.Objects;

public class Highschool {

    private String nombre;

    private List<Student> estudiantes;

    public Highschool(String nombre, List<Student> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Student> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Student> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Highschool that = (Highschool) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(estudiantes, that.estudiantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, estudiantes);
    }
}
