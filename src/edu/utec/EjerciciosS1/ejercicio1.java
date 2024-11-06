package edu.utec.EjerciciosS1;

/*
    Expresiones Lambda e Interfaces Funcionales:

    Crea una interfaz funcional Operacion que represente una operación aritmética entre dos enteros.
    Luego, implementa esta interfaz con expresiones lambda para realizar las operaciones de suma,
    resta, multiplicación y división. Demuestra el uso de estas implementaciones con ejemplos

 */

@FunctionalInterface
interface operacion{
    int aplicar(int a , int b);
}

public class ejercicio1 {

    public static void main(String[] args) {

        operacion suma = Integer::sum;
        operacion resta = (a, b) -> a - b;
        operacion multiplicacion = (a, b) -> a * b;
        operacion division = (a, b) -> a / b;

        System.out.println("La suma de los elementos es: " + suma.aplicar(2,8));
        System.out.println("La resta de los elementos es: " + resta.aplicar(32,12));
        System.out.println("La multiplicación de los elementos es: " + multiplicacion.aplicar(3,4));
        System.out.println("La division de los elementos es: " + division.aplicar(6,2));


    }


}


