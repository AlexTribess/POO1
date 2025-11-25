package Aula1811.Desafio;

public class Funcionario {
    public double salarioBruto;
    public double descontos;
    public double salLiquido;
    public double salRed;
    public double salFinal;

    public Funcionario(double salLiquido, double salarioBruto, double descontos) {
    }

    public double getSalFinal() {
        return salFinal;
    }

    public void setSalFinal(double salFinal) {
        this.salFinal = salFinal;
    }

    public double getSalRed() {
        return salRed;
    }

    public void setSalRed(double salRed) {
        this.salRed = salRed;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public double getSalLiquido() {
        return salLiquido;
    }

    public void setSalLiquido(double salLiquido) {
        this.salLiquido = salLiquido;
    }
}
