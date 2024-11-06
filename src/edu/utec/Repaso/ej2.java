package edu.utec.Repaso;

import java.util.List;

/*
    Imprimir solo los números pares de una lista de números
    Crear la funcion printEvenNumbersInList que reciba una lista de numeros,
    recorra estos numeros y imprima los elementos
 */
public class ej2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(12, 22, 3, 7, 54, 62, 79, 8, 19, 10);
        printEvenNumbersInList(numeros);
        printImparesNumbersInList(numeros);

    }

    public static void printEvenNumbersInList(List<Integer> elementos){
        elementos.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }

    public static void printImparesNumbersInList(List<Integer> impares){
        impares.stream()
                .filter(x -> x % 2 != 0)
                .forEach(System.out::println);

    }
}
