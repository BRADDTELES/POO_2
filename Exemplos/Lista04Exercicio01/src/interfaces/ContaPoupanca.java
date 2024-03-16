package interfaces;
public interface ContaPoupanca {
    public Double saldo = 0.0;
    public void depositar(Double valorDeposito);
    public void sacar(Double valorSaque);
    public void aniversario(Double taxaRendimento);
}
