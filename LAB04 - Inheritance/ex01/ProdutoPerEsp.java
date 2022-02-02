public class ProdutoPerEsp extends ProdutoPerecivel{

    public ProdutoPerEsp(int codigo, int quantidade, String descricao) {
        super(codigo, quantidade, descricao);
    }

    public void imprimir(){
        System.out.println("Codigo: " + codigo + "\nDescricao: " + descricao + "\nQuantidade: "+ quantidade + "\nValidade: " + validade);
    }
    
    
}
