package infraestructura;

import enums.EstadoPuerto;
import enums.TipoConector;

public class Puerto {
    private String idPuerto;
    private TipoConector tipoConector;
    private EstadoPuerto estado;
    private double potenciaKw;

    public Puerto() {
    }

    public Puerto(String idPuerto, TipoConector tipoConector, EstadoPuerto estado, double potenciaKw) {
        this.idPuerto = idPuerto;
        this.tipoConector = tipoConector;
        this.estado = estado;
        this.potenciaKw = potenciaKw;
    }

    public Puerto(String idPuerto) {
        this(idPuerto, null, null, 0.0);
    }

    public String getIdPuerto() {
        return idPuerto;
    }

    public void setIdPuerto(String idPuerto) {
        this.idPuerto = idPuerto;
    }

    public TipoConector getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(TipoConector tipoConector) {
        this.tipoConector = tipoConector;
    }

    public EstadoPuerto getEstado() {
        return estado;
    }

    public void setEstado(EstadoPuerto estado) {
        this.estado = estado;
    }

    public double getPotenciaKw() {
        return potenciaKw;
    }

    public void setPotenciaKw(double potenciaKw) {
        this.potenciaKw = potenciaKw;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puerto other = (Puerto) obj;
        if ((this.idPuerto == null) ? (other.idPuerto != null) : !this.idPuerto.equals(other.idPuerto)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.idPuerto != null ? this.idPuerto.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ID de Puerto: " + idPuerto + "\n" + "Tipo de Conector: " + tipoConector + "\n" + "Estado: " + estado + "\n" + "Potencia (kW): " + potenciaKw;
    }
}
