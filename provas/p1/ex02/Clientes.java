public class Clientes {
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String cidade;
    private String estado;
    private contaCorrent[] contaCorrente; // Um cliente pode ter mais de uma conta corrente
    //private Gerente gerente;


    public Clientes() {
    }

    public Clientes(int id, String nome, String cpf, String dataNascimento, String endereco, String cidade, String estado, contaCorrent[] contaCorrente) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.contaCorrente = contaCorrente;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public contaCorrent[] getContaCorrente() {
        return this.contaCorrente;
    }

    public void setContaCorrente(contaCorrent[] contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

}
