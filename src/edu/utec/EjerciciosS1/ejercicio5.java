package edu.utec.EjerciciosS1;

/*
    Recursividad sobre Bucles:
    Implementa una función recursiva para calcular el factorial de un número.
    Demuestra su uso con varios ejemplos, incluyendo el cálculo del factorial de 0, que debe devolver 1.
 */

public class ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Factorial de 6: " + factorial(6));
        System.out.println("Factorial de 0: " + factorial(0));
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
