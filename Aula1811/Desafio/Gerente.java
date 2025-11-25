package Aula1811.Desafio;

public class Gerente extends Funcionario implements IPagamento {

    TipoFuncionario tipo = TipoFuncionario.GERENTE;

    public Gerente(double salLiquido, double salarioBruto, double descontos) {
        super(salLiquido, salarioBruto, descontos);
    }


    @Override
    public double calculaSalarioLiquido() {
        salLiquido = salarioBruto - descontos;
        salRed = salLiquido * 0.01;
        salFinal = salLiquido - salRed;
        return salFinal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Gerente{");
        sb.append("tipo=").append(tipo);
        sb.append(", salarioBruto=").append(super.salarioBruto);
        sb.append(", descontos=").append(super.descontos);
        sb.append(", salLiquido=").append(super.salLiquido);
        sb.append(", salRed=").append(super.salRed);
        sb.append(", salFinal=").append(salFinal);
        sb.append('}');
        return sb.toString();
    }
}
