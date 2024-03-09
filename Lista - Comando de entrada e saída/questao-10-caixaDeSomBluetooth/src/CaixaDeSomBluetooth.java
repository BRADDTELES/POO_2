import java.util.Scanner;
public class CaixaDeSomBluetooth{
    Scanner digitar = new Scanner(System.in);

    public boolean ligado;
    public int opcao;

    public void ligar(){
        System.out.println("Ligar Caixa de Som:\n1 - Sim\n2 - Não");
        opcao = digitar.nextInt();
        if(opcao == 1){
            ligado = true;
        } else if (opcao == 2) {
            ligado = false;
        } else {
            System.out.println("Opção invalida");
        }
    }

    public boolean getLigado(){
        return ligado;
    }

    public void parearBluetooth(){
        System.out.println("\nParear Caixa de Som");
        System.out.println();
        while (ligado) {
            System.out.println("Aguardando pareamento...");
            try {
                Thread.sleep(4000);
                System.out.println("Aguardando pareamento...");
                Thread.sleep(4000);
                System.out.println("Aguardando pareamento...");
                Thread.sleep(4000);
                System.out.println("Aguardando pareamento...");
                Thread.sleep(4000);
                System.out.println("Aguardando pareamento...");
                Thread.sleep(5000);
                System.out.println("Pareamento Não Encontrado!");
                Thread.sleep(3000);
                System.out.println("Bluetooth Parado!");
                ligado = false;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}