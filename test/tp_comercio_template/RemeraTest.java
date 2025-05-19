package tp_comercio_template;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemeraTest {

    @Test
    public void testPrecioRemeraImportada() {
        Remera remera = new RemeraImportada(80.0);
        double esperado = 108.15;
        double obtenido = remera.calcularPrecioFinal();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testPrecioRemeraNacional() {
        Remera remera = new RemeraNacional(100.0, 6.0);
        double esperado = 92.0828;
        double obtenido = remera.calcularPrecioFinal();
        assertEquals(esperado, obtenido);
    }
}
