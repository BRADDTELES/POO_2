package entities;

public class Aluno {
    
    private String nome;
    private int idade;
    private String curso;
    private Double valor;

    public Aluno(String nome, int idade, String curso, Double valor){  //PROPOSTA DE MELHORIA: Obrigando o programador a informar o nome, idade, curso e valor
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Aluno: " 
            + nome 
            + "\nIdade: " 
            + idade 
            + "\nCurso: " 
            + curso 
            + "\nValor: " 
            + String.format("%.2f", valor);
    }


}
