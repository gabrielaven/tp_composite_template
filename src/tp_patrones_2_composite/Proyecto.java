package tp_patrones_2_composite;
import java.util.ArrayList;
import java.util.List;

public class Proyecto implements ItemProyecto {
    private List<ItemProyecto> items = new ArrayList<>();

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