package model;

public class ContaPoupanca extends ContaCorrente{
    
    public Integer diaAniversario = 0;
    public Double taxaRendimento = 0.05;
    
    public void calcularRendimento(){
        super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
    }
    
}
