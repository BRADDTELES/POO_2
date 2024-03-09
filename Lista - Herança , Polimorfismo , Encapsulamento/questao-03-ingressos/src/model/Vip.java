package model;

public class Vip {
    
    private Double valor = 50.00;
    private String destino;
    private String localDeAcesso = "Área do Stage, em torno do palco";

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getLocalDeAcesso() {
        return localDeAcesso;
    }
    public void setLocalDeAcesso(String localDeAcesso) {
        this.localDeAcesso = localDeAcesso;
    }

    public String toString(){
        return "Local do Evento: " + getDestino();
    }
}
