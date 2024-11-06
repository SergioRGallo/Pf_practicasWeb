package edu.utec.EjerciciosS1;

import java.util.List;
import java.util.stream.Collectors;

/*
    Transformaciones con Streams:

    Dada una lista de cadenas, utiliza streams para convertir todas las cadenas a mayúsculas y luego
    filtra aquellas que tienen más de 3 caracteres. Recoge el resultado en una lista y muestra esta lista.

 */

public class ejercicio2 {

    public static void main(String[] args) {

        List<String> cadena = List.of("Hola", "y", "como", "estas", "Por acá", "to", "esta", "muy", "bien");
        transformaciones(cadena);

    }

    public static void transformaciones(List<String> cadenas){
        List<String> cadenas2 = cadenas.stream()
                .map(String::toUpperCase)
                .filter(x->x.length()>3)
                .collect(Collectors.toList());
        System.out.println(cadenas2);
    }
}
