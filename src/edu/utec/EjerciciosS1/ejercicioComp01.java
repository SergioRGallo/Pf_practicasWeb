package edu.utec.EjerciciosS1;

/*
    Crear una lista de Personas agrupadas por su edad

 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class PersonaP{
    public PersonaP(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    String nombre;
    int edad;

    @Override
    public String toString() {
        return "PersonaP{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

public class ejercicioComp01 {

    public static void main(String[] args) {

        List<PersonaP> personas = List.of(
                new PersonaP("Rodrigo", 21),
                new PersonaP("Florencia", 20),
                new PersonaP("Sergio",20),
                new PersonaP("Adriano", 21)
        );
        System.out.println(agruparPersonasPorEdad(personas));
    }

    public static Map<Integer, Map<String, List<PersonaP>>> agruparPersonasPorEdad(List<PersonaP> personas) {
        return personas.stream()
                .collect(Collectors.groupingBy(PersonaP::getEdad, Collectors.groupingBy(PersonaP::getNombre)));

    }
}
