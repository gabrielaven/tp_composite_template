package tp_calculador_template;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadorTest {

    @Test
    public void testPrecioParaJubilado() {
        Calculador calc = new CalculadorJubilado(new LogTransactionFake(), 6);
        double precio = 100.0;
        double esperado = 110.0; 
        assertEquals(esperado, calc.calcularPrecio(precio), 0.01);
    }

    @Test
    public void testPrecioParaNoJubilado() {
        Calculador calc = new CalculadorNoJubilado(new LogTransactionFake(), 6);
        double precio = 100.0;
        double esperado = 121.0; 
        assertEquals(esperado, calc.calcularPrecio(precio), 0.01);
    }
}
