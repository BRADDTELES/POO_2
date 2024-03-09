import java.util.Scanner;

public class AirFryer{
    Scanner digitar = new Scanner(System.in);
    
    public int modo;
    public int temperatura;

    int opcao;
    boolean modos;

    public void perguntarModos(){
        System.out.println("Escolha qual Modo:\n1 - Carnes e frutos do mar\n2 - Vegetais\n3 - Frituras\n4 - Massas\n0 - Sai");
        opcao = digitar.nextInt();
        modos = (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4);
        while (modos) {
            switch (opcao) {
                    case 1:
                        System.out.println("1 - Peito de frango\n2 - Salmão");
                        int opcao1 = digitar.nextInt();
                        if (opcao1 == 1) {
                            temperatura = 190;
                            System.out.println("Peito de frango selecionado, Temperatura: "+temperatura+"ºC Tempo: 22-23 minutos");
                        } else if (opcao1 == 2) {
                            temperatura = 200;
                            System.out.println("Salmão selecionado, Temperatura: "+temperatura+"ºC Tempo: 5-7 minutos");
                        }else{
                            System.out.println("Opção invalida");
                        }
                        break;
                    case 2:
                        System.out.println("1 - Batata Doce (em cubos)\n2 - Batata assada");
                        opcao1 = digitar.nextInt();
                        if (opcao1 == 1) {
                            temperatura = 190;
                            System.out.println("Batata doce selecionado, Temperatura: "+temperatura+"ºC Tempo: 15-20 minutos");
                        } else if (opcao1 == 2) {
                            temperatura = 200;
                            System.out.println("Batata assada selecionada, Temperatura: "+temperatura+"ºC Tempo: 35-45 minutos");
                        }else{
                            System.out.println("Opção invalida");
                        }
                        break;
                    case 3:
                        System.out.println("1 - Batata frita\n2 - Batata chips");
                        opcao1 = digitar.nextInt();
                        if (opcao1 == 1) {
                            temperatura = 200;
                            System.out.println("Batata frita selecionada, Temperatura: "+temperatura+"ºC Tempo: 10-20 minutos");
                        } else if (opcao1 == 2) {
                            temperatura = 180;
                            System.out.println("Batata chips selecionada, Temperatura: "+temperatura+"ºC Tempo: 15-17 minutos");
                        }else{
                            System.out.println("Opção invalida");
                        }
                        break;
                    case 4:
                        System.out.println("1 - Pão de Alho\n2 - Cupcakes");
                        opcao1 = digitar.nextInt();
                        if (opcao1 == 1) {
                            temperatura = 180;
                            System.out.println("Pão de alho selecionado, Temperatura: "+temperatura+"ºC Tempo: 2-3 minutos");
                        } else if (opcao1 == 2) {
                            temperatura = 160;
                            System.out.println("Cupcakes selecionado, Temperatura: "+temperatura+"ºC Tempo: 11-13 minutos");
                        }else{
                            System.out.println("Opção invalida");
                        }
                        break;
                    default:
                        break;
            }
            modos = false;
        }
        System.out.println("Saindo...");
    }       
    
}