package main;

import constantes.TIPO_CAFE;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String tipoCafe;
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha um tipo de cafe");
        System.out.println("" + TIPO_CAFE.CAFE_PEQUENO.tipoCafe);
        System.out.println("" + TIPO_CAFE.CAFE_MEDIO.tipoCafe);
        System.out.println("" + TIPO_CAFE.CAFE_GRANDE.tipoCafe);
        tipoCafe = in.nextLine();
        if (tipoCafe.equalsIgnoreCase(TIPO_CAFE.CAFE_PEQUENO.tipoCafe)) {
            System.out.println("Usuario escolheu o " + TIPO_CAFE.CAFE_PEQUENO.tipoCafe);
        } else {
            if (tipoCafe.equalsIgnoreCase(TIPO_CAFE.CAFE_MEDIO.tipoCafe)) {
                System.out.println("Usuario escolheu o " + TIPO_CAFE.CAFE_MEDIO.tipoCafe);
            } else {
                if (tipoCafe.equalsIgnoreCase(TIPO_CAFE.CAFE_GRANDE.tipoCafe)) {
                    System.out.println("Usuario escolheu o " + TIPO_CAFE.CAFE_GRANDE.tipoCafe);
                } else {
                    System.out.println("Opcao inexistente!");
                }
            }
        }
    }

}
