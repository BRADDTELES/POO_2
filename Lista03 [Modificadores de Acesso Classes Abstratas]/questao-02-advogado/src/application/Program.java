package application;

import java.util.Scanner;

import entities.Advogado;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Advogado advogado = new Advogado();
        
        System.out.println("Informe o seu Nome Completo:");
        advogado.setNome(sc.nextLine());
        System.out.println("Informe o nº do seu Registro:");
        advogado.setInscricaoOab(sc.nextInt());        

        System.out.println(advogado);
        
        sc.close();
    }
}
