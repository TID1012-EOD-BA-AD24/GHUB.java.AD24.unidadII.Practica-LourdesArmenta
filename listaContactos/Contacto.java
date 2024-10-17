package listaContactos;

public class Contacto {
    //Atributos
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    private String celular;
    //Metodos
    //Constructores
    public Contacto(String nombres, String apellidos, String direccion, String correo, String telefono, String celular) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.celular = celular;
    }

     //getter y setterr
     public String getNombres() {
        return nombres;
    }
    public void setNombre(String nombres) {
        this.nombres = nombres;
    }
    public String getApellido() {
        return apellidos;
    }
    public void setApellido(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }


    public String toString() {
        return  nombres + ", " + apellido + ", " + direccion + ", "
                + correo + ", " + telefono + ", " + celular ;
    }

    
    
    
}
