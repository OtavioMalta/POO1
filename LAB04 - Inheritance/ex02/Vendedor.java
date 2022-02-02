import java.util.Date;

public class Vendedor extends Funcionario{
    
    private int vendas;
    private double comissao;
    private double valorFixo = 1200;


    public Vendedor(String nome, Date nascimento, double comissao,int vendas) {
        super(nome, nascimento);
        super.setSalario(valorFixo+comissao*vendas);
        this.vendas = vendas;
        this.comissao = comissao;
    }


    public int getVendas() {
        return this.vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
        super.setSalario(valorFixo+comissao*vendas);
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
        super.setSalario(valorFixo+comissao*vendas);
    }

    public double getValorFixo() {
        return this.valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
        super.setSalario(valorFixo+comissao*vendas);
    }


}


