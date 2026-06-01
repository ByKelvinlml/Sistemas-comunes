/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    public boolean consultarDisponibilidad() {
        return disponible;
    }

    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro fue prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro fue devuelto.");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }
}