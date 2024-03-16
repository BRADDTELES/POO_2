package entidade;

import interfaces.ContaCorrente;

public class Corrente implements ContaCorrente{
    
    public Double saldo = 0.0;

    @Override
    public void depositar(Double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    @Override
    public void sacar(Double valorSaque) {
        saldo = saldo - valorSaque;
    }
}
