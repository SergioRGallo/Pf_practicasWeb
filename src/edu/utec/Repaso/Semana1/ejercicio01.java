package edu.utec.Repaso.Semana1;

import java.util.List;

public class ejercicio01 {

    /*
         Imprimir elementos de una lista de números.
     */

    public static void main(String[] args) {

    List<Integer> numeros = List.of(12, 22, 3, 7, 54, 62, 79, 8, 19, 10);
        printNumbersIntList(numeros);
        System.out.println("\n");
        printNumbersIntListFuncional(numeros);
    }
    // Forma Imperativa
    public static void printNumbersIntList(List<Integer> numeros){
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

    // Forma Funcional
    public static void printNumbersIntListFuncional(List<Integer> numeros){
        numeros.forEach(System.out::println);
    }
}
