package util;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Classe Utilitária para Entrada e saída de dados
 *
 * @author Professor Aécio
 * @version 1.0
 * @since 13/03/2023
 */
public class Alexa {
    /**
     * Escrever uma String no terminal
     *
     * @param texto String
     */
    public static void escreva(String texto){
        System.out.print(texto);
    }
    /**
     * Escrever uma String no terminal
     *
     * @param texto String
     */
    public static void escreva(String texto,Double numero){
        System.out.printf(texto + "%.2f",numero);
    }
    /**
     * Ler uma String no terminal
     *
     * @return String
     */
    public static String leiaString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    /**
     * Ler um Integer no terminal
     *
     * @return Integer
     */
    public static int leiaInteger(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    /**
     * Ler um Double no terminal
     *
     * @return Double
     */
    public static double leiaDouble(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    /**
     * Ler um texto na janela
     *
     * @param texto String
     * @return String
     */
    public static String escrevaLeiaJanela(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    /**
     * Escrever um texto na janela
     *
     * @param texto String
     */
    public static void escrevaJanela(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
}