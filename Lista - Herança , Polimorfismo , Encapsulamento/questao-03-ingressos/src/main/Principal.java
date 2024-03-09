package main;

import java.util.Scanner;

import model.Camarote;
import model.ExtraVip;
import model.Vip;

public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Vip vip = new Vip();
    ExtraVip extraVip = new ExtraVip();
    Camarote camarote = new Camarote();

    System.out.println("Informe o Ingresso a ser adquirido:\n1 - VIP\n2 - EXTRA-VIP\n3 - Camarote");
    int opcao = sc.nextInt();
    switch (opcao) {
        case 1:
            System.out.printf("Ingresso VIP no valor: R$ %.2f", vip.getValor());
            System.out.println();
            System.out.println("Acesso: "+vip.getLocalDeAcesso());
            System.out.println();
            System.out.println("Informe o Destino do Evento: ");
            sc.nextLine();
            vip.setDestino(sc.nextLine());
            System.out.println();
            System.out.println(vip);
            break;
        case 2:
            System.out.printf("Ingresso EXTRA-VIP no valor: R$ %.2f", extraVip.getValor());
            System.out.println();
            System.out.println("Acesso: "+extraVip.getLocalDeAcesso());
            System.out.println();
            System.out.println("Informe o Destino do Evento: ");
            sc.nextLine();
            extraVip.setDestino(sc.nextLine());
            System.out.println();
            System.out.println(extraVip);
            break;
        case 3:
            System.out.printf("Ingresso Camarote no valor: R$ %.2f", camarote.getValor());
            System.out.println();
            System.out.println("Acesso: "+camarote.getLocalDeAcesso());
            System.out.println();
            System.out.println("Informe o Destino do Evento: ");
            sc.nextLine();
            camarote.setDestino(sc.nextLine());
            System.out.println();
            System.out.println(camarote);
            break;
        default:
            System.out.println("Opcao invalida!");
            break;
    }    
    sc.close();
  }
}
