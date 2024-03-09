import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Carro modelo, ano, cor;
    modelo = new Carro();
    ano = new Carro();
    cor = new Carro();

    System.out.print("Modelo do carro: ");
    modelo.modelo = sc.next();
    System.out.print("Ano do carro: ");
    ano.ano = sc.nextInt();
    System.out.print("Cor do carro: ");
    cor.cor = sc.next();

    Carro escolha = new Carro();
    escolha.exibir();
  }
}
