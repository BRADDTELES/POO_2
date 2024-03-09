package main.model;

public class Cao extends Animal{
    
    private String cor;
    private Double valor;

    public Cao() {
        
    }

    public Cao(String origem, String nome, Integer idade, Double peso, String cor) {
        super(origem, nome, idade, peso);
        this.cor = cor;
    }

    public String toString() {
        return "Origem: " 
            + getOrigem() 
            + "\nNome: " 
            + getNome() 
            + "\nIdade: " 
            + getIdade() 
            + "\nPeso: " 
            + getPeso() 
            + "\nCor: " 
            + getCor()
            + "\nValor: "
            + getValor();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
