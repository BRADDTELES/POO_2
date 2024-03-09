package main.model;

public class Animal {
    
    private String origem;
    private String nome;
    private Integer idade;
    private Double peso;
    private String cor;

    public Animal() {
        
    }

    public Animal(String origem, String nome, Integer idade, Double peso) {
        this.origem = origem;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
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
            + getCor();
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    

}
