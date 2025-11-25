package Aula1811.Desafio;

public enum TipoFuncionario {
    ESTAGIARIO(1),
    DESENVOLVEDOR(2),
    ANALISTA(3),
    GERENTE(4);

    private final int valor;

    TipoFuncionario(int valorFuncionario) {
        valor = valorFuncionario;
    }

    public int getValor(){
        return valor;
    }
}
