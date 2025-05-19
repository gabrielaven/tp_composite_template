package tp_calculador_template;


public abstract class CalculadorConIVA implements Calculador {
    protected LogTransaction log;
    protected int mesEnPromocion;

    public CalculadorConIVA(LogTransaction log, int mesEnPromocion) {
        this.log = log;
        this.mesEnPromocion = mesEnPromocion;
    }

    @Override
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto + precioProducto * this.porcentajeIVA();
        log.log(this.getClass().getName());
        return precioTotal;
    }

    protected abstract double porcentajeIVA();
}
