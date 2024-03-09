package entities;

public class Professor {

    private String nome;
    private int idade;
    private String disciplina;
    private String turma;
    
    public Professor(String nome, int idade, String disciplina, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
        this.turma = turma;
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
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Professor [nome: " 
                + nome 
                + ", idade: " 
                + idade 
                + ", disciplina: " 
                + disciplina 
                + ", turma: " 
                + turma
                + "]";
    }
    
}
