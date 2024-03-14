package model;

public class ContaCorrente {

    private String nomeBanco = "";
    private Integer numeroConta = 0;
    private Integer agencia = 0;
    private String nomeCliente = "";
    private Double saldo = 0.0;
    
    public void depositar(Double valorDeposito){
        saldo = saldo + valorDeposito;
    }
    
    public boolean sacar(Double valorSacar){
        if(saldo >= valorSacar){
            saldo = saldo - valorSacar;
            return true;
        }else{
            return false;
        }
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
