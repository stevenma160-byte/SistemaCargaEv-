package pagos;

import enums.TipoTransaccion;
import usuarios.Conductor;

public class TransaccionBilletera {
    private String idTransaccion;
    private Conductor conductor;
    private TipoTransaccion tipoTransaccion;
    private double monto;

    public TransaccionBilletera() {
    }

    public TransaccionBilletera(String idTransaccion, Conductor conductor,
            TipoTransaccion tipoTransaccion, double monto) {
        this.idTransaccion = idTransaccion;
        this.conductor = conductor;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
    }

    public TransaccionBilletera(String idTransaccion) {
        this(idTransaccion, null, null, 0.0);
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TransaccionBilletera other = (TransaccionBilletera) obj;
        if ((this.idTransaccion == null) ? (other.idTransaccion != null)
                : !this.idTransaccion.equals(other.idTransaccion)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.idTransaccion != null ? this.idTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ID de Transacción: " + idTransaccion + "\n" + "Conductor: " + conductor + "\n" + "Tipo de Transacción: " + tipoTransaccion + "\n" + "Monto: " + monto;
    }
}
