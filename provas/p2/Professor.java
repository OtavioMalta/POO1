import java.util.Date;

public class Professor {
    String NumeroFuncional;
    String Nome;
    String CPF;
    Date DataContrato;

    public Professor(String numeroFuncional, String nome, String CPF, Date dataContrato) {
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
        DataContrato = dataContrato;
    }

    public Professor(String numeroFuncional, String nome, String CPF) {
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
    }
}
