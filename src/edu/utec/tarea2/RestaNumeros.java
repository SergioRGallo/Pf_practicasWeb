package edu.utec.tarea2;

import java.util.function.BiFunction;

public class RestaNumeros {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> restar = (num1, num2) -> num1 - num2;

        System.out.println(restar.apply(10, 5)); // 5
    }
}