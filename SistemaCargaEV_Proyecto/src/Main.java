import enums.EstadoPuerto;
import enums.EstadoReserva;
import enums.EstadoSesion;
import enums.TipoConector;
import enums.TipoTransaccion;
import infraestructura.Estacion;
import infraestructura.Puerto;
import infraestructura.TarifaHoraria;
import pagos.ComprobanteFactura;
import pagos.DetalleFactura;
import pagos.TransaccionBilletera;
import reservas.PenalidadInactividad;
import reservas.Reserva;
import sesiones.Notificacion;
import sesiones.SesionCarga;
import sesiones.SistemaCargaEV;
import usuarios.Administrador;
import usuarios.Conductor;

public class Main {
    public static void main(String[] args) {
        SistemaCargaEV sistema = new SistemaCargaEV("SistemaCargaEV");

        TarifaHoraria tarifaValle = new TarifaHoraria("T01", "Horario Valle", 0.18);
        TarifaHoraria tarifaPico = new TarifaHoraria("T02", "Horario Pico", 0.25);

        Estacion estacion1 = new Estacion("E01", "Estacion Norte", "Av. Principal", tarifaValle);
        Estacion estacion2 = new Estacion("E02", "Estacion Sur", "Av. Sur", tarifaPico);

        Puerto puerto1 = new Puerto("P01", TipoConector.TIPO_2, EstadoPuerto.DISPONIBLE, 22.0);
        Puerto puerto2 = new Puerto("P02", TipoConector.CCS2, EstadoPuerto.DISPONIBLE, 50.0);

        Conductor conductor1 = new Conductor("C01", "Carlos Perez", "carlos@correo.com", "PBC-1234", 40.0);
        Conductor conductor2 = new Conductor("C02", "Ana Lopez", "ana@correo.com", "PBC-5678", 25.5);

        Administrador admin1 = new Administrador("A01", "Luis Mora", "luis@correo.com", "EMP-01", "Mañana");

        Reserva reserva1 = new Reserva("R01", conductor1, puerto1, EstadoReserva.ACTIVA);
        PenalidadInactividad penalidad1 = new PenalidadInactividad("PEN01", reserva1, 10, 2.5);

        SesionCarga sesion1 = new SesionCarga("S01", conductor2, puerto2, 15.5, EstadoSesion.EN_CURSO);
        SistemaCargaEV.registrarSesion();

        Notificacion notif1 = new Notificacion("N01", conductor2, "Carga iniciada correctamente");

        TransaccionBilletera trx1 = new TransaccionBilletera("TRX01", conductor1, TipoTransaccion.RECARGA, 10.0);
        DetalleFactura detalle1 = new DetalleFactura("D01", sesion1, 3.88);
        ComprobanteFactura factura1 = new ComprobanteFactura("F-001", conductor2, detalle1, 3.88);

        System.out.println("Sistema: " + sistema);
        System.out.println("--------------------------------------------");
        System.out.println("Estacion 1: " + estacion1);
        System.out.println("Estacion 2: " + estacion2);
        System.out.println("--------------------------------------------");
        System.out.println("Puerto 1: " + puerto1);
        System.out.println("Puerto 2: " + puerto2);
        System.out.println("--------------------------------------------");
        System.out.println("Conductor 1: " + conductor1);
        System.out.println("Conductor 2: " + conductor2);
        System.out.println("--------------------------------------------");
        System.out.println("Administrador 1: " + admin1);
        System.out.println("--------------------------------------------");
        System.out.println("Reserva 1: " + reserva1);
        System.out.println("Penalidad 1: " + penalidad1);
        System.out.println("Sesion 1: " + sesion1);
        System.out.println("Notificacion 1: " + notif1);
        System.out.println("Transaccion 1: " + trx1);
        System.out.println("--------------------------------------------");
        System.out.println("Factura 1: " + factura1);

        // Modificar atributos en ejecucion
        puerto1.setEstado(EstadoPuerto.OCUPADO);
        reserva1.setEstadoReserva(EstadoReserva.COMPLETADA);
        sesion1.setEstadoSesion(EstadoSesion.FINALIZADA);
        sesion1.setEnergiaKwh(20.0);

        System.out.println("--- Despues de modificar datos ---");
        System.out.println("Puerto 1: " + puerto1);
        System.out.println("Reserva 1: " + reserva1);
        System.out.println("Sesion 1: " + sesion1);
    }
}
