public class Funcionario {
    private Long cpf;
    private String nome;
    private String nascimento;
    private String ingresso;
    private Double vendas = 0.0;

    public void vendeu(Double preco){
        this.vendas+=preco;
    }

    public Funcionario() {
    }

    public Funcionario(Long cpf, String nome, String nascimento, String ingresso) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.ingresso = ingresso;
    }


    public Double getVendas() {
        return this.vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Funcionario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", ingresso=" + ingresso +
                '}' + 
                "\n--------------------------------------------";
    }
}