package tp_comercio_template;

public abstract class Remera {
    protected double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final double calcularPrecioFinal() {
        double precio = precioUnitario;
        precio = aplicarRecargos(precio);
        precio = aplicarImpuestos(precio);
        precio = aplicarBonificaciones(precio);
        precio = aplicarMargenComercial(precio);
        return precio;
    }

    abstract double aplicarRecargos(double precio);
    double aplicarImpuestos(double precio) { return precio; } 
    double aplicarBonificaciones(double precio) { return precio; } 
    abstract double aplicarMargenComercial(double precio);
}
