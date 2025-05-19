package tp_calculador_template;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends CalculadorConIVA {
    public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double porcentajeIVA() {
        return of(mesEnPromocion).equals(now().getMonth()) ? 0.15 : 0.21;
    }
}
