package Registros;

import Datos.Alumno;
import Datos.Usuario;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RegistroUsuario extends Alumno{
    private ArrayList<Alumno> alumnos;
    public RegistroUsuario(ArrayList<Alumno> alumnos){
        this.alumnos=alumnos;
    }
    public void registrar(){
        Alumno dato=new Alumno();
        Scanner scanner=new Scanner(System.in);
        System.out.println("----------------A L U M N O----------------");
        System.out.println("Ingrese el nombre");
        dato.setNombre(scanner.nextLine());
        System.out.println("Ingresa el apellido ");
        dato.setApellido(scanner.nextLine());
        System.out.println("Ingrese la edad ");
        dato.setEdad(scanner.nextInt());
        System.out.println("Ingrese la direccion");
        dato.setDireccion(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Ingrese el telefono");
        dato.setTelefono(scanner.nextInt());
        System.out.println("Ingrese el correo");
        dato.setCorreo(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Ingresa el semestre");
        dato.setSemestre(scanner.nextLine());
        System.out.println("Ingresa la matricula");
        dato.setMatricula(scanner.nextLine());
        System.out.println("Ingresa la carrera");
        dato.setCarrera(scanner.nextLine());
        alumnos.add(dato);
    }

}
