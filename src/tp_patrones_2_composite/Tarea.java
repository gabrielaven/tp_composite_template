package tp_patrones_2_composite;

public class Tarea implements ItemProyecto {
    private String nombre;
    private int duracion; 

    public Tarea(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public int getTiempo() {
        return duracion;
    }
}
