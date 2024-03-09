package entities;

public class Gerente extends Colaborador {

    private Double salario = 2076.00;
    private Double producao = 1500.00;
    private Double divisor = 220.00;
    private Double horasExtras;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getProducao() {
        return producao;
    }

    public void setProducao(Double producao) {
        this.producao = producao;
    }

    public Double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Double valorPorHora(){
        Double valorPorHora = salario / divisor;
        return valorPorHora;
    }

    public Double valorHorasExtras(){
        return getHorasExtras() * valorPorHora();
    }

    public Double renda(){
        return salario + producao + valorHorasExtras();
    }

    public String toString(){
        return "Salário: " 
                + String.format("%.2f",getSalario()) 
                + "\nProdução: " 
                + String.format("%.2f",getProducao())
                + "\nValor por hora: "
                + String.format("%.2f",valorPorHora())
                + "\nHoras extras: "
                + String.format("%.2f",getHorasExtras())
                + "\nRenda: "
                + String.format("%.2f",renda());
    }
    
}
