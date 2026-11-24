package sesiones;

import usuarios.Usuario;

public class Notificacion {
    private String idNotificacion;
    private Usuario destinatario;
    private String mensaje;

    public Notificacion() {
    }

    public Notificacion(String idNotificacion, Usuario destinatario, String mensaje) {
        this.idNotificacion = idNotificacion;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public Notificacion(String idNotificacion) {
        this(idNotificacion, null, null);
    }

    public String getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "ID de Notificación: " + idNotificacion + "\n" + "Destinatario: " + destinatario + "\n" + "Mensaje: " + mensaje;
    }
}
