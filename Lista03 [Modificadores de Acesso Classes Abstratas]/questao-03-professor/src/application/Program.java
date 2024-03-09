package application;

import java.util.Scanner;

import entities.Professor;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String name = sc.nextLine();
        System.out.println("Informe a sua idade:");
        int idade = sc.nextInt();
        System.out.println("Informe a sua Disciplina:");
        sc.nextLine();
        String disciplina = sc.nextLine();
        System.out.println("Informe a sua Turma:");
        String turma = sc.nextLine();
        
        Professor professor = new Professor(name, idade, disciplina, turma);

        System.out.println(professor);

        sc.close();
    }
}
