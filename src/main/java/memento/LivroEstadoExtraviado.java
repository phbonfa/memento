package memento;

public class LivroEstadoExtraviado implements LivroEstado {

    private LivroEstadoExtraviado() {}
    private static LivroEstadoExtraviado instance = new LivroEstadoExtraviado();
    public static LivroEstadoExtraviado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Extraviado";
    }

}