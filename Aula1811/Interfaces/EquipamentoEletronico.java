package Aula1811.Interfaces;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;
    public boolean estado;

    public float getTensao() {
        return consumo;
    }
    public void setTensao(float tensao) {
        if(tensao>0) {
            this.tensao = tensao;
        }
    }
    public float getConsumo() {
        return consumo;
    }
    public void setConsumo(float consumo) {
        if(consumo>0) {
            this.consumo = consumo;
        }
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EquipamentoEletronico{");
        sb.append("tensao=").append(tensao);
        sb.append(", consumo=").append(consumo);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
