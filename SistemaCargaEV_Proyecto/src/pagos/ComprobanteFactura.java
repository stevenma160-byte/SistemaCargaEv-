package pagos;

import usuarios.Conductor;

public class ComprobanteFactura {
    private String numeroFactura;
    private Conductor conductor;
    private DetalleFactura detalle;
    private double total;

    public ComprobanteFactura() {
    }

    public ComprobanteFactura(String numeroFactura, Conductor conductor,
            DetalleFactura detalle, double total) {

        this.numeroFactura = numeroFactura;
        this.conductor = conductor;
        this.detalle = detalle;
        this.total = total;
    }

    public ComprobanteFactura(String numeroFactura) {
        this(numeroFactura, null, null, 0.0);
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public DetalleFactura getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleFactura detalle) {
        this.detalle = detalle;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Número de Factura: " + numeroFactura + "\n" + "Conductor: " + conductor + "\n" + "Detalle: " + detalle + "\n" + "Total: " + total;
    }
}
