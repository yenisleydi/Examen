package Datos;

public class Profesor extends Usuario{
    private Usuario nombre;
    private Usuario apellido;
    private Usuario edad;
    private Usuario direccion;
    private Usuario telefono;
    private Usuario correo;
    private String instituto;
    private String areaAdscripcion;

    public void setAreaAdscripcion(String areaAdscripcion) {
        this.areaAdscripcion = areaAdscripcion;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
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

    public String getInstituto() {
        return instituto;
    }

    public String getAreaAdscripcion() {
        return areaAdscripcion;
    }
}
