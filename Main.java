/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", "ISBN001");
        Usuario usuario1 = new Usuario("Kelvin Garcia", 1);

        System.out.println("Disponible: " + libro1.consultarDisponibilidad());

        libro1.prestarLibro();
        usuario1.agregarLibroPrestado(libro1);

        Prestamo prestamo1 = new Prestamo("01/06/2026", usuario1, libro1);

        System.out.println();
        prestamo1.mostrarPrestamo();

        System.out.println();
        usuario1.mostrarLibrosPrestados();

        System.out.println();
        libro1.devolverLibro();

        System.out.println("Disponible: " + libro1.consultarDisponibilidad());
    }
}
