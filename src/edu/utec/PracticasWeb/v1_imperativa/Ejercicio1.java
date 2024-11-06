package edu.utec.PracticasWeb.v1_imperativa;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
        Ejercicio 1 - metodo imperativo:

           1) Crear lista de enteros
           2) Quedarme solo con los números pares
           3) Cada número de la lista elevar al cuadrado
           4) Mostrar cada número al cuadrado por pantalla
           5) Obtener la suma de los cuadrados

         */

        // parte 1
        List<Integer> numeros = crearLista();  // Creo una lista llamada numeros la cual llama al método crearLista
        System.out.println(numeros);           // Imprimo los numeros 
        
        // parte 2
        List<Integer> pares = listaPares(numeros);   // Creo la lista de numeros pares llamando al metodo listaPares
        System.out.println(pares);

        // parte 3
        List<Integer> cuadrado = listaCuadrados(pares); // Creo la lista de numeros pares elevados al cuadrado
        System.out.println(cuadrado);

        // parte 4
        List<Integer> mostrarCuadrados = mostrarLista(cuadrado);

        // parte 5
        int totalCuadrados = sumarCuadrados(mostrarCuadrados);
        System.out.println("La suma de los cuadrados es: " + totalCuadrados);
    }




    // Método para crear la lista de numeros
    private static List<Integer> crearLista() {
        return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
    }

    // Método para crear la lista de numeros pares
    private static List<Integer> listaPares(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();    //  se recorre la lista numeros y se agrega a la lista pares
        for (Integer numero : numeros) {            //  se nombra numero al resultado de cada iteración
            if (numero % 2 == 0) {                  //  se filtra por numeros pares
                pares.add(numero);                  //  se agrega el numero que cumplio la condición a la lista pares
            }
        }
        return pares;
            
        }

    // Método para crear la lista de numeros pares al cuadrado
    private static List<Integer> listaCuadrados(List<Integer> pares) {
        List<Integer> cuadrados = new ArrayList<>();
        for (Integer numero : pares) {                  // recorro la lista de pares
            numero = numero * numero;                   // genero numero, como numero al cuadrado
            cuadrados.add(numero);                      // agrego numero a la lista de cuadrados
        }
        return cuadrados;
    }

    // Método para mostrar los numeros al cuadrado
    private static List<Integer> mostrarLista(List<Integer> numeros) {
        for (Integer numero : numeros) {                                        // Recorro la lista que viene en el
            System.out.println(numero);                                         // método dadoe imprimo uno a uno.
        }
        return numeros;
    }

    // Método para sumar los cuadrados
    private static int sumarCuadrados(List<Integer> cuadrados) {        // Método que recibe una lista de cuadrados
        int total = 0;                                                  // y retorna un entero que es la suma de los cuadrados
        for (Integer numero : cuadrados) {                              // Recorro la lista de cuadrados y lo llamo numero
            total += numero;                                            // sumo los numero a la variable total
        }
        return total;
        }

}
