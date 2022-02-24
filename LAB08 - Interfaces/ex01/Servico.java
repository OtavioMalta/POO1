public class Servico implements Classificavel {
    
    private double preco;

    public Servico() {
    }

    public Servico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Servico servico = (Servico) obj;
        if(this.preco < servico.preco){
            return true;
        }else{
            return false;
        }
    }

}
