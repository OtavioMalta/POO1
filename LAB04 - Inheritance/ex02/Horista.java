import java.util.Date;

public class Horista extends Funcionario {
    
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(String nome, Date nascimento, double valorHora,int horasTrabalhadas) {
        super(nome, nascimento);
        super.setSalario(valorHora*horasTrabalhadas);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
        super.setSalario(valorHora*horasTrabalhadas);
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        super.setSalario(valorHora*horasTrabalhadas);
    }

}
