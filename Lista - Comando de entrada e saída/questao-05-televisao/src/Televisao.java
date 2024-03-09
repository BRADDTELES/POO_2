import java.util.Scanner;

public class Televisao {
    public String marca;
    public String nomeCanal = "1 - Globo";

    Scanner digitar = new Scanner(System.in);
    int opcao;
    boolean ligado;

    public void peguntar() {
        System.out.print("Qual é a marca da televisão: ");
        marca = digitar.next();
        System.out.println("Deseja ligar a televisão ?\nSim (1)\nNão (0)");
        opcao = digitar.nextInt();
        ligado = (opcao == 1);
    }

    public void passarCanal() {

        while (ligado) {
            System.out.println("Canal Atual: " + nomeCanal);
            System.out.println("Mudar de Canal:\n4 - Record\n9 - SBT\n11 - Serra Dourada\n13 - Band\n24 - RedeTV");
            opcao = digitar.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Canal: Globo");
                    break;
                case 4:
                    System.out.println("Canal: Record");
                    break;
                case 9:
                    System.out.println("Canal: SBT");
                    break;
                case 11:
                    System.out.println("Canal: Serra Dourada");
                    break;
                case 13:
                    System.out.println("Canal: Band");
                    break;
                case 24:
                    System.out.println("Canal: RedeTV");
                    break;
                default:
                    break;
            }
            System.out.println("Deseja desligar ?\n(sim) ou (não)");
            String flag = digitar.next();
            if (flag.equals("sim")) {
                System.out.println("TV Desligada");
            } else {
                System.out.println("Opção Invalida");
            }
            ligado = false;
        }

    }

    public String toString() {
        return "A marca da TV é " + marca;
    }
}
