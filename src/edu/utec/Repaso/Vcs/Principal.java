package edu.utec.Repaso.Vcs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {

        //Parte 2
        System.out.println("PARTE 2 --Crea una lista de libros y añade algunos libros a la lista. --");

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("1234567890", "El libro de la selva", "Rudyard Kipling", LocalDate.of(1894, 1, 1), 19.99));
        libros.add(new Libro("0987654321", "Don Quijote de la Mancha", "Miguel de Cervantes", LocalDate.of(1605, 1, 1), 24.99));
        libros.add(new Libro("1357924680", "Cien años de soledad", "Gabriel García Márquez", LocalDate.of(1967, 1, 1), 29.99));

        // Mostrar la lista de libros
        System.out.println("La lista de libros esta compuesta por:");
        libros.forEach(System.out::println);

        //Parte 3
        System.out.println();
        System.out.println("PARTE 3 --Crea una función que reciba la lista de libros y un autor como parámetro, y devuelva una lista con los libros escritos por ese autor. --");

        System.out.println("Fltrado por Autor");
        List<Libro> librosPorAutor = filtradoPorAutor(libros,"Miguel de Cervantes");
        librosPorAutor.forEach(System.out::println);

        System.out.println("Fltrado por Titulo");
        List<Libro> librosPorTitulo = filtradoPorTituo(libros,"Cien años de soledad" );
        librosPorTitulo.forEach(System.out::println);

        //Parte 4
        System.out.println();
        System.out.println("PARTE 4 --crea una función que reciba la lista de libros y devuelva el precio total de todos los libros. --");

        double total = precioTotal(libros);
        System.out.println("El valor total de la suma de los libros es " + total);

        //Parte 5
        System.out.println();
        System.out.println("PARTE 5 -- crea una función que reciba la lista de libros y devuelva una lista ordenada por fecha de creación, de más antiguo a más reciente. --");

        List<Libro> ordenadoPorFecha = ordenarPorFecha(libros);
        ordenadoPorFecha.forEach(System.out::println);

        System.out.println();
        System.out.println("Ejemplo aplicando el orden descendente de menos antiguo a mas antiguo");

        List<Libro> ordenadoPorFechaDescendente = ordenarPorFechaDescendente(libros);
        ordenadoPorFechaDescendente.forEach(System.out::println);
    }

        //Parte 3
    public static List<Libro> filtradoPorAutor (List<Libro> libros, String autor){
        return libros.stream()
                .filter(libro -> libro.getAutor().equals(autor))    //filtro por autor
                .collect(Collectors.toList());                      //Convierto en una lista
    }
        // Extra 3.1
    public static List<Libro> filtradoPorTituo(List<Libro> libros, String titulo){
        return libros.stream()
                .filter(libro -> libro.getTitulo().equals(titulo))
                .collect(Collectors.toList());
    }

    //Parte 4
    public static double precioTotal (List<Libro> libros){
        return libros.stream()
                .mapToDouble(Libro::getPrecio)  // Convierte el flujo de datos en un flujo de doubles
                .sum();                         // Calcula la suma de los precios en el flujo de doubles

    }

    //Parte 5
    public static List<Libro> ordenarPorFecha (List<Libro> libros){
        return libros.stream()
                .sorted(Comparator.comparing(Libro::getFechaCreacion))              // Ordena el flujo de datos según la fecha de creación de cada libro
                .collect(Collectors.toList());                                      // Convierte el flujo de datos ordenado en una lista de objetos Libro
    }

    // Extra 5.1
    public static List<Libro> ordenarPorFechaDescendente (List<Libro> libros){
        return libros.stream()
                .sorted(Comparator.comparing(Libro::getFechaCreacion).reversed())  //utilizo el reverse para que aplique el orden descendente
                .collect(Collectors.toList());
    }

}
