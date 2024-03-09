public class App {
    public static void main(String[] args) throws Exception {
        Geladeira mostrar = new Geladeira();
        mostrar.exibir();
        System.out.println(mostrar.getTipo());
        mostrar.regularTemperatura();
        System.out.println(mostrar);
        
    }
}
