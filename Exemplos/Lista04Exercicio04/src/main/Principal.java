package main;

import entidade.Soma;
import entidade.Soma.TestarSoma;

public class Principal {
    public static void main(String[] args) {
        Soma soma = new Soma();
        soma.p1 = 3;
        soma.p2 = 4;
        soma.resultado = soma.somar(soma.p1, soma.p2);
        boolean passouTeste = Soma.TestarSoma.testeSoma(soma.p1, soma.p2, soma.resultado);
        System.out.println("passou no teste ? : " + passouTeste);
    }
}
