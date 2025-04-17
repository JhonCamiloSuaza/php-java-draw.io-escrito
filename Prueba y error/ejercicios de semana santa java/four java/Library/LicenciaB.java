package Library;

import java.text.DecimalFormat;

public class LicenciaB extends Licencia {
    public LicenciaB() {
        this.tipo = "LicenciaB (Vehículos particulares)";
        this.duracion = 24;  
        this.costo = 410000;  
    }

    @Override
    public String detallesLicencia() {
        // decimales . y , al valor de la conosola
        DecimalFormat formato = new DecimalFormat("#,###.00");
        String costoFormateado = formato.format(costo);
        return "Tipo de Licencia: " + tipo + "\nDuración: " + duracion + " meses\nCosto: $" + costoFormateado + " COP";
    }
}