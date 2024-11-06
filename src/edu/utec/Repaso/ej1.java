package edu.utec.Repaso;

import java.util.List;

// Imprimir elementos de una lista de números.
// Crear una función printNumbersInList que reciba una lista de numeros,
// recorra estos numeros y imprima los elementos
public class ej1 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(12, 22, 3, 7, 54, 62, 79, 8, 19, 10);
        printNumbersInList(numeros);
    }

    public static void printNumbersInList (List<Integer> numeros ){
        numeros.forEach(System.out::println);
    }

}
