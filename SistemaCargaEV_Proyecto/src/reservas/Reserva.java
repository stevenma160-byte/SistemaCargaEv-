package reservas;

import enums.EstadoReserva;
import infraestructura.Puerto;
import usuarios.Conductor;

public class Reserva {
    private String codigoReserva;
    private Conductor conductor;
    private Puerto puerto;
    private EstadoReserva estadoReserva;

    public Reserva() {
    }

    public Reserva(String codigoReserva, Conductor conductor, Puerto puerto, EstadoReserva estadoReserva) {
        this.codigoReserva = codigoReserva;
        this.conductor = conductor;
        this.puerto = puerto;
        this.estadoReserva = estadoReserva;
    }

    public Reserva(String codigoReserva) {
        this(codigoReserva, null, null, null);
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Puerto getPuerto() {
        return puerto;
    }

    public void setPuerto(Puerto puerto) {
        this.puerto = puerto;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if ((this.codigoReserva == null) ? (other.codigoReserva != null) : !this.codigoReserva.equals(other.codigoReserva)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.codigoReserva != null ? this.codigoReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Código de Reserva: " + codigoReserva + "\n" + "Conductor: " + conductor + "\n" + "Puerto: " + puerto + "\n" + "Estado: " + estadoReserva;
    }
}
