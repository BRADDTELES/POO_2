package interfaces;
public interface ContaCorrente {
    public Double saldo = 0.0;
    public void depositar(Double valorDeposito);
    public void sacar(Double valorSaque);
}
