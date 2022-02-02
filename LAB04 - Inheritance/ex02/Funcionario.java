import java.util.Date;

public class Funcionario {
    protected String nome;

    protected Date nascimento;

    protected double salario;


    public Funcionario(String nome, Date nascimento, double salario) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    public Funcionario(String nome, Date nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
