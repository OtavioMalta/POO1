public class Produto {
    protected int codigo;
    protected int quantidade;
    protected String descricao;


    public Produto(int codigo, int quantidade, String descricao) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }


    public int getQuantidade() {
        return this.quantidade;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public int retirar(int qtd){
        if(quantidade >= qtd){
        this.quantidade = this.quantidade - qtd;
        return qtd;
        }
        else{
            return 0;
        }
    }
    public void acrescentar(int qtd){
        this.quantidade = this.quantidade + qtd;
    }

    

    /*

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }*/



}
