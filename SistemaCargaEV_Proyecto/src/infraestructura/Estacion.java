package infraestructura;

public class Estacion {
    private String idEstacion;
    private String nombre;
    private String ubicacion;
    private TarifaHoraria tarifa;

    public Estacion() {
    }

    public Estacion(String idEstacion, String nombre, String ubicacion, TarifaHoraria tarifa) {
        this.idEstacion = idEstacion;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tarifa = tarifa;
    }

    public Estacion(String idEstacion) {
        this(idEstacion, null, null, null);
    }

    public String getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public TarifaHoraria getTarifa() {
        return tarifa;
    }

    public void setTarifa(TarifaHoraria tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estacion other = (Estacion) obj;
        if ((this.idEstacion == null) ? (other.idEstacion != null) : !this.idEstacion.equals(other.idEstacion)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.idEstacion != null ? this.idEstacion.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ID de Estación: " + idEstacion + "\n" + "Nombre: " + nombre + "\n" + "Ubicación: " + ubicacion + "\n" + "Tarifa: " + tarifa;
    }
}
