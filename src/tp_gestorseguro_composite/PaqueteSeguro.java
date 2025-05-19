package tp_gestorseguro_composite;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguro implements ComponenteSeguro {
    private List<ComponenteSeguro> componentes;

    public PaqueteSeguro() {
        this.componentes = new ArrayList<>();
    }

    public void agregar(ComponenteSeguro componente) {
        componentes.add(componente);
    }

    @Override
    public double calcularCosto() {
        double total = 0;
        int cantidad = 0;

        for (ComponenteSeguro c : componentes) {
            total += c.calcularCosto();
            cantidad++;
        }

        double descuento = 0.05 * cantidad;
        return total * (1 - descuento);
    }
}