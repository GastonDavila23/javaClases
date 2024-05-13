public class Persona {

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private String usuario = null;
    private String contrasenia = null;

    public Persona() {
    }

    public Persona(String nombre, String cedula, String telefono, String correo, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    private void restablecerContrasenia(){

    }
    private void iniciarSesion(String[]usuario){

    }

}
