package edu.utec.Repaso.Vcs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //Parte 2
        System.out.println("PARTE 2 -------------------------");

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("1234567890", "El libro de la selva", "Rudyard Kipling", LocalDate.of(1894, 1, 1), 19.99));
        libros.add(new Libro("0987654321", "Don Quijote de la Mancha", "Miguel de Cervantes", LocalDate.of(1605, 1, 1), 24.99));
        libros.add(new Libro("1357924680", "Cien años de soledad", "Gabriel García Márquez", LocalDate.of(1967, 1, 1), 29.99));

        libros.forEach(libro -> );

    }


}
