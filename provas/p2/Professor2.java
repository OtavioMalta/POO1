import java.util.Date;

public class Professor2 extends Pessoa2 implements Senioridade{
    String NumeroFuncional;
    String Nome;
    String CPF;
    Date DataContrato;

    public Professor2(String numeroFuncional, String nome, String CPF, Date dataContrato, boolean vacinado) {
        super(vacinado);
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
        DataContrato = dataContrato;
    }

    public Professor2(String numeroFuncional, String nome, String CPF) {
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certifico que o "+this.Nome+" é orientador de estudantes");
        
    }


    //EXCERCICIO 4
    @Override
    public boolean ehSenior(Senioridade obj) {
       
        if(this.DataContrato.compareTo((Date)obj)>0){
            return true;
        }else{
            return false;
        }
    }

    
}
