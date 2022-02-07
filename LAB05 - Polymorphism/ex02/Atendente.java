public class Atendente extends Funcionario {
    
    private float comissao;
    private int numVendas;

    public Atendente(String n, String CPF, String RG, int idade, int mat) {
        super(n,CPF,RG,idade,mat);
        comissao = 0.45f;
        numVendas = 0;
    }

    public void computaVenda() {
        numVendas++;
    }

    public float calculaSalario() {
 return (salarioBase + numVendas*comissao);
    }
}