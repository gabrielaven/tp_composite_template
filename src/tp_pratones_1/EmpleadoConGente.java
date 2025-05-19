package tp_pratones_1;

import java.util.ArrayList;
import java.util.List;

public abstract class EmpleadoConGente extends Empleado {
    protected List<Empleado> subordinados;

    public EmpleadoConGente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(Empleado e) {
        subordinados.add(e);
    }

    @Override
    public double calcularSalarioTotal() {
        double total = salarioBase;
        for (Empleado e : subordinados) {
            total += e.calcularSalarioTotal();
        }
        return total;
    }
}