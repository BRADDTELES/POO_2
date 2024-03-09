package entities;

public class Advogado {

    private String nome;
    private int inscricaoOab;

    public Advogado(){  //CONSTRUTOR PADRÃO
        
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getInscricaoOab() {
        return inscricaoOab;
    }
    public void setInscricaoOab(int inscricao) {
        this.inscricaoOab = inscricao;
    }
    
    public String toString(){
        return "### Advogado ###"
                + "\nNome Completo: "
                + nome
                + "\nNº de Inscrição na OAB: "
                + inscricaoOab;
    }
}