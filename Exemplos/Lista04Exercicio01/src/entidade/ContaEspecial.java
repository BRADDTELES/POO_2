package entidade;

import interfaces.ContaCorrente;
import interfaces.ContaPoupanca;

public class ContaEspecial implements ContaCorrente , ContaPoupanca{

    public Double saldo = 0.0;
    
    @Override
    public void depositar(Double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    @Override
    public void sacar(Double valorSaque) {
        saldo = saldo - valorSaque;
    }

    @Override
    public void aniversario(Double taxaRendimento) {
        saldo = saldo * (1 + taxaRendimento);
    }
    
}
