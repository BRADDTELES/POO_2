package application;

import entities.Tv;
import java.util.Scanner;

public class Program {
					
					
					/** 
					 * @param args
					 */
					public static void main(String[] args) {
										Scanner sc = new Scanner(System.in);
										
										Tv tv = new Tv();
										System.out.println("---Verificar estado da Tv---");
										tv.desligar();
										System.out.println(tv);
										System.out.println("Deseja Ligar ? <s/n>");
										String opcao = sc.next();
										if (opcao.equals("s")){
															tv.ligar();
															System.out.println(tv);
										}else{
															System.out.println(tv);
										}
										sc.close();
					}
					
}