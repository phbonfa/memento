package memento;

public class LivroEstadoEmprestado implements LivroEstado {

    private LivroEstadoEmprestado() {}
    private static LivroEstadoEmprestado instance = new LivroEstadoEmprestado();
    public static LivroEstadoEmprestado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Emprestado";
    }

}