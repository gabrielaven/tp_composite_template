package tp_gestorseguro_composite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComponenteSeguroTest {

    @Test
    public void testSeguroSimple() {
        SeguroSimple hogar = new SeguroSimple("Hogar", 10000);
        assertEquals(10000, hogar.calcularCosto());
    }

    @Test
    public void testPaqueteSeguroConDosSimples() {
        SeguroSimple hogar = new SeguroSimple("Hogar", 10000);
        SeguroSimple auto = new SeguroSimple("Auto", 15000);

        PaqueteSeguro paquete = new PaqueteSeguro();
        paquete.agregar(hogar);
        paquete.agregar(auto);

        double esperado = (10000 + 15000) * 0.90; 
        assertEquals(esperado, paquete.calcularCosto());
    }

}
