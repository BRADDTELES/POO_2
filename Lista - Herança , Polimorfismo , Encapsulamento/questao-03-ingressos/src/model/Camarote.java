package model;

public class Camarote {
    
    private Double valor = 200.00;
    private String destino;
    private String localDeAcesso = "Área Reservada, com visão panorâmica";

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
