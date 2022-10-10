package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        try {
            ObjectMapper om = new ObjectMapper();

            /*
            Manera 1 de hacerlo
            Highschool federica1 = om.readValue(
                    new File(Main.class.getResource("ruta ordeandor").toURI()),
                    Highschool.class);

             */

            //Manera 2 de hacerlo
            Highschool federica = om.readValue(
                    new File(Main.class.getResource("/instituto.json").toURI()),
                    Highschool.class);

            //Manera 3 de hacerlo
            Highschool jovellanos = new Highschool(
                    "Jovellanos",
                    List.of(new Student("Bob", "Esponja", 22))
                    );

            //Aqui imprimo la primera forma pero puede ser cualquiera
            System.out.println(federica.getNombre() + "\nEstudiantes:");
            for(Student  student : federica.getEstudiantes()){
                System.out.println(student.toString());
            }

            //Manera generica y no organizada de imprimirlo
            System.out.println("\n" + federica.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
