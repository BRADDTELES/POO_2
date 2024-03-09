package model;

public class ContaCorrente {

    private String nomeBanco = "";
    private Integer numeroConta = 0;
    private Integer agencia = 0;
    private String nomeCliente = "";
    private Double saldo = 0.0;
    
    public void depositar(Double valorDeposito){
        setSaldo((Double) getSaldo() + valorDeposito);
    }
    
    public boolean sacar(Double valorSacar){
        if(getSaldo() >= valorSacar){
            setSaldo((Double) getSaldo() - valorSacar);
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the nomeBanco
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * @param nomeBanco the nomeBanco to set
     */
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    /**
     * @return the numeroConta
     */
    public Integer getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return the agencia
     */
    public Integer getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
