import java.util.ArrayList;

public class Estoque {
    protected ArrayList<ProdutoComPreco> produtos;
    //Fiz com ArrayList pois acho mais facil e pratico
    
    public void cadastrar(int codigo, int quantidade, String descricao, double preco){
        produtos.add(new ProdutoComPreco(codigo, quantidade, descricao, preco));
    }

    public ProdutoComPreco consultar(int index){
        return produtos.get(index);
    }

    public void inserir(ProdutoComPreco produtoComPreco, int index){
        produtos.add(index, produtoComPreco);
    }

    public int retirar(int index){
        if(index > produtos.size()){
            return -1;
        }else{
            produtos.remove(index);
            return 0;
        }
    }

    public double custoTotal(){
        double custoTotal = 0.0;
        for(ProdutoComPreco p : produtos){
            custoTotal+=p.getPreco()*p.getQuantidade();
        }
        return custoTotal;
    }
}

/*A classe deve ter métodos para cadastrar
e consultar produtos,inseri-los e retirá-los do estoque,
bem como para informar o custo total do esto que armazenado.
*/