package Aula1811.Desafio;

public class Analista extends Funcionario implements IPagamento {

    TipoFuncionario tipo = TipoFuncionario.GERENTE;

    public Analista(double salLiquido, double salarioBruto, double descontos) {
        super(salLiquido, salarioBruto, descontos);
    }


    @Override
    public double calculaSalarioLiquido() {
        salLiquido = salarioBruto - descontos;
        salRed = salLiquido * 0.05;
        salFinal = salLiquido - salRed;
        return salFinal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Analista{");
        sb.append("tipo=").append(tipo);
        sb.append(", salarioBruto=").append(salarioBruto);
        sb.append(", descontos=").append(descontos);
        sb.append(", salLiquido=").append(salLiquido);
        sb.append(", salRed=").append(salRed);
        sb.append(", salFinal=").append(salFinal);
        sb.append('}');
        return sb.toString();
    }
}
