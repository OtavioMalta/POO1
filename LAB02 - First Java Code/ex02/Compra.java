public class Compra {
    private Cliente cliente;
    private Produto produto;
    private Funcionario funcionario;
    private Double valor;
    

    @Override
    public String toString() {
        return "{" +
            " cliente='" + getCliente().getNome() + "'" +
            ", produto='" + getProduto().getNome() + "'" +
            ", funcionario='" + getFuncionario().getNome() + "'" +
            ", Valor='R$ " + getValor() + "'" +
            "}\n" +
            "--------------------------------------------";
    }

    public Compra() {
    }

    public Compra(Cliente cliente, Produto produto, Funcionario funcionario, Double valor) {
        this.cliente = cliente;
        this.produto = produto;
        this.funcionario = funcionario;
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
