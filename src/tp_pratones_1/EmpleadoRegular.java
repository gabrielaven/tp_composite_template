package tp_pratones_1;

public class EmpleadoRegular extends Empleado {

    public EmpleadoRegular(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase;
    }
}
