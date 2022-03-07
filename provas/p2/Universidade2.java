import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Universidade2 {

    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd"); 

       Pessoa2 pessoas[] = new Pessoa2[3];
        pessoas[0] = new EstudanteGrad2("3123123BSI", "Carlos", "12312312", 2000, 200, "Block Chain", "Magalu", true);
        pessoas[1] = new EstudantePosGrad2("31231233123", "Alberto", "213213BSI", 1500, "3", "Inteligencia artificial", false);
        pessoas[2] = new Professor2("123123", "Sergio Souza", "2132134", dt.parse("2001-01-18"), true);
        
        EstudanteGrad2 e = new EstudanteGrad2("23213213", "fred", "sadasdas", 2000, 300, "TituloTCC","algar", true);
        //e.setCargaHorariaDisciplinas(-1200); mostraria o erro mas pararia o programa

        try {
            e.setCargaHorariaDisciplinas(-1200);
        } catch (ProvaException exception) {
            System.out.println(exception);
        }
        for(Pessoa2 p: pessoas ){
            System.out.println("\n----------------");
            p.gerarCertificado();
        }
  
      
    }
}
