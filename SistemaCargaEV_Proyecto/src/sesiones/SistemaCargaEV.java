package sesiones;

public class SistemaCargaEV {
    private String nombreSistema;
    private static int totalSesiones = 0;

    public SistemaCargaEV() {
    }

    public SistemaCargaEV(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public static int getTotalSesiones() {
        return totalSesiones;
    }

    public static void registrarSesion() {
        totalSesiones++;
    }

    @Override
    public String toString() {
        return nombreSistema + ", totalSesiones=" + totalSesiones;
    }
}
