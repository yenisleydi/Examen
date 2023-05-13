package Usuario;

import Datos.Alumno;
import Datos.Libros;
import Datos.Profesor;
import Registros.RegistroUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedirLibro {
    ArrayList<Libros> libros;
    ArrayList<Alumno> alumnos;
    ArrayList<Profesor> profesors;
    public PedirLibro(ArrayList<Libros> libros,ArrayList<Alumno> alumnos, ArrayList<Profesor> profesors){
        this.libros=libros;
        this.alumnos=alumnos;
        this.profesors=profesors;
    }
    public void pedir(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("------ B I E N V E N I D O  A  L A  B I B L I O T E C A-------");
        System.out.println("Ingrese su nombre");
        String nom=scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String ape=scanner.nextLine();
        boolean registro=false;
        for (Alumno alumno:alumnos) {
            if (alumno.getNombre().equals(nom) && alumno.getApellido().equals(ape)){
                registro=true;
                break;
            }
        }
        if (!registro) {
                for (Profesor profesor:profesors) {
                    if (profesor.getNombre().equals(nom) && profesor.getApellido().equals(ape)){
                        registro=true;
                        break;
                    }
                }
            }
        if (registro){
            System.out.println("Cuantos libros desea solicictar ");
            int numlibro=scanner.nextInt();
            if(numlibro>3){
                System.out.println("-----------------------------------------------------------");
                System.out.println("|  NO SE PUEDE SOLICITAR MAS DE 3 LIBROS AL MISMO TIEMPO  |");
                System.out.println("------------------------------------------------------------");
            }
            else {
                System.out.println("Ingrese el nombre del libro");
                String nombrelibro=scanner.nextLine();
                scanner.nextLine();
                String []pedidos = new String[3];
                for (Libros libros1:libros) {
                    if(libros1.getTitulo().equals(nombrelibro ) && libros1.getDisponibles().equals("disponible")){
                        pedidos= new String[]{libros1.getTitulo()};
                        System.out.println("libro prestado");
                    }
                    else {
                        System.out.println("no esta disponible");
                    }

                }
            }
        }
        else {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("|   U S T E D   N O  S E   E N C  U E N T R A   R E G I S T R A D O    |");
            System.out.println("------------------------------------------------------------------------\n\n");
            System.out.println("¿D E S E A   R E G I S T R A R S E   E N   L A   B I B L I O T E C A? [1].SI [0]NO");
            int registrarse=scanner.nextInt();
            if (registrarse==1){
                System.out.println("holi");
            }
            else {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("|       N O    P U E D E   S O L I C I T A R    U N    L I B R O       |");
                System.out.println("------------------------------------------------------------------------\n\n");
            }
        }
    }
}
