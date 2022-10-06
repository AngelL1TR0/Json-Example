package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        try {
            ObjectMapper om = new ObjectMapper();

            om.readValue(new File(Main.class.getResource("/instituto.json").toURI()), Highschool.class);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
