package edu.utec.Repaso.Vcs;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {

        //Parte 2
        System.out.println("PARTE 2 --Crea una lista de libros y añade algunos libros a la lista. --");

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("1234567890", "El libro de la selva", "Rudyard Kipling", LocalDate.of(1894, 1, 1), 19.99, Genero.FICCION));
        libros.add(new Libro("0987654321", "Don Quijote de la Mancha", "Miguel de Cervantes", LocalDate.of(1605, 1, 1), 24.99, Genero.POLICIAL));
        libros.add(new Libro("1357924680", "Cien años de soledad", "Gabriel García Márquez", LocalDate.of(1967, 1, 1), 29.99, Genero.COMEDIA));

        // Nuevos elementos cargados en VC2
        libros.add(new Libro("6357454680", "Crónica de una muerte anunciada", "Gabriel García Márquez", LocalDate.of(1981, 1, 1), 30.99, Genero.COMEDIA));
        libros.add(new Libro("9345464687", "En agosto nos vemos", "Gabriel García Márquez", LocalDate.of(2024, 1, 1), 30.99, Genero.COMEDIA));
        libros.add(new Libro("9345464687", "La tregua", "Mario Benedetti", LocalDate.of(1960, 1, 1), 30.99, Genero.FICCION));
        libros.add(new Libro("9345464687", "La noche de los feos", "Mario Benedetti", LocalDate.of(1984, 1, 1), 30.99, Genero.COMEDIA));
        libros.add(new Libro("9345464687", "Cuentos de la selva", "Horacio Quiroga", LocalDate.of(1918, 1, 1), 17.99, Genero.FICCION));
        libros.add(new Libro("9345464687", "El almohadon de plumas", "Horacio Quiroga", LocalDate.of(1917, 1, 1), 10.99, Genero.FICCION));
        libros.add(new Libro("9345464687", "La gallina degollada", "Horacio Quiroga", LocalDate.of(1917, 1, 1), 15.99, Genero.FICCION));


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

        //Parte 3 Vc 2
        System.out.println();
        System.out.println("VC 2 Parte 3 - filtrar por genero ");

        List<Libro> librosPorGenero = filtradoPorGenero(libros,Genero.COMEDIA);
        librosPorGenero.forEach(System.out::println);

        //Parte 3.1 Vc 2
        System.out.println();
        System.out.println("Extra Parte 3.1 - filtrar por genero y titulo ");

        List<Libro> LibrosPorGeneroYTitulo = filtradoPorGeneroYTitulo(libros, Genero.FICCION,"El libro de la selva");
        LibrosPorGeneroYTitulo.forEach(System.out::println);

        //Parte 4 Vc 2
        System.out.println();
        System.out.println("Parte 4 - Listar titulos por genero ");

        List<String> TitulosPorGenero = listarTitulosPorGenero(libros, Genero.FICCION);
        TitulosPorGenero.forEach(System.out::println);

        //Parte 5 Vc 2
        System.out.println();
        System.out.println("Parte 5 - Primer libro de un autor dado ");
        Optional<Libro> pimerLibroAutor = primerLibroDeAutor(libros,"Gabriel García Márquez" );
        pimerLibroAutor.ifPresent(System.out::println);

        //Parte 6 Vc 2
        System.out.println();
        System.out.println("Parte 6 - Agrupar libros por año ");
        Map<Integer, List<Libro>> listadoLibrosPoranio = librosPorAnio(libros);
        listadoLibrosPoranio.forEach((anio, libro) ->
            {
                System.out.println("Año " + anio);
             libro.forEach(System.out::println);

            });

        //Parte 7 Vc 2
        System.out.println();
        System.out.println("Parte 7 - Precio promedio por genero ");
        Map<Genero, Double> precioPromedioPorGenero = precioPromedioPorGenero(libros);
        precioPromedioPorGenero.forEach((genero, precio) ->
                System.out.println((genero + ": " + precio)));


        //Parte 8 Vc 2
        System.out.println();
        System.out.println("Parte 8 - Libros despues de año dado ");
        List<Libro> librosMayoresAlAnio = librosPorFecha(libros, 1950);
        librosMayoresAlAnio.forEach(System.out::println);

    }

    ///////////////////////////Declaro las funciones://///////////////////////////////

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

    //VC2- Parte 3 Filtrado por Genero

    public static List<Libro> filtradoPorGenero (List<Libro> libros, Genero genero){
        return libros.stream()
                .filter(libro -> libro.getGenero().equals(genero))
                .collect(Collectors.toList());
    }

    //VC2 - Extra Parte 3.1
    public static List<Libro> filtradoPorGeneroYTitulo (List<Libro> libros, Genero genero, String titulo ){
        return libros.stream()
                .filter(libro -> libro.getGenero().equals(genero) && libro.getTitulo().equals(titulo))
                .collect(Collectors.toList());
    }

    //VC2 - Parte 4
    public static List<String> listarTitulosPorGenero (List<Libro> libros, Genero genero){
        return libros.stream()
                .filter(libro -> libro.getGenero().equals(genero))   //filtra por genero
                .map(Libro::getTitulo)                              // recorre los libros y se queda con el título
                .collect(Collectors.toList());                      // Collectar la información y crear una nueva lista
    }

    //VC2 - Parte 5
    public static Optional<Libro> primerLibroDeAutor (List<Libro> libros, String autor){
        return libros.stream()
                .filter(libro -> libro.getAutor().equals(autor)).findFirst();

    }

    //VC2 - Parte 6
    public static Map<Integer, List<Libro>> librosPorAnio (List<Libro> libros){
        return libros.stream()
                .collect(Collectors.groupingBy(libro -> libro.getFechaCreacion().getYear()));
    }

    //VC2 - Parte 7
    public static Map<Genero, Double> precioPromedioPorGenero (List<Libro> libros)
    {
        return libros.stream()
                .collect(Collectors.groupingBy(Libro::getGenero,
                            Collectors.averagingDouble(Libro::getPrecio))
                );
    }

    // VC2 - Parte 8
    public static List<Libro> librosPorFecha (List<Libro> libros, int anio){
        return libros.stream()
                .filter(libro -> libro.getFechaCreacion().getYear() > anio)
                .collect(Collectors.toList());
    }


}
