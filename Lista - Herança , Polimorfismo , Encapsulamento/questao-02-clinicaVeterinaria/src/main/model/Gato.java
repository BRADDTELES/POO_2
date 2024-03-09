package main.model;

public class Gato extends Animal{

    private String cor;
    private Integer registroPedigree;

    public Gato() {
        
    }

    public Gato(String origem, String nome, Integer idade, Double peso, String cor) {
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
            + "\nRegistro de Pedigree: "
            + getRegistroPedigree();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getRegistroPedigree() {
        return registroPedigree;
    }

    public void setRegistroPedigree(Integer registroPedigree) {
        this.registroPedigree = registroPedigree;
    }
}
