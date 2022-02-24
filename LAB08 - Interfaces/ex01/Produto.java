public class Produto implements Classificavel {

    private int codigo;


    public Produto() {
    }

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Produto produto = (Produto) obj;
        if(this.codigo < produto.codigo){
            return true;
        }else{
            return false;
        }
    }
}
