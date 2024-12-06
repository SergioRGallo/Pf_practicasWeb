package edu.utec.Repaso.Ejemp;

import java.util.Arrays;
import java.util.List;

public class prueba02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "C", "Python", "JavaScript");
        System.out.println(countLongStrings(strings));
    }

    static long countLongStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() > 3)
                .count();
    }
}
