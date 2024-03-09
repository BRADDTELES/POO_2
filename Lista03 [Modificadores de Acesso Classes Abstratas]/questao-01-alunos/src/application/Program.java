package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        System.out.println("Digite o curso do aluno: ");
        sc.nextLine();
        String curso = sc.nextLine();
        System.out.println("Digite o valor do aluno: ");
        Double valor = sc.nextDouble();

        Aluno aluno = new Aluno(nome, idade, curso, valor);

        System.out.println(aluno);

        sc.close();
    }
}