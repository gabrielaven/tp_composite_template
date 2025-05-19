package tp_patrones_2_composite;

public class Spike implements ItemProyecto {
    private String descripcion;
    private int tiempoEstimado;

    public Spike(String descripcion, int tiempoEstimado) {
        this.descripcion = descripcion;
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public int getTiempo() {
        return tiempoEstimado;
    }
}