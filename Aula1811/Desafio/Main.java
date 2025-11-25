package Aula1811.Desafio;


public class Main {
    public static void main(String[] args) {
        TipoFuncionario tipo = TipoFuncionario.GERENTE;
        Gerente ger = new Gerente(50000.5,5.5,5);
        switch (tipo) {
            case ESTAGIARIO:System.out.println(TipoFuncionario.ESTAGIARIO);
                break;
            case DESENVOLVEDOR:System.out.println("Desenvolvedor");
                break;
            case ANALISTA:System.out.println("Analista");
                break;
            case GERENTE:System.out.println(ger);
                break;
            default : System.out.println("Error");
                break;
        }
        System.out.println(tipo.getValor());
    }
}
