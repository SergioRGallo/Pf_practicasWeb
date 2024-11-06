package edu.utec.EjerciciosS1;

/*
    Uso de map y filter en Streams:

    Toma una lista de objetos Persona (con atributos nombre y edad) y utiliza streams
    para obtener una lista de nombres de personas que tienen al menos 18 años.

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Creo la clase Persona y sus constructores
class Persona {
    String nombre;
    int edad;

    Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

public static class ejercicio3 {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Rodrigo",35),
                new Persona("Florencia", 25),
                new Persona("Rogelio", 16)
        );

        List<String> nombres = personas.stream()
                .filter(x -> x.edad > 18)
                        .map(x->x.nombre)
                        .collect(Collectors.toList());
        System.out.println(nombres);

    }


   }




}
