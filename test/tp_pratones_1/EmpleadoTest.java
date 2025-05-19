package tp_pratones_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    public void testSalarioEmpleadoRegular() {
        EmpleadoRegular e1 = new EmpleadoRegular("Juan", 1000);
        assertEquals(1000, e1.calcularSalarioTotal());
    }

    @Test
    public void testSalarioJerarquia() {
        EmpleadoRegular emp1 = new EmpleadoRegular("Ana", 900);
        EmpleadoRegular emp2 = new EmpleadoRegular("Luis", 900);
        LiderProyecto lider = new LiderProyecto("Carla", 1200);
        lider.agregarSubordinado(emp1);
        lider.agregarSubordinado(emp2);

        MandoMedio mando = new MandoMedio("hernan", 1500);
        mando.agregarSubordinado(lider);

        Gerente gerente = new Gerente("Sofía", 2000);
        gerente.agregarSubordinado(mando);

        Director director = new Director("tomas", 3000);
        director.agregarSubordinado(gerente);

        double total = director.calcularSalarioTotal();
        assertEquals(9500, total);
    }
}
