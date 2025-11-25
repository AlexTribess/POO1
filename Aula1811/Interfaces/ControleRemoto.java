package Aula1811.Interfaces;

public class ControleRemoto extends EquipamentoEletronico implements IControle{

    private int cargaPilha;

    public int getCargaPilha() {
        return cargaPilha;
    }

    public void setCargaPilha(int cargaPilha) {
        this.cargaPilha = cargaPilha;
    }

    @Override
    public boolean ligaDesliga() {
        return true;
    }

    @Override
    public int alterarCanal(int canal) {
        return 0;
    }

    @Override
    public int canalMais() {
        return 0;
    }

    @Override
    public int canalMenos() {
        return 0;
    }

    @Override
    public int volumeMais() {
        return 0;
    }

    @Override
    public int volumeMenos() {
        return 0;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ControleRemoto{");
        sb.append("cargaPilha=").append(cargaPilha);
        sb.append('}');
        return sb.toString();
    }
}
