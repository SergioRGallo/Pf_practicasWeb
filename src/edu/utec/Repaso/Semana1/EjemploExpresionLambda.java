package edu.utec.Repaso.Semana1;

import java.util.Arrays;
import java.util.List;

public class EjemploExpresionLambda {

        /*
           Escriban una expresión lambda que tome dos enteros y devuelva su suma. Luego, utilízala
           para ordenar una lista de números en orden descendente.
        */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 6);  // Creo una lista de numeros
        Sumador sumador = Integer::sum;                    // Creo un Sumador utilizando Exp. Lambda)                              // Creo la suma utilizando Exp. Lambda
        int resultado = sumador.suma(5, 2);
        System.out.println("La suma de los elementos es: " + resultado); // Llamo a la suma utilizando Exp. Lambda

        numeros.sort((num1, num2) -> num2 - num1);             // Ordeno la lista de numeros de forma descendente
        System.out.println("La lista de numeros ordenada es: " + numeros);  // Imprimo la lista

    }

    @FunctionalInterface
    interface Sumador {                             // Interfaz funcional para representar la operación de suma
        int suma(int a , int b);
    }
}
