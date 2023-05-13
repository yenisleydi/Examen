package Datos;

public class Alumno extends Usuario{
    private String semestre;
    private String matricula;
    private String carrera;
    private Usuario nombre;
    private Usuario apellido;
    private Usuario edad;
    private Usuario direccion;
    private Usuario telefono;


    public String getCarrera() {
        return carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    @Override
    public void setCorreo(String correo) {
        super.setCorreo(correo);
    }

    @Override
    public void setTelefono(int telefono) {
        super.setTelefono(telefono);
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setNumeroUsuario(int numeroUsuario) {
        super.setNumeroUsuario(numeroUsuario);
    }
}
