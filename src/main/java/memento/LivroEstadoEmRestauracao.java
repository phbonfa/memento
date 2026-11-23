package memento;

public class LivroEstadoEmRestauracao implements LivroEstado {

    private LivroEstadoEmRestauracao() {}
    private static LivroEstadoEmRestauracao instance = new LivroEstadoEmRestauracao();
    public static LivroEstadoEmRestauracao getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em Restauração";
    }

}