package edu.utec.EjerciciosS1;

/*
    Implementación de Interfaz Funcional:
    Crea tu propia interfaz funcional Triple que acepte un entero y lo triplique.
    Utiliza esta interfaz para triplicar los números en una lista de enteros, utilizando expresiones lambda.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Triple{
    int apply(int x);
}

public class ejercicio6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        Triple tripleFuncion = x -> x * 3;

        List<Integer> triple = numeros.stream()
                .map(tripleFuncion::apply)
                .collect(Collectors.toList());

        System.out.println(triple);

    }


}
