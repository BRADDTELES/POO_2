package main;

import java.text.ParseException;
import java.util.Scanner;

import entities.Hospital;

public class Principal {

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    int opcao;

    Hospital hospital = new Hospital();

    System.out.println("---Atendimentos---");
    while (flag) {
      System.out.println("1 - Pronto Socorro\n2 - Clínico");
      opcao = sc.nextInt();
      switch (opcao) {
        case 1:
          hospital.atender();
          hospital.fazerTriagem();
          flag = false; //<---CASO QUEIRA PARAR O LOOP
          break;
        case 2:
          hospital.agendarConsulta();
          flag = false;
          break;
        default:
          System.out.println("Opção Inválida");
          break;
      }

    }
    sc.close();
  }
}
