import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner digitar = new Scanner(System.in);
        
        Moto mostrar = new Moto(null, null, null);
        System.out.print("Marca: ");
        mostrar.marca = digitar.next();
        System.out.print("Modelo: ");
        mostrar.modelo = digitar.next();
        System.out.print("Cor: ");
        mostrar.cor = digitar.next();
        
        mostrar.ligar();
        mostrar.passarMarcha();
        
        System.out.println(mostrar);

        digitar.close();
    }
}
