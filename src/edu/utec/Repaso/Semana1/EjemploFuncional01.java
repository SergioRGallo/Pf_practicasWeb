package edu.utec.Repaso.Semana1;

import java.util.List;
import java.util.stream.Collectors;

public class EjemploFuncional01 {

    /*
        Ejemplo Introductorio
        Imaginemos que queremos transformar una lista de números, multiplicando cada uno por 2
        y luego filtrando los que son mayores que 100. Aquí está cómo podríamos hacerlo en Java de
        manera funcional:
     */

    public static void main(String[] args) {
        List<Integer> numeros = List.of(12, 22, 3, 7, 54, 62, 79, 8, 19, 10);

        List<Integer> resultado = numeros.stream()
                .map(x -> x * 2)
                .filter(x -> x > 100)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
