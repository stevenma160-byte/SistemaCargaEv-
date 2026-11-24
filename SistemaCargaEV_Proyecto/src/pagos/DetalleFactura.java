package pagos;

import sesiones.SesionCarga;

public class DetalleFactura {
    private String idDetalle;
    private SesionCarga sesion;
    private double subtotal;

    public DetalleFactura() {
    }

    public DetalleFactura(String idDetalle, SesionCarga sesion, double subtotal) {
        this.idDetalle = idDetalle;
        this.sesion = sesion;
        this.subtotal = subtotal;
    }

    public DetalleFactura(String idDetalle) {
        this(idDetalle, null, 0.0);
    }

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public SesionCarga getSesion() {
        return sesion;
    }

    public void setSesion(SesionCarga sesion) {
        this.sesion = sesion;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "ID de Detalle: " + idDetalle + "\n" + "Sesión: " + sesion + "\n" + "Subtotal: " + subtotal;
    }
}
