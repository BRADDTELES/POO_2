package entities;

public class Vendedor extends Colaborador {
    
    private Double salarioSindicato = 600.00;
    private Double venda;
    private Double comissao = 0.01;
    
    public Double getVenda() {
        return venda;
    }
    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double addComicao(Double comissao){
        return venda * comissao;
    }

    public Double renda(){
        return salarioSindicato += addComicao(comissao);
    }

    public String toString(){
        return "Valor das vendas: " 
                + String.format("%.2f",getVenda()) 
                + "\nComissão: " 
                + String.format("%.2f",addComicao(comissao))
                + "\nRenda: "
                + String.format("%.2f",renda());
    }

}
