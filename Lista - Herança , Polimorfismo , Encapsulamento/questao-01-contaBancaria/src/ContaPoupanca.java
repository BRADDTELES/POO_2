//package model;
public class ContaPoupanca extends ContaCorrente {

    public Integer diaAniversario = 0;
    public Double taxaRendimento = 0.0;

    public void calcularRendimento() {
        super.saldo = super.saldo + (super.saldo * taxaRendimento);
    }
}