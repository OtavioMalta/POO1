public class ProdutoComPreco extends Produto{
    

    protected double preco;

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0){
            this.preco = preco;
        }
    }
    public ProdutoComPreco(int codigo, int quantidade, String descricao, double preco) {
        super(codigo, quantidade, descricao);
        this.preco = preco;
    }

}
