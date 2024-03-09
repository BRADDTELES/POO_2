import java.util.Scanner;
public class Geladeira {
    Scanner digitar = new Scanner(System.in);

    public int opcao;
    public int opcaoControle;
    public String tipo;
    public Double temperatura = 5.0;
    public boolean loop = true;

    public void exibir(){
        System.out.println("QUAL TIPO DE GELADEIRA:");
        System.out.println("1 - SIMPLES");
        System.out.println("2 - DUPLEX");
        System.out.println("3 - FROST FREE");
        
        opcao = digitar.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Economia e Praticidade, para poucos espaços.");
                tipo = "GELADEIRA SIMPLES";
                break;
            case 2:
                System.out.println("Modo de descongelamento, permite o degelo automático e não necessita de serviço manual.");
                tipo = "GELADEIRA DUPLEX";
                break;
            case 3:
                System.out.println("Tecnologia AutoSense para controle de temperatura automático.");
                tipo = "GELADEIRA FROST FREE";
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
        }
    }

    public String getTipo(){
        return tipo;
    }

    public void regularTemperatura(){
        while (loop) {
        System.out.println("Digite as opções de Controle: ");
        System.out.println("0 - Sair");
        System.out.println("1 - Automático");
        System.out.println("2 - Manual");
        opcaoControle = digitar.nextInt();
            if (opcaoControle == 0) {
                loop = false;
            } else if (opcaoControle == 1) {
                System.out.println("Temperatura ideal recomendada é entre 2ºC a 4ºC");
                System.out.println("Temperatura Atual: "+temperatura);
            } else if(opcaoControle == 2){
                System.out.println("Regular a temperatura para: ");
                temperatura = digitar.nextDouble();
            } else {
                System.out.println("OPÇÃO INVÁLIDA");
            }
        }
    }

    public String toString(){
        return "Escolhido: "
                +tipo
                +"\nTemperatura Atual: "
                +temperatura
                +"ºC";
    }
}
