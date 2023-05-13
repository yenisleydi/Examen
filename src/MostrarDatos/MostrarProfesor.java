package MostrarDatos;

import Datos.Alumno;
import Datos.Profesor;

import java.util.ArrayList;

public class MostrarProfesor {
    ArrayList<Profesor> profesors;
    public MostrarProfesor(ArrayList<Profesor> profesors){
        this.profesors=profesors;
    }
    public void mostrar(){
        for (Profesor profesor:profesors) {
            System.out.println("Nombre: "+profesor.getNombre());
            System.out.println("Apellidos: "+profesor.getApellido());
            System.out.println("Edad: "+profesor.getEdad());
            System.out.println("Direcccion: "+profesor.getDireccion());
            System.out.println("Telefono: "+profesor.getTelefono());
            System.out.println("Correo: "+profesor.getCorreo());
            System.out.println("Instituto: "+profesor.getInstituto());
            System.out.println("Area de adscripcion: "+profesor.getAreaAdscripcion());

        }
    }
}
