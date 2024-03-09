import java.util.Scanner;
public class Moto {
    public String marca;
    public String modelo;
    public String cor;
    public int opcao;
    
    public Moto(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    Scanner digitar = new Scanner(System.in);
    public void ligar(){
        System.out.println("Ligar a Moto ?\nDigite: (1) Sim ou (0) Não");
        opcao = digitar.nextInt();
    }

    public void passarMarcha(){
        boolean resposta = (opcao == 1);
        while (resposta) {
            System.out.println("Passar a 1º Marcha ?\n(1) 1º Marcha\n(0) Sair");
            opcao = digitar.nextInt();
            if (opcao == 1) {
                System.out.println("1º marcha ativada");
                System.out.println("Passar a 2º Marcha ?\n(2) 2º Marcha\n(0)Sair");
                opcao = digitar.nextInt();
                if (opcao == 2) {
                    System.out.println("2º marcha ativada");
                    System.out.println("Passar a 3º Marcha ?\n(3) 3º Marcha\n(0) Sair");
                    opcao = digitar.nextInt();
                    if (opcao == 3) {
                        System.out.println("3º marcha ativada");
                        System.out.println("Passar a 4º Marcha ?\n(4) 4º Marcha\n(0) Sair");
                        opcao = digitar.nextInt();
                        if (opcao == 4) {
                            System.out.println("4º marcha ativada");
                            System.out.println("Passar a 5º Marcha ?\n(5) 5º Marcha\n(0) Sair");
                            opcao = digitar.nextInt();
                            if (opcao == 5) {
                                System.out.println("5º marcha ativada");
                                resposta = false;
                            }else if (opcao == 0) {
                                resposta = false;
                            }else{
                                System.out.println("Retornando ao inicio...");
                            }
                        }else if (opcao == 0) {
                            resposta = false;
                        }else{
                            System.out.println("Retornando ao inicio...");
                        }
                    }else if (opcao == 0) {
                        resposta = false;    
                    }else{
                        System.out.println("Retornando ao inicio...");
                    }
                }else if (opcao == 0) {
                    resposta = false;    
                }else{
                    System.out.println("Retornando ao inicio...");
                }
            }else if (opcao == 0) {
                resposta = false;
            }else{
                System.out.println("Retornando ao inicio...");
            }
            
        }
    }

    public String toString(){
        return "Marca: "
                + marca
                + " Modelo: "
                + modelo 
                + " Cor: "
                + cor;
    }
}
