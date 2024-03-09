import java.util.Scanner;

public class Radio {
    Scanner digitar = new Scanner(System.in);

    public Double frequencia = 102.9;
    public String nomeRadio = "89 FM a Rádio Rock";

    int opcao;
    boolean ligado;

    public void ligar(){
        System.out.println("Ligar o Rádio ?\n1 - sim\n2 - não");
        opcao = digitar.nextInt();
        ligado = (opcao == 1);
    }

    public void escolher(){
        while (ligado) {
            System.out.println(toString());
            System.out.println("Escolher outra Frequência ?\nOpção Atual (1)\nOpção (2)\nOpção (3)\nOpção (4)\nOpção (5)\nOpção (6)\nOpção Desligar (0)");
            opcao = digitar.nextInt();
            switch (opcao) {
                case 1:
                    frequencia = 102.9;
                    nomeRadio = "89 FM A Rádio Rock";
                    break;
                case 2:
                    frequencia = 94.9;
                    nomeRadio = "Interativa FM";
                    break;
                case 3:
                    frequencia = 99.1;
                    nomeRadio = "Positiva FM";
                    break;
                case 4:
                    frequencia = 101.1;
                    nomeRadio = "Gospel";
                    break;
                case 5:
                    frequencia = 104.3;
                    nomeRadio = "Terra FM";
                    break;
                case 6:
                    frequencia = 106.7;
                    nomeRadio = "Jovem Pan FM";
                    break;
                default:
                    System.out.println("Rádio Desligado");
                    break;
            }
            ligado = false;
        }
        System.out.println(toString());
    }
    
    public String toString(){
        return "Frequência Atual: "
                + String.format("%.1f", frequencia)
                +" Nome da Rádio: "
                + nomeRadio;
    }
}
