
public class ArCondicionado {

  public int temperaturaArCond = 24;
  public String modoArCond = "Resfriamento";
  public String ventilacaoArCond = "Auto";

  public void exibir() {
    do {
      System.out.println("\nOpções:");
      System.out.println("1. Alterar temperatura");
      System.out.println("2. Alterar modo (Refriamento/- Aquecimento");
      System.out.println("3. Alterar ventilação (Auto/- Manual");
      System.out.println("4. Sair");
      System.out.println("Escolha uma opção:");
      int opcao = new java.util.Scanner(System.in).nextInt();
      switch (opcao) {
        case 1:
          System.out.println("Mude a temperatura (abaixo de 30°C):");
          int temperaturaArCond = new java.util.Scanner(System.in).nextInt();
          System.out.println(
            "Temperatura para " + temperaturaArCond + "°C alterada"
          );
          break;
        case 2:
          System.out.println("Mude o modo:");
          modoArCond = new java.util.Scanner(System.in).next();
          System.out.println("Modo para " + modoArCond + " alterado");
          break;
        case 3:
          System.out.println("Mude a ventilação:");
          ventilacaoArCond = new java.util.Scanner(System.in).next();
          System.out.println(
            "Ventilação para " + ventilacaoArCond + " alterado"
          );
        default:
          System.out.println("Saindo...");
          continue;
      }
    } while (false);
  }
}
