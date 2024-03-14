package application;

import entities.Cao;
import java.util.Scanner;

public class Program {
					
					public static void main(String[] args) {
										Scanner sc = new Scanner(System.in);
										Cao cao = new Cao();
										System.out.println("Deseja fazer o Cão latir ? <S/n>");
										String opcao = sc.next();
										if (opcao.equals("S")){
															cao.latir();
										}else {
															System.out.println("Até logo!");
										}
										
					}
					
}