package edu.utec.EjerciciosS1;

/*

Crear una lista de strings que representen los nombres que empiezan con la letra "A" a partir de una lista de nombres.
Datos de entrada: List<String> nombres = Arrays.asList("Ana", "Alberto", "Mario", "Beatriz", "Alicia");
Tarea: Utiliza Streams para filtrar los nombres que empiezan con "A".
Resultado esperado: Una lista de strings: ["Ana", "Alberto", "Alicia"].
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejerciciocomp02 {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Ana", "Alberto", "Mario","Beatriz", "Alicia");
        List<String> Filtrados = filtradoNombres(nombres);


        System.out.println("La lista de nombres es: " + nombres);
        System.out.println("La lista de nombres filtrado es: " +Filtrados);
    }

    // Creo la función que filtre los nombres que empiecen con A
    public static List<String> filtradoNombres (List<String> elementos){
        return elementos.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());
    }

}
