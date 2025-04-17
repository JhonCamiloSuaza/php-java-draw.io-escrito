package Library;

import java.text.DecimalFormat;

public class LicenciaC extends Licencia {
    public LicenciaC() {
        this.tipo = "LicenciaC (Vehículos particulares)";
        this.duracion = 36;  // Duración en meses
        this.costo = 650000;  //  (COP)
    }

    @Override
    public String detallesLicencia() {
        // Formatear el costo con punto y coma para miles y decimales
        DecimalFormat formato = new DecimalFormat("#,###.00");
        String costoFormateado = formato.format(costo);
        return "Tipo de Licencia: " + tipo + "\nDuración: " + duracion + " meses\nCosto: $" + costoFormateado + " COP";
    }
}