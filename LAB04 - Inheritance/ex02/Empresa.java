import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0] = new Chefe("Alberto", sdf.parse("07/01/1988"));
        funcionarios[1] = new Vendedor("Bernardo", sdf.parse("17/12/1988"), 300, 5);
        funcionarios[2] = new Operario("Cecilia", sdf.parse("27/11/1998"), 200, 40);
        funcionarios[3] = new Horista("Daniel", sdf.parse("31/08/2000"), 20, 60);
        FolhaPagamento fp = new FolhaPagamento();
        fp.getFolhaPagamento(funcionarios);
    }
}
