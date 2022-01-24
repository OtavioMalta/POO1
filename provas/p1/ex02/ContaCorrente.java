public class ContaCorrente {
    private int id;
    private Agencia agencia;
    private Cliente[] clientes; //Uma conta corrente pode ter mais de um cliente
    private String criacao;
    private Double saldo;
    private String acesso;
    
    public ContaCorrente() {
    }

    public ContaCorrente(int id, Agencia agencia, Cliente[] clientes, String criacao, Double saldo, String acesso) {
        this.id = id;
        this.agencia = agencia;
        this.clientes = clientes;
        this.criacao = criacao;
        this.saldo = saldo;
        this.acesso = acesso;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente[] getClientes() {
        return this.clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public String getCriacao() {
        return this.criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAcesso() {
        return this.acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

}
