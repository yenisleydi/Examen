package Registros;

import Datos.Alumno;
import Datos.Profesor;
import Datos.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarProfesor extends Profesor{
    private ArrayList<Profesor> profesors;
    public  RegistrarProfesor(ArrayList<Profesor> profesors){
        this.profesors=profesors;
    }
    public void registrar(){
        Profesor datos=new Profesor();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el nombre ");
        datos.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido");
        datos.setApellido(scanner.nextLine());
        System.out.println("Ingrese la edad ");
        datos.setEdad(scanner.nextInt());
        System.out.println("Ingrese la direccion");
        scanner.nextLine();
        datos.setDireccion(scanner.nextLine());
        System.out.println("Ingrese el telefono");
        datos.setTelefono(scanner.nextInt());
        System.out.println("Ingrese el correo");
        datos.setCorreo(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Ingrese el instituto");
        datos.setInstituto(scanner.nextLine());
        System.out.println("Ingrese la adscripcion");
        datos.setAreaAdscripcion(scanner.nextLine());
        profesors.add(datos);
    }
}
