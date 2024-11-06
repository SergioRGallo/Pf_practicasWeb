package edu.utec.tarea2;

import java.util.Arrays;
import java.util.List;

public class ConcatenacioYConteo {
    public static void main(String[] args) {
        List<String> cadenas = Arrays.asList("Hola", "Mundo", "CodeRunner");
        //TODO: complete este codigo
        //String concatenado = ... sigue ....

        int conteo = cadenas.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(c -> Character.toString((char)c))
                .mapToInt(String::length)
                .sum();

        String concatenado = cadenas.stream()
                .reduce("", (s1, s2) -> s1 + s2);

        System.out.println("Cadena concatenada: " + concatenado + ", Total de caracteres: " + conteo);
    }
}
