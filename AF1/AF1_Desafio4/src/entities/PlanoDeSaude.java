package entities;

import interfaces.Pessoa;

public class PlanoDeSaude implements Pessoa {
    
    private int idade;

    /*
     * Construtor da Classe Plano de Saúde
     */
    public PlanoDeSaude(int idade) {
        this.idade = idade;
    }

    /**
     * Define a quantia a ser Paga, de acordo com a Idade definida pelo o usuário
     */
    public void mostrar(){
        if (getIdade() > 0 && getIdade() <= 10) {
            System.out.println("Pagar R$30,00");
        }else if (getIdade() > 10 && getIdade() <= 29){
            System.out.println("Pagar R$60,00");
        }else if (getIdade() > 29 && getIdade() <= 45){
            System.out.println("Pagar R$120,00");
        }else if (getIdade() > 45 && getIdade() <= 59){
            System.out.println("Pagar R$150,00");
        }else if (getIdade() > 59 && getIdade() <= 65){
            System.out.println("Pagar R$250,00");
        }else if (getIdade() > 65){
            System.out.println("Pagar R$400,00");
        }else{
            System.out.println("Opção Inválida");
        }
    }

    /**
     * 
     * @return Retorna a idade <- Mostra a Idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * 
     * @param idade Seta a idade <- Insere a Idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
