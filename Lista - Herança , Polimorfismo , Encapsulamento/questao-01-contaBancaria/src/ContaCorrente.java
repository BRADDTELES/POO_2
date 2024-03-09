//package model;
public class ContaCorrente{
    public String nomeBanco, nomeDoCliente;
    public Integer numeroConta, agencia;
    public Double saldo = 0.0;

    public void depositar(Double valorDeposito){
        saldo = saldo + valorDeposito;
    }

    public boolean sacar(String valorSacar){
        if(saldo >= valorSacar){
            saldo = saldo - valorSacar;
            return true;
        }else{
            return false;
        }
    }

}