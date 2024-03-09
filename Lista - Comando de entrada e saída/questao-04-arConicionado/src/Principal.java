
public class Principal {

  public static void main(String[] args) {
    ArCondicionado ar = new ArCondicionado();

    System.out.println("\n---Controle de Ar---");
    System.out.println("Temperatura atual: " + ar.temperaturaArCond + "°C");
    System.out.println("Modo atual: " + ar.modoArCond);
    System.out.println("Ventilação atual: " + ar.ventilacaoArCond);

    ArCondicionado escolha = new ArCondicionado();
    escolha.exibir();
  }
}
