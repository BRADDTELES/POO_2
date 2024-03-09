public class Carro {

  public String modelo;
  public int ano;
  public String cor;
  public boolean ligado;
  public int velocidade = 10;

  public boolean getLigado() {
    ligado = true;
    return ligado;
  }

  String opcao;

  public void exibir() {
    System.out.print("Ligar o carro (sim ou não) ? ");
    opcao = new java.util.Scanner(System.in).next();
    if (opcao.equals("sim")) {
      System.out.print("Ligado: " + getLigado());
      System.out.println();
      System.out.print("Passar 1° marcha (sim) ? ");
      String opcao1 = new java.util.Scanner(System.in).next();
      if (opcao1.equals("sim")) {
        primeiraMarcha();
        System.out.println();
        System.out.print("Passar 2° marcha (sim) ? ");
        String opcao2 = new java.util.Scanner(System.in).next();
        if (opcao2.equals("sim")) {
          segundaMarcha();
          System.out.println();
          System.out.print("Passar 3° marcha (sim) ? ");
          String opcao3 = new java.util.Scanner(System.in).next();
          if (opcao3.equals("sim")) {
            terceiraMarcha();
            System.out.println();
            System.out.print("Passar 4° marcha (sim) ? ");
            String opcao4 = new java.util.Scanner(System.in).next();
            if (opcao4.equals("sim")) {
              quartaMarcha();
              System.out.println();
              System.out.print("Passar 5° marcha (sim) ? ");
              String opcao5 = new java.util.Scanner(System.in).next();
              if (opcao5.equals("sim")) {
                quintaMarcha();
              } else {
                System.out.print("4° marcha a " + velocidade + " Km/h");
              }
            } else {
              System.out.print("3° marcha a " + velocidade + " Km/h");
            }
          } else {
            System.out.print("2° marcha a " + velocidade + " Km/h");
          }
        } else {
          primeiraMarcha();
        }
      }
    } else {
      ligado = false;
      System.out.println("Ligado: " + ligado);
    }
  }

  public void primeiraMarcha() {
    System.out.print("1° marcha a " + velocidade + " Km/h");
  }

  public void segundaMarcha() {
    velocidade += 10;
    System.out.print("2° marcha a " + velocidade + " Km/h");
  }

  public void terceiraMarcha() {
    velocidade += 10;
    System.out.print("3° marcha a " + velocidade + " Km/h");
  }

  public void quartaMarcha() {
    velocidade += 10;
    System.out.print("4° marcha a " + velocidade + " Km/h");
  }

  public void quintaMarcha() {
    velocidade += 10;
    System.out.print("5° marcha a " + velocidade + " Km/h");
  }
}
