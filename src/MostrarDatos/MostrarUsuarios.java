package MostrarDatos;

import Datos.Alumno;

import java.util.ArrayList;

public class MostrarUsuarios {
    private ArrayList<Alumno> alumnos;
    public MostrarUsuarios(ArrayList<Alumno> alumnos){
        this.alumnos=alumnos;
    }
    public void mostrar(){
        for (Alumno alumno:alumnos) {
            System.out.println("Nombre: "+alumno.getNombre());
            System.out.println("Apellidos: "+alumno.getApellido());
            System.out.println("Edad: "+alumno.getEdad());
            System.out.println("Direcccion: "+alumno.getDireccion());
            System.out.println("Telefono: "+alumno.getTelefono());
            System.out.println("Correo: "+alumno.getCorreo());
            System.out.println("Semestre: "+alumno.getSemestre());
            System.out.println("Matricula: "+alumno.getMatricula());
            System.out.println("Carrera: "+alumno.getCarrera());
        }
    }
}
