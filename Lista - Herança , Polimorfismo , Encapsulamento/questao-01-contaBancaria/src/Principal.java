//package main;

import java.util.Scanner;
//import model.ContaCorrente;
//import model.ContaPoupanca;
//import model.ContaEspecial;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaEspecial contaEspecial = new ContaEspecial();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        Scanner in = new Scanner(System.in);

        int opcaoMenu = 0;
        int subOpcaoMenu = 0;
        do{
            System.out.println("Escolha um tipo de Conta");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Cinta Poupanca");
            System.out.println("3 - Conta Especial");
            System.out.println("0 - Sair");
            opcaoMenu = in.nextInt();
            switch (opcaoMenu) {
                case 1:
                    // Conta Corrente
                    System.out.println("Escolha a sub-opcao:\n1 - Sacar \n2 - Depositar:");
                    subOpcaoMenu = in.nextInt();
                    if(subOpcaoMenu == 1){
                        System.out.println("Informe o valor do saque:");
                        valorOperacao = in.nextDouble();
                        boolean resultadoOperacao = contaCorrente.sacar(valorOperacao);
                        System.out.println("Resultado operacao: " + resultadoOperacao);
                    }else{
                        if(subOpcaoMenu == 2){
                            System.out.println("Informe o valor do deposito:");
                            valorOperacao = in.nextDouble();
                            contaCorrente.depositar(valorOperacao);
                        }else{
                            System.out.println("Opcao invalida!");
                        }
                    }
                    System.out.println("Novo saldo: R$ " + contaCorrente.saldo);
                    break;
                case 2:
                    // Cinta Poupanca
                    break;
                case 3:
                    // Conta Especial
                    break;
                case 0:
                    //Sair
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcaoMenu != 0);
            
    }
}
