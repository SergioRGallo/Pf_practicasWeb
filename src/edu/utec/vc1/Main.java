package edu.utec.vc1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Parte 2 - Creo la lista de libros
        System.out.println("PARTE 2 -------------------------");
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("1234567890", "El libro de la selva", "Rudyard Kipling", LocalDate.of(1894, 1, 1), 19.99, Genero.FICCION));
        libros.add(new Libro("0987654321", "Don Quijote de la Mancha", "Miguel de Cervantes", LocalDate.of(1605, 1, 1), 24.99, Genero.POLICIAL));
        libros.add(new Libro("1357924680", "Cien años de soledad", "Gabriel García Márquez", LocalDate.of(1967, 1, 1), 29.99,Genero.COMEDIA));

        // Nuevos elementos cargados en VC2
        libros.add(new Libro("6357454680", "Crónica de una muerte anunciada", "Gabriel García Márquez", LocalDate.of(1981, 1, 1), 30.99, Genero.COMEDIA));
        libros.add(new Libro("9345464687", "En agosto nos vemos", "Gabriel García Márquez", LocalDate.of(2024, 1, 1), 30.99, Genero.COMEDIA));
        libros.add(new Libro("9345464687", "La tregua", "Mario Benedetti", LocalDate.of(1960, 1, 1), 30.99, Genero.FICCION));
        libros.add(new Libro("9345464687", "La noche de los feos", "Mario Benedetti", LocalDate.of(1984, 1, 1), 30.99, Genero.COMEDIA));
        libros.add(new Libro("9345464687", "Cuentos de la selva", "Horacio Quiroga", LocalDate.of(1918, 1, 1), 17.99, Genero.FICCION));
        libros.add(new Libro("9345464687", "El almohadon de plumas", "Horacio Quiroga", LocalDate.of(1917, 1, 1), 10.99, Genero.FICCION));
        libros.add(new Libro("9345464687", "La gallina degollada", "Horacio Quiroga", LocalDate.of(1917, 1, 1), 15.99, Genero.FICCION));


        // Mostrar los elementos de la lista
       // libros.forEach(l -> System.out.println(l));
        libros.forEach(System.out::println);

        //Parte 3
        System.out.println("PARTE 1.3 -------------------------");
        List<Libro>  librosPorAutor = filtrarPorAutor(libros,"Miguel de Cervantes");
        librosPorAutor.forEach(System.out::println);

        //Parte 4
        System.out.println("PARTE 1.4 -------------------------");
        System.out.println("El precio total de los libros es: " + calcularPrecioTotal(libros));

        //Parte 5
        System.out.println("PARTE 1.5 -------------------------");
        List<Libro> librosOrdenardosPorFecha = ordenarPorFecha(libros);
        librosOrdenardosPorFecha.forEach(System.out::println);

        // VC - Parte 2 - Ejercicio 3
        System.out.println("PARTE 2.3 ------------------------VC-2");
        List<Libro> librosPorGenero = filtradoPorGenero(libros,Genero.COMEDIA);
        librosPorGenero.forEach(System.out::println);

        // VC - Parte 2 - Ejercicio 4
        System.out.println("PARTE 2.4 ------------------------VC-2");
        List<String> titulosPorGenero = listarTitulosPorGenero(libros,Genero.COMEDIA);
        titulosPorGenero.forEach(System.out::println);

        // VC - Parte 2 - Ejercicio 5
        System.out.println("PARTE 2.5 ------------------------VC-2");
        Optional<Libro> primerLibroDelAutor = primerLibroDeUnAutor(libros,"Miguel de Cervantes");
        primerLibroDelAutor.ifPresent(System.out::println);

        // VC - Parte 2 - Ejercicio 6
        System.out.println("PARTE 2.6 ------------------------VC-2");
        Map<Integer, List<Libro>> librosPorAnio = listarLibrosPoranio(libros);
        librosPorAnio.forEach((anio,libro)-> {
            System.out.println("Año " + anio);
            libro.forEach(System.out::println);
        });
    }

    // Creo el metodo para filtrar por Autor
    public static List<Libro> filtrarPorAutor (List<Libro> libros, String autor) {
        return libros.stream()
                .filter(libro -> libro.getAutor().equals(autor))
                .collect(Collectors.toList());
    }

    // Calculo el precio total de los libros
    public static double calcularPrecioTotal (List<Libro> libros){
        return libros.stream()
                .mapToDouble(Libro::getPrecio)
                .sum();
    }

    // Ordenar los libros por fecha de creación
    public static List<Libro> ordenarPorFecha (List<Libro> libros){
        return libros.stream()
                .sorted(Comparator.comparing(Libro::getFechaCreacion))
                .collect(Collectors.toList());
    }

    /*  Metodos creados en segunda VC */

    // Libros por Genero
    public static List<Libro> filtradoPorGenero (List<Libro> libros, Genero genero){
        return libros.stream()
                .filter(libro -> libro.getGenero().equals(genero))
                .collect(Collectors.toList());
    }

    // Lista de Titulos por Genero
    public static List<String> listarTitulosPorGenero (List<Libro> libros, Genero genero){
        return libros.stream()
                .filter(libro -> libro.getGenero().equals(genero))
                .map(Libro::getTitulo)
                .collect(Collectors.toList());

    }

    public static Optional<Libro> primerLibroDeUnAutor (List<Libro> libros, String autor){
        return libros.stream()
                .filter(libro -> libro.getAutor().equals(autor)).findFirst();

    }

    public static Map<Integer, List<Libro>> listarLibrosPoranio (List<Libro> libros){
        return libros.stream()
                .collect(Collectors.groupingBy(libro -> libro.getFechaCreacion().getYear()));
    }

    }
