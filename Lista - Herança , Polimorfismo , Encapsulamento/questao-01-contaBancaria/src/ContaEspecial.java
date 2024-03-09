//package model;

public class ContaEspecial extends ContaCorrente{

    public Double limiteContaEspecial = 0.0;

    public boolean sacar(Double valorSacar){
        if((super.saldo + limiteContaEspecial) >= valorSacar){
            super.saldo = super.saldo - valorSacar;
            return true;
        }else{
            return false;
        }
    }
}