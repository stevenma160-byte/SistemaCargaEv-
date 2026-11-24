package infraestructura;

public class TarifaHoraria {
    private String codigoTarifa;
    private String descripcion;
    private double precioKwh;

    public TarifaHoraria() {
    }

    public TarifaHoraria(String codigoTarifa, String descripcion, double precioKwh) {
        this.codigoTarifa = codigoTarifa;
        this.descripcion = descripcion;
        this.precioKwh = precioKwh;
    }

    public TarifaHoraria(String codigoTarifa) {
        this(codigoTarifa, null, 0.0);
    }

    public String getCodigoTarifa() {
        return codigoTarifa;
    }

    public void setCodigoTarifa(String codigoTarifa) {
        this.codigoTarifa = codigoTarifa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioKwh() {
        return precioKwh;
    }

    public void setPrecioKwh(double precioKwh) {
        this.precioKwh = precioKwh;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TarifaHoraria other = (TarifaHoraria) obj;
        if ((this.codigoTarifa == null) ? (other.codigoTarifa != null) : !this.codigoTarifa.equals(other.codigoTarifa)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.codigoTarifa != null ? this.codigoTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Código de Tarifa: " + codigoTarifa + "\n" + "Descripción: " + descripcion + "\n" + "Precio (kWh): " + precioKwh;
    }
}
