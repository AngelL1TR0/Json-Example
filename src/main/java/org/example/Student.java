package org.example;

import java.util.Objects;
    public class Student {

        private String nombre;

        private String surname;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public Student(String nombre, String surname) {
            this.nombre = nombre;
            this.surname = surname;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            org.example.Student student = (org.example.Student) o;
            return Objects.equals(nombre, student.nombre) && Objects.equals(surname, student.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre, surname);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "nombre='" + nombre + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
}
