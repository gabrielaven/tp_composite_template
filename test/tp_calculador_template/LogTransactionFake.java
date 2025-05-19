package tp_calculador_template;

public class LogTransactionFake implements LogTransaction {
    public String ultimaClaseLogueada;

    @Override
    public void log(String nombreClase) {
        ultimaClaseLogueada = nombreClase;
    }
}
