package usuarios;

public class Usuario {
    protected String idUsuario;
    protected String nombre;
    protected String correo;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombre, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Usuario(String idUsuario) {
        this(idUsuario, null, null);
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if ((this.idUsuario == null) ? (other.idUsuario != null) : !this.idUsuario.equals(other.idUsuario)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.idUsuario != null ? this.idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ID de Usuario: " + idUsuario + "\n" + "Nombre: " + nombre + "\n" + "Correo: " + correo;
    }
}
