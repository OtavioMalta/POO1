public class Agencia {
    private String nome;
    private String cidade;
    private String estado;

    public Agencia() {
    }

    public Agencia(String nome, String cidade, String estado) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

}
