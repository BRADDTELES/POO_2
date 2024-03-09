import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner digitar = new Scanner(System.in);

        MotoEletrica motoEletrica = new MotoEletrica();

        motoEletrica.exibir();
        System.out.println(motoEletrica);
        
        digitar.close();
    }
}
