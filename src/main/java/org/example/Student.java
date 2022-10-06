package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

    public class Student {

        private String nombre;

        private String apellidos;

        private int edad;

    }