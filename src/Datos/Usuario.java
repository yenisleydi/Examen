package Datos;

public class Usuario {
    private int numeroUsuario;
    private String nombre;
    private String apellido;
    private int Edad;
    private String direccion;
    private int telefono;
    private String tipo;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipo() {
        return tipo;
    }

}
