package memento;

public class LivroEstadoReservado implements LivroEstado {

    private LivroEstadoReservado() {}
    private static LivroEstadoReservado instance = new LivroEstadoReservado();
    public static LivroEstadoReservado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Reservado";
    }

}