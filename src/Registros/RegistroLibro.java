package Registros;

import Datos.Libros;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroLibro {
    private ArrayList<Libros> libros;
    public RegistroLibro(ArrayList<Libros> libros){
        this.libros=libros;
    }
    public void IngresarLibros(){
        Libros libros1=new Libros();
        Scanner scanner=new Scanner(System.in);
        System.out.println("---------L I B R O S-------------");
        System.out.println("Ingresar codigo IBSN");
        libros1.setIsbn(scanner.nextLine());
        System.out.println("Ingresar el titulo");
        libros1.setTitulo(scanner.nextLine());
        System.out.println("Ingresar el autor");
        libros1.setAutor(scanner.nextLine());
        System.out.println("Disponible - No disponible ");
        libros1.setDisponibles(scanner.nextLine());
        System.out.println("Ingresa el numero de libros");
        libros1.setNumLibros(scanner.nextInt());
        libros.add(libros1);
    }
}
