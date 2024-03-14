package model;

public class ContaEspecial extends ContaCorrente {

    public Double limiteContaEspecial = 1000.0;
    // get -> pegar // set -> atribuir
    public boolean sacar(Double valorSacar) {
        if ((super.getSaldo() + limiteContaEspecial) >= valorSacar) {

            super.setSaldo(super.getSaldo() - valorSacar);
            return true;
        } else {
            return false;
        }
    }

}
