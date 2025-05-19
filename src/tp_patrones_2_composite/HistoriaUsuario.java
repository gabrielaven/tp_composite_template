package tp_patrones_2_composite;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements ItemProyecto {
    private String nombre;
    private List<ItemProyecto> items = new ArrayList<>();

    public HistoriaUsuario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarItem(ItemProyecto item) {
        items.add(item);
    }

    @Override
    public int getTiempo() {
        int total = 0;
        for (ItemProyecto item : items) {
            total += item.getTiempo();
        }
        return total;
    }
}
