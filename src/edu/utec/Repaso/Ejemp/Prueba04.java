package edu.utec.Repaso.Ejemp;

import java.util.List;
import java.util.stream.Collectors;

public class Prueba04 {
    public static void main(String[] args) {
        List<String> strings = List.of("Java", "", "Kotlin", "", "Scala");
        filterEmpty(strings);
    }

    static void filterEmpty(List<String> strings) {
        // TODO: complete este codigo
                    strings.stream()
                        .filter(a -> !a.isEmpty())
                            .forEach(System.out::println);
        //System.out.println(strings);
    }

//    static void filterEmptyImperative(List<String> strings) {
//        for (String string : strings) {
//            if (!string.isEmpty()) {
//                System.out.println(string);
//            }
//        }
//    }
}
