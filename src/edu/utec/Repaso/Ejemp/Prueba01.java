package edu.utec.Repaso.Ejemp;
import java.util.List;


public class Prueba01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sumOddNumbers(numbers);
    }

    static void sumOddNumbers(List<Integer> numbers) {
        // TODO: Complete este codigo
        int sum = numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}