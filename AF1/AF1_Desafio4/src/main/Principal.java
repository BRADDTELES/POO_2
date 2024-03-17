/***
 * Copyright 2024
 * @author Danillo Teles Carneiro
 * @version 1.0
 */
package main;

import java.util.Scanner;

import entities.PlanoDeSaude;

public class Principal{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe a sua idade: ");
            int idade = sc.nextInt();
            PlanoDeSaude plano = new PlanoDeSaude(idade);
            plano.setIdade(idade);
            plano.mostrar();
            sc.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
    }
}