import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner digitar = new Scanner(System.in);
        Televisao mostrar = new Televisao();

        mostrar.peguntar();
        mostrar.passarCanal();

        System.out.println(mostrar);

        digitar.close();
    }
}
