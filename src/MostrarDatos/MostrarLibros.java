package MostrarDatos;

import Datos.Libros;

import java.util.ArrayList;

public class MostrarLibros {
    ArrayList<Libros> libros;
    public MostrarLibros(ArrayList<Libros> libros){
        this.libros=libros;
    }
    public void mostrarLibro(){
        for (Libros libros1:libros) {
            System.out.println("ISBN: "+libros1.getIsbn());
            System.out.println("Titulo: "+libros1.getTitulo());
            System.out.println("Autor: "+libros1.getAutor());
            System.out.println("Estado: "+libros1.getDisponibles());
            System.out.println("Numero de libros: "+libros1.getNumLibros());
        }
    }
}
