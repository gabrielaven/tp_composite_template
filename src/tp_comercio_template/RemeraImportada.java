package tp_comercio_template;

public class RemeraImportada extends Remera {
    public RemeraImportada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    double aplicarRecargos(double precio) {
        return precio + precio * 0.03;
    }

    @Override
    double aplicarImpuestos(double precio) {
        return precio + precio * 0.05;
    }

    @Override
    double aplicarMargenComercial(double precio) {
        return precio + precio * 0.25;
    }
}
