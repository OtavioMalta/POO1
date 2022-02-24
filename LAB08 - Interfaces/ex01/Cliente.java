public class Cliente implements Classificavel {
    
    private String nome;
    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Cliente cliente = (Cliente) obj;
        if(this.nome.compareTo(cliente.nome) < 0){
            return true;
        }else{
            return false;
        }
    }


}
