public class App {
    public static void main(String[] args) throws Exception {

        CaixaDeSomBluetooth caixa = new CaixaDeSomBluetooth();

        caixa.ligar();

        if(caixa.getLigado()){
            System.out.println("\nCaixa de Som ligada!");
        } else{
            System.out.println("\nCaixa de Som desligada!");
        }
        
        caixa.parearBluetooth();
    }
}
