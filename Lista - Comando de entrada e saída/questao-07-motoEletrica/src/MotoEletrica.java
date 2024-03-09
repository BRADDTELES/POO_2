import java.util.Scanner;

public class MotoEletrica{
    Scanner digitar = new Scanner(System.in);

    public boolean ligado;
    public double distanciaPercorrida = 0;
    public double cargaBateria = 1000;

    int opcao;
    boolean loop = true;

    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void exibir(){
        while (loop) {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Ligar/Retornar");
            System.out.println("2 - Desligar");
            this.opcao = digitar.nextInt();
            if (this.opcao == 1) {
                this.ligado = true;
                while (ligado) {
                    System.out.println("Opções:\n1 - Alterar Distancia Percorrida\n2 - Carregar a Bateria\n3 - Verificar carga da Bateria\n4 - Sair");
                    this.opcao = digitar.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Digite a distância Percorrida (em Km): ");
                            double distancia = digitar.nextDouble();
                            this.distanciaPercorrida += distancia;
                            cargaBateria -= distancia;
                            if (cargaBateria == 0) {
                                System.out.println("Carga da Bateria ZERADA, recarregue a bateria");
                            } if (cargaBateria < 0) {
                                System.out.println("Abaixo da Carga da Bateria, Finalizando o sistema.");
                                this.ligado = false;
                            }
                            break;
                        case 2:
                            System.out.println("Digite a quantidade de Carga para carregar (em Km): ");
                            double cargaParaCarregar = digitar.nextDouble();
                            this.cargaBateria += cargaParaCarregar;
                            
                            break;
                        case 3:
                            System.out.println("Carga Atual da bateria: "+cargaBateria+" Km");
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            this.ligado = false;
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                }
                loop = false;    
            } else {
                loop = false;
            }
        }
        
    }

    public String toString(){
        return "Moto Elétrica ligado: " + getLigado();
    }

}