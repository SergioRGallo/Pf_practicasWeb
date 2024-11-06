package edu.utec.EjerciciosS1;

import java.util.List;

/*
    Funciones Puras:
      Escribe una función pura que reciba dos listas de números enteros,
      sume el primer elemento de la primera lista con el último elemento de la segunda lista,
      y retorne el resultado. Asegúrate de que esta función no cause efectos secundarios.
 */

public class ejercicio4 {
    public static void main(String[] args) {

        List<Integer> lista1 = List.of(18,12,58);
        List<Integer> lista2 = List.of(4,8,16,20,34);

        Integer resultado = sumarListas(lista1,lista2);

        System.out.println(resultado);

    }

    public static int sumarListas(List<Integer> lista1, List<Integer> lista2){

        if(lista1.isEmpty() || lista2.isEmpty())    // Si alguna de las listas es vacía devolver 0
            return 0;
        return lista1.getFirst() + lista2.getLast();

        // Otro forma de obtener el primer y ultimo elemento de la lista
        //return lista1.get(0) + lista2.get(lista2.size()-1);
    }
}
