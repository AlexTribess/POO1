package Aula1811.Interfaces;

public class TV extends EquipamentoEletronico implements IControle{

    private String marca;
    private String modelo;
    private boolean estado;
    private int volume;
    private int canal;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean ligaDesliga() {
        if(estado){
            return false;
        }
        return estado;
    }

    @Override
    public int alterarCanal(int canal) {
        return 0;
    }

    @Override
    public int canalMais() {
            canal += 1;
        return canalMais();
    }

    @Override
    public int canalMenos() {
            canal -= 1;
        return canalMenos();
    }

    @Override
    public int volumeMais() {
        if(volume < 100 && volume > 0){
            volume += 1;
        }
        return volume;
    }

    @Override
    public int volumeMenos() {
        if(volume < 100 && volume > 0){
            volume -= 1;
        }
        return volume;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TV{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", volume=").append(volume);
        sb.append(", canal=").append(canal);
        sb.append('}');
        return sb.toString();
    }
}
