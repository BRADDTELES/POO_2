package main;

import java.util.Scanner;
import main.model.Animal;
import main.model.Cao;
import main.model.Gato;

public class App {

  public static void main(String[] args) throws Exception {
    try {
      Scanner sc = new Scanner(System.in);

      Animal animal = new Animal();
      Cao cao = new Cao();
      Gato gato = new Gato();

      boolean loop = true;
      while (loop) {
        System.out.println("\nOpcão:\n1 - Cães\n2 - Gatos\n3 - Fechar");
        int opcaoMenu = sc.nextInt();
        switch (opcaoMenu) {
          case 1:
            animal = cao;
            System.out.println(
              "Informe a Origem do Animal:\n1 - Sem Raça Definida (SRD)\n2 - Raça Pura"
            );
            int origemAnimal = sc.nextInt();
            switch (origemAnimal) {
              case 1:
                animal.setOrigem("Sem Raça Definida (SRD)");
                System.out.println("Informe o Nome:");
                animal.setNome(sc.next());
                System.out.println("Informe a Idade:");
                animal.setIdade(sc.nextInt());
                System.out.println("Informe o Peso:");
                animal.setPeso(sc.nextDouble());
                System.out.println("Informe a Cor:");
                animal.setCor(sc.next());
                System.out.println(animal);
                break;
              case 2:
                animal.setOrigem("Raça Pura");
                System.out.println("Informe o Nome:");
                cao.setNome(sc.next());
                System.out.println("Informe a Idade:");
                cao.setIdade(sc.nextInt());
                System.out.println("Informe o Peso:");
                cao.setPeso(sc.nextDouble());
                System.out.println("Informe a Cor:");
                cao.setCor(sc.next());
                System.out.println("Informe o Valor da Raça Pura:");
                cao.setValor(sc.nextDouble());
                System.out.println(cao);
                break;
              default:
                System.out.println("Opção inválida!");
                break;
            }
            break;
          case 2:
            animal = gato;
            System.out.println(
              "Informe a Origem do Animal:\n1 - Sem Raça Definida (SRD)\n2 - Raça Pura"
            );
            origemAnimal = sc.nextInt();
            switch (origemAnimal) {
              case 1:
                animal.setOrigem("Sem Raça Definida (SRD)");
                System.out.println("Informe o Nome:");
                animal.setNome(sc.next());
                System.out.println("Informe a Idade:");
                animal.setIdade(sc.nextInt());
                System.out.println("Informe o Peso:");
                animal.setPeso(sc.nextDouble());
                System.out.println("Informe a Cor:");
                animal.setCor(sc.next());
                System.out.println(animal);
                break;
              case 2:
                animal.setOrigem("Raça Pura");
                System.out.println("Informe o Nome:");
                gato.setNome(sc.next());
                System.out.println("Informe a Idade:");
                gato.setIdade(sc.nextInt());
                System.out.println("Informe o Peso:");
                gato.setPeso(sc.nextDouble());
                System.out.println("Informe a Cor:");
                gato.setCor(sc.next());
                System.out.println("Informe o Registro de Pedigree");
                gato.setRegistroPedigree(sc.nextInt());
                System.out.println(gato);
                break;
              default:
                System.out.println("Opção inválida!");
                break;
            }
            break;
          case 3:
            System.out.println("Fechando.");
            loop = false;
            break;
          default:
            System.out.println("Opção inválida!");
            break;
        }
      }
      sc.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
