package tp_patrones_2_composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemProyectoTest {

    @Test
    public void testHistoriaUsuario() {
        HistoriaUsuario historia = new HistoriaUsuario("Login");
        historia.agregarItem(new Tarea("Diseño UI", 20));
        historia.agregarItem(new Tarea("Backend", 30));

        int esperado = 50;
        int obtenido = historia.getTiempo();

        assertEquals(esperado, obtenido);
    }

    @Test
    public void testProyectoCompleto() {
        Proyecto proyecto = new Proyecto();

        HistoriaUsuario historia1 = new HistoriaUsuario("Login");
        historia1.agregarItem(new Tarea("Diseño UI", 20));
        historia1.agregarItem(new Tarea("Backend", 30));

        HistoriaUsuario historia2 = new HistoriaUsuario("Registro");
        historia2.agregarItem(new Tarea("Validación", 10));

        Spike spike = new Spike("Analizar algo", 40);

        proyecto.agregarItem(historia1);
        proyecto.agregarItem(historia2);
        proyecto.agregarItem(spike);

        int esperado = 100;
        int obtenido = proyecto.getTiempo();

        assertEquals(esperado, obtenido);
    }
}
