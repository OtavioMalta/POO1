import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ProdutoPerecivel extends Produto{

    protected Date validade;

    public ProdutoPerecivel(int codigo, int quantidade, String descricao) {
        super(codigo, quantidade, descricao);
        this.validade = new Date();
    }
    
    public int retirar(int qtd, Date data){
        long mili = data.getTime() - validade.getTime();
        TimeUnit dias = TimeUnit.DAYS; 
        long dif = dias.convert(mili, TimeUnit.MILLISECONDS);

        if(dif > 60){
            super.quantidade = 0;
            return super.quantidade;
        }   
        else if(quantidade >= qtd){
        this.quantidade = this.quantidade - qtd;
        return qtd;
        }
        else{
            return 0;
        }
    }

    @Override
    public void acrescentar(int qtd){
        if(super.quantidade == 0){
            this.quantidade = this.quantidade + qtd;
        }
    }
}
