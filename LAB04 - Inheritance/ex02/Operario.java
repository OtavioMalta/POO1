import java.util.Date;

public class Operario extends Funcionario {
    
    private double valorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, Date nascimento,double valorProducao,int quantidadeProduzida) {
        super(nome, nascimento);
        super.setSalario(valorProducao*quantidadeProduzida);
        this.quantidadeProduzida = quantidadeProduzida;
        this.valorProducao = valorProducao;
    }


    public double getValorProducao() {
        return this.valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
        super.setSalario(valorProducao*quantidadeProduzida);
    }

    public int getQuantidadeProduzida() {
        return this.quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
        super.setSalario(valorProducao*quantidadeProduzida);
    }

}
