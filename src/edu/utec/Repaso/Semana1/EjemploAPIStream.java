package edu.utec.Repaso.Semana1;

import java.util.List;

public class EjemploAPIStream {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(12, 22, 3, 7, 54);
        int sum = numeros.stream()
                .filter(x -> x % 2 == 0)     //se filtra por numeros pares
                .mapToInt(x -> x)           // se convierte a un array de enteros
                .sum();                     // se realiza la suma
        System.out.println(sum);

    }
}
