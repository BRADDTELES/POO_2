package main;

import java.util.Scanner;
import model.ContaCorrente;
import model.ContaEspecial;
import model.ContaPoupanca;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaEspecial contaEspecial = new ContaEspecial();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        Scanner in = new Scanner(System.in);
        int opcaoMenu = 0;
        int subOpcaoMenu = 0;
        Double valorOperacao = 0.0;
        do {
            System.out.println("Escolha o tipo de conta:");
            System.out.println("1 - Corrente\n2 - Poupanca\n3 - Especial");
            System.out.println("0 - Sair:");
            opcaoMenu = in.nextInt();
            switch (opcaoMenu) {
                case 1:
                    // Conta corrente
                    System.out.println("Escolha a sub-opcao:\n1 - Sacar \n2 - Depositar:");
                    subOpcaoMenu = in.nextInt();
                    if (subOpcaoMenu == 1) {
                        System.out.println("Informe o valor do saque:");
                        valorOperacao = in.nextDouble();
                        boolean resultadoOperacao = contaCorrente.sacar(valorOperacao);
                        System.out.println("Resultado operacao: " + resultadoOperacao);
                    } else {
                        if (subOpcaoMenu == 2) {
                            System.out.println("Informe o valor do deposito:");
                            valorOperacao = in.nextDouble();
                            contaCorrente.depositar(valorOperacao);
                        } else {
                            System.out.println("Opcao invalida!");
                        }
                    }
                    System.out.println("Novo saldo: R$ " + contaCorrente.getSaldo());
                    break;
                case 2:
                    // Conta poupança
                    System.out.println("Escolha a sub-opcao:\n1 - Sacar \n2 - Depositar \n3 - Calcular rendimento:");
                    subOpcaoMenu = in.nextInt();
                    if (subOpcaoMenu == 1) {
                        System.out.println("Informe o valor do saque:");
                        valorOperacao = in.nextDouble();
                        boolean resultadoOperacao = contaPoupanca.sacar(valorOperacao);
                        System.out.println("Resultado operacao: " + resultadoOperacao);
                    } else {
                        if (subOpcaoMenu == 2) {
                            System.out.println("Informe o valor do deposito:");
                            valorOperacao = in.nextDouble();
                            contaPoupanca.depositar(valorOperacao);
                        } else {
                            if (subOpcaoMenu == 3) {
                                contaPoupanca.calcularRendimento();
                            } else {
                                System.out.println("Opcao invalida!");
                            }
                        }
                    }
                    System.out.println("Novo saldo: R$ " + contaPoupanca.getSaldo());
                    break;
                case 3:
                    // Conta especial
                    System.out.println("Escolha a sub-opcao:\n1 - Sacar \n2 - Depositar:");
                    subOpcaoMenu = in.nextInt();
                    if (subOpcaoMenu == 1) {
                        System.out.println("Informe o valor do saque:");
                        valorOperacao = in.nextDouble();
                        boolean resultadoOperacao = contaEspecial.sacar(valorOperacao);
                        System.out.println("Resultado operacao: " + resultadoOperacao);
                    } else {
                        if (subOpcaoMenu == 2) {
                            System.out.println("Informe o valor do deposito:");
                            valorOperacao = in.nextDouble();
                            contaEspecial.depositar(valorOperacao);
                        } else {
                            System.out.println("Opcao invalida!");
                        }
                    }
                    System.out.println("Novo saldo: R$ " + contaEspecial.getSaldo());
                    break;
                case 0:
                    // Sair
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        } while (opcaoMenu != 0);
    }
}
