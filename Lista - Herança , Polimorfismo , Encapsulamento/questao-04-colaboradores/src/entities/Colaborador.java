package entities;

public class Colaborador {
    
    private String nome;
    private String cpf;
    private int cargo;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCargo() {
        return cargo;
    }
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String toString(){
        return "Nome: " 
                + getNome() 
                + "\nCPF: " 
                + getCpf();
    }

}
