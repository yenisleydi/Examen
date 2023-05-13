package Datos;

public class Libros {
    private String isbn;
    private String titulo;
    private String autor;
    private String disponibles;
    private int numLibros;

    public int getNumLibros() {
        return numLibros;
    }
    public String getAutor() {
        return autor;
    }
    public String getDisponibles() {
        return disponibles;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }
    public void setDisponibles(String disponibles) {
        this.disponibles = disponibles;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
