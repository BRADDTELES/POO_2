package main;

import java.util.Scanner;

import entities.Colaborador;
import entities.Faxineiro;
import entities.Gerente;
import entities.Vendedor;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Colaborador colaborador = new Colaborador();
        Vendedor vendedor = new Vendedor();
        Faxineiro faxineiro = new Faxineiro();
        Gerente gerente = new Gerente();

        System.out.println("Informe o seu nome: ");
        colaborador.setNome(sc.nextLine());
        System.out.println("Informe o seu CPF: ");
        colaborador.setCpf(sc.nextLine());
        System.out.println("Informe o cargo:\n1 - Vendedor\n2 - Faxineiro\n3 - Gerente");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                vendedor.setCargo(1);
                System.out.println("Informe o Valor das Vendas: ");
                vendedor.setVenda(sc.nextDouble());
                System.out.println(colaborador);
                System.out.println(vendedor);
                break;
            case 2:
                faxineiro.setCargo(2);
                System.out.println(colaborador);
                System.out.println(faxineiro);
                break;
            case 3:
                gerente.setCargo(3);
                System.out.println("Informe quantas Horas Extras trabalhadas: ");
                gerente.setHorasExtras(sc.nextDouble());
                System.out.println(colaborador);
                System.out.println(gerente);
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
        sc.close();
    }
}
