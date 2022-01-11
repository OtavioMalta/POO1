public class Cliente {
    private Long cpf;
    private String nome;
    private String nascimento;
    private Long cep;
    private Double compras = 0.0;


    public Cliente() {
    }

    public Cliente(Long cpf, String nome, String nascimento, Long cep) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cep = cep;
    }

    public void compra(Double preco){
        this.compras+=preco;
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

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }


    public Double getCompras() {
        return this.compras;
    }

    public void setCompras(Double compras) {
        this.compras = compras;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", cep=" + cep +
                "}\n" +
                "--------------------------------------------";
    }
}