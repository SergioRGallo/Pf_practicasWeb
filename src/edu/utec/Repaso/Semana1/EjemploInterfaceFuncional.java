package edu.utec.Repaso.Semana1;

public class EjemploInterfaceFuncional {

    /*
        Crea una interface funcional que represente una operacion matematica con un solo parametro
        y devuelve un resultado del mismo tipo. Luego, implementa esta interface con una expresion lambda
        para calcular el cuadrado de un numero.
     */

    public static void main(String[] args) {
        OperacionMatematica<Integer> cuadrado = x -> x * x;

        Integer resultado = cuadrado.calcular(5);
        System.out.println("El cuadrado de 5 es: " + resultado);
    }

    @FunctionalInterface
    public interface OperacionMatematica <T>{
        T calcular(T J);
    }
}
