package usuarios;

public class Administrador extends Usuario {
    private String codigoEmpleado;
    private String turno;

    public Administrador() {
        super();
    }

    public Administrador(String idUsuario, String nombre, String correo,
                         String codigoEmpleado, String turno) {
        super(idUsuario, nombre, correo);
        this.codigoEmpleado = codigoEmpleado;
        this.turno = turno;
    }

    public Administrador(String idUsuario) {
        this(idUsuario, null, null, null, null);
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Código de Empleado: " + codigoEmpleado + "\n" + "Turno: " + turno;
    }
}
