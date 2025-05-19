package tp_gestorseguro_composite;

public class SeguroSimple implements ComponenteSeguro {
    private String nombre;
    private double costoBase;

    public SeguroSimple(String nombre, double costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    @Override
    public double calcularCosto() {
        return costoBase;
    }
}
