public class Piloto extends Funcionario {
    
    private int numHoras;

    public Piloto(String n, String CPF, String RG, 

    int idade, int mat, int nh) {
        super(n,CPF,RG,idade,mat);
        numHoras = nh;
    }
    public float calculaSalario() {
        return (salarioBase + numHoras*4);
    }
}