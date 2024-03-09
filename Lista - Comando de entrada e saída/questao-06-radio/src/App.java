import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner digitar = new Scanner(System.in);
        
        Radio radio = new Radio();
        radio.ligar();
        radio.escolher();

        digitar.close();
    }
}
