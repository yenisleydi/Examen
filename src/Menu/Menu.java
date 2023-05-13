package Menu;

import Datos.Alumno;
import Datos.Libros;
import Datos.Profesor;
import MostrarDatos.MostrarProfesor;
import MostrarDatos.MostrarLibros;
import MostrarDatos.MostrarUsuarios;
import Registros.RegistrarProfesor;
import Registros.RegistroUsuario;
import Registros.RegistroLibro;
import Usuario.PedirLibro;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    ArrayList<Profesor> profesors=new ArrayList<Profesor>();
    ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
    ArrayList<Libros> libros=new ArrayList<Libros>();
    RegistroLibro registroLibro=new RegistroLibro(libros);
    RegistroUsuario registroUsuario=new RegistroUsuario(alumnos);
    MostrarLibros mostrarLibros=new MostrarLibros(libros);
    MostrarProfesor mostrarProfesor=new MostrarProfesor(profesors);
    MostrarUsuarios mostrarUsuarios=new MostrarUsuarios(alumnos);
    RegistrarProfesor registrarProfesor=new RegistrarProfesor(profesors);
    PedirLibro pedirLibro=new PedirLibro(libros,alumnos,profesors);
    public void menu(){
        int cont=0;
        int opcion;
        do {
        Scanner scanner=new Scanner(System.in);
        System.out.println("---------------B I B L I O T  E C A-------------------");
        System.out.println("[1]. Registrar usuario");
        System.out.println("[2]. Registrar libro");
        System.out.println("[3]. Operacion Biblioteca");
        System.out.println("[4]. Mostrar libros");
        System.out.println("[5]. Mostrar usuarios");
        System.out.println("[6]. Operacion Usuario");
        System.out.println("[7]. Salir");
        opcion= scanner.nextInt();
        switch (opcion){
            case 1:
                int eleccion;
                cont++;
                do {
                System.out.println("Ingrese el tipo de usuario ([1] estudiante, [2]profesor [3]Regresar)");
                 eleccion=scanner.nextInt();
                scanner.nextLine();
                switch (eleccion) {
                    case 1:
                        registroUsuario.registrar();
                        break;
                    case 2:
                        registrarProfesor.registrar();
                        break;
                    }
                }while(eleccion!=3);
                break;
            case 2:
                registroLibro.IngresarLibros();
                break;
            case 3:
                System.out.println("Ingrese PIN para acceder");
                int contraseña=scanner.nextInt();
                if (contraseña==12345){
                    System.out.println("Bienvenido");
                }
                else {
                    System.out.println("incorrecto");
                }
                break;
            case 4:
                mostrarLibros.mostrarLibro();
                break;
            case 5:
                do {
                    System.out.println("Ingrese el tipo de usuario ([1] estudiante, [2]profesor [3]Regresar)");
                    eleccion=scanner.nextInt();
                    scanner.nextLine();
                    switch (eleccion) {
                        case 1:
                            mostrarUsuarios.mostrar();
                            break;
                        case 2:
                            mostrarProfesor.mostrar();
                            break;
                    }
                }while(eleccion!=3);

                break;
            case 6:
                do {
                    System.out.println("[1] Solicitar libro " +
                                        "[2]Devolver libro" +
                                        "[3]Pagar multa  " +
                                        "[4] Regresar)");
                    eleccion=scanner.nextInt();
                    scanner.nextLine();
                    switch (eleccion) {
                        case 1:
                            pedirLibro.pedir();
                            break;
                        case 2:

                            break;
                        case 3:
                            break;
                    }
                }while(eleccion!=4);

                break;
        }
    }while (opcion!=7);
    }
}
