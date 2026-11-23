package memento;

public class LivroEstadoDescartado implements LivroEstado {

    private LivroEstadoDescartado() {}
    private static LivroEstadoDescartado instance = new LivroEstadoDescartado();
    public static LivroEstadoDescartado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Descartado";
    }

}