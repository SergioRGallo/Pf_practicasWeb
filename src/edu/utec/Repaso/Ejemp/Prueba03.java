package edu.utec.Repaso.Ejemp;
import java.util.List;
import java.util.stream.Collectors;

public class Prueba03 {

        public static void main(String[] args) {
            List<Integer> numbers = List.of(-1, 2, 3, -4, 5, 6, -7, 8, -9, 10);
            allNumbersArePositives(numbers);
        }

        static void allNumbersArePositives(List<Integer> numbers) {
            // TODO: complete este codigo
            List<Integer> positivos = numbers.stream()
                            .filter(nums -> nums > 0)
                            //.collect(Collectors.toList());
                                    .toList();
            System.out.println(positivos);

            // Todos los numeros son positivos
            boolean todosPositivos = numbers.stream()
                         .allMatch(nums -> nums > 0);
            System.out.println(todosPositivos);
        }

        static void allNumbersArePositivesImperative(List<Integer> numbers) {
            boolean allPositive = true;
            for (Integer number : numbers) {
                if (number <= 0) {
                    allPositive = false;
                    break;
                }
            }
            System.out.println(allPositive);
        }
    }


