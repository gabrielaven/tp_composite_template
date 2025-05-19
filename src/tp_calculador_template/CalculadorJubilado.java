package tp_calculador_template;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends CalculadorConIVA {
    public CalculadorJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double porcentajeIVA() {
        return of(mesEnPromocion).equals(now().getMonth()) ? 0.0 : 0.10;
    }
}
