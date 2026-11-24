package usuarios;

public class Conductor extends Usuario {
    private String placaVehiculo;
    private double saldoBilletera;

    public Conductor() {
        super();
    }

    public Conductor(String idUsuario, String nombre, String correo,
                     String placaVehiculo, double saldoBilletera) {
        super(idUsuario, nombre, correo);
        this.placaVehiculo = placaVehiculo;
        this.saldoBilletera = saldoBilletera;
    }

    public Conductor(String idUsuario) {
        this(idUsuario, null, null, null, 0.0);
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public double getSaldoBilletera() {
        return saldoBilletera;
    }

    public void setSaldoBilletera(double saldoBilletera) {
        this.saldoBilletera = saldoBilletera;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Placa del Vehículo: " + placaVehiculo + "\n" + "Saldo en Billetera: " + saldoBilletera;
    }
}
