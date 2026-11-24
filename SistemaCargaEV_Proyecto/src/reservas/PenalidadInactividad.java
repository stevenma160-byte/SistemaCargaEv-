package reservas;

public class PenalidadInactividad {
    private String idPenalidad;
    private Reserva reserva;
    private int minutosExcedidos;
    private double montoPenalidad;

    public PenalidadInactividad() {
    }

    public PenalidadInactividad(String idPenalidad, Reserva reserva, int minutosExcedidos, double montoPenalidad) {
        this.idPenalidad = idPenalidad;
        this.reserva = reserva;
        this.minutosExcedidos = minutosExcedidos;
        this.montoPenalidad = montoPenalidad;
    }

    public PenalidadInactividad(String idPenalidad) {
        this(idPenalidad, null, 0, 0.0);
    }

    public String getIdPenalidad() {
        return idPenalidad;
    }

    public void setIdPenalidad(String idPenalidad) {
        this.idPenalidad = idPenalidad;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getMinutosExcedidos() {
        return minutosExcedidos;
    }

    public void setMinutosExcedidos(int minutosExcedidos) {
        this.minutosExcedidos = minutosExcedidos;
    }

    public double getMontoPenalidad() {
        return montoPenalidad;
    }

    public void setMontoPenalidad(double montoPenalidad) {
        this.montoPenalidad = montoPenalidad;
    }

    @Override
    public String toString() {
        return "ID de Penalidad: " + idPenalidad + "\n" + "Reserva: " + reserva + "\n" + "Minutos Excedidos: " + minutosExcedidos + "\n" + "Monto de Penalidad: " + montoPenalidad;
    }
}
