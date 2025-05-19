package tp_comercio_template;

public class RemeraNacional extends Remera {
    private double costoTransporte;

    public RemeraNacional(double precioUnitario, double costoTransporte) {
        super(precioUnitario);
        this.costoTransporte = costoTransporte;
    }

    @Override
    double aplicarRecargos(double precio) {
        return precio + costoTransporte * 0.015;
    }

    @Override
    double aplicarBonificaciones(double precio) {
        return precio - precio * 0.20;
    }

    @Override
    double aplicarMargenComercial(double precio) {
        return precio + precio * 0.15;
    }
}
