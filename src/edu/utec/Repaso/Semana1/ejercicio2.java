package edu.utec.Repaso.Semana1;

import java.util.List;

public class ejercicio2 {

    /*
        Imprimir solo los números pares de una lista de números
     */

    public static void main(String[] args) {
        List<Integer> numeros = List.of(12, 22, 3, 7, 54, 62, 79, 8, 19, 10);

        printEvenNumebersInList(numeros);
    }

    // Forma Imperativa
    public static void printEvenNumebersInList(List<Integer> numeros){
        for (Integer numero : numeros) {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        }
    }

}
