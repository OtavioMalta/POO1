import java.util.Date;

public class Chefe extends Funcionario{
    
    private double salarioChefe = 6000.00;

    public Chefe(String nome, Date nascimento) {
        super(nome, nascimento);
        super.setSalario(salarioChefe);
    }


    public double getSalarioChefe() {
        return this.salarioChefe;
    }

    public void setSalarioChefe(double salarioChefe) {
        this.salarioChefe = salarioChefe;
        super.setSalario(salarioChefe);
    }

}
