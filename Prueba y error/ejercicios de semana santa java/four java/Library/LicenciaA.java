package Library;

import java.text.DecimalFormat;

public class LicenciaA extends Licencia {
    public LicenciaA() {
        this.tipo = "LicenciaA (Motocicletas)";
        this.duracion = 12;  // 
        this.costo = 250000;  // (COP)
    }

    @Override
    public String detallesLicencia() {
         // decimales . y , al valor de la conosola
        DecimalFormat formato = new DecimalFormat("#,###.00");
        String costoFormateado = formato.format(costo);
        return "Tipo de Licencia: " + tipo + "\nDuración: " + duracion + " meses\nCosto: $" + costoFormateado + " COP";
    }
}