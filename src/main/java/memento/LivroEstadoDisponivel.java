package memento;

public class LivroEstadoDisponivel implements LivroEstado {

    private LivroEstadoDisponivel() {}
    private static LivroEstadoDisponivel instance = new LivroEstadoDisponivel();
    public static LivroEstadoDisponivel getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Disponível";
    }

}