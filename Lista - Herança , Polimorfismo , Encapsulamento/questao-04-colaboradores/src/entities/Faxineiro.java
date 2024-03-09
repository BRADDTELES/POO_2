package entities;

public class Faxineiro extends Colaborador {
    
    private Double salarioMinimo = 1412.00;
    private Double rendaAuxilio = 300.00;

    public Double renda(){
        return salarioMinimo += rendaAuxilio;
    }

    public String toString(){
        return "Salário a Receber: "
                + String.format("%.2f", renda());
    }
}
