/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private int id;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }

    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados de " + nombre + ":");

        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}