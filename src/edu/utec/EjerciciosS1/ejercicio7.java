package edu.utec.EjerciciosS1;

/*
    Uso de Function<T,R>:
    Escribe una función que utilice la interfaz Function<Integer, Integer>
    para convertir temperaturas de Celsius a Fahrenheit. Prueba tu función con una lista de temperaturas en Celsius.

 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ejercicio7 {
    public static void main(String[] args) {
        List<Integer> celsiusTemperatura = Arrays.asList(0,10,20);

        // Creo la funcion
        Function<Integer, Integer> cToF = c -> (c * 9 / 5) + 32;

        List<Integer> fahrenheitTemperatures = celsiusTemperatura.stream() .map(cToF)
                .collect(Collectors.toList());
        System.out.println(fahrenheitTemperatures);
    }
}
