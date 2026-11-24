package sesiones;

import enums.EstadoSesion;
import infraestructura.Puerto;
import usuarios.Conductor;

public class SesionCarga {
    private String idSesion;
    private Conductor conductor;
    private Puerto puerto;
    private double energiaKwh;
    private EstadoSesion estadoSesion;

    public SesionCarga() {
    }

    public SesionCarga(String idSesion, Conductor conductor, Puerto puerto,
            double energiaKwh, EstadoSesion estadoSesion) {
        this.idSesion = idSesion;
        this.conductor = conductor;
        this.puerto = puerto;
        this.energiaKwh = energiaKwh;
        this.estadoSesion = estadoSesion;
    }

    public SesionCarga(String idSesion) {
        this(idSesion, null, null, 0.0, null);
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
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

    public double getEnergiaKwh() {
        return energiaKwh;
    }

    public void setEnergiaKwh(double energiaKwh) {
        this.energiaKwh = energiaKwh;
    }

    public EstadoSesion getEstadoSesion() {
        return estadoSesion;
    }

    public void setEstadoSesion(EstadoSesion estadoSesion) {
        this.estadoSesion = estadoSesion;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SesionCarga other = (SesionCarga) obj;
        if ((this.idSesion == null) ? (other.idSesion != null) : !this.idSesion.equals(other.idSesion)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.idSesion != null ? this.idSesion.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ID de Sesión: " + idSesion + "\n" + "Conductor: " + conductor + "\n" + "Puerto: " + puerto + "\n" + "Energía (kWh): " + energiaKwh + "\n" + "Estado: " + estadoSesion;
    }
}
