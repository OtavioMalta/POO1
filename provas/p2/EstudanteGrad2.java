public class EstudanteGrad2 extends Estudante2 implements Senioridade{
    

    String Matricula;
    String Nome;
    String CPF;
    int CargaHorariaDisciplinas;
    int CargaHorariaComplementar;
    String TituloTCC;
    String LocalEstagio;


    public EstudanteGrad2(String Matricula, String Nome, String CPF, int CargaHorariaDisciplinas, int CargaHorariaComplementar, String TituloTCC, String LocalEstagio, boolean vacinado) {
        super(Matricula, Nome, CPF, CargaHorariaDisciplinas, vacinado);
        this.CargaHorariaComplementar = CargaHorariaComplementar;
        this.TituloTCC = TituloTCC;
        this.LocalEstagio = LocalEstagio;
    }
    

    public int getCargaHorariaDisciplinas() {
        return CargaHorariaDisciplinas;
    }


    // EXCERCICIO 3
    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        if(cargaHorariaDisciplinas < 0 || cargaHorariaDisciplinas > 3000){
            throw new ProvaException("VALOR INVÁLIDO");
        }else{
            
        CargaHorariaDisciplinas = cargaHorariaDisciplinas;
        }
    }

    public int getCargaHorariaComplementar() {
        return CargaHorariaComplementar;
    }

    public void setCargaHorariaComplementar(int cargaHorariaComplementar) {
        CargaHorariaComplementar = cargaHorariaComplementar;
    }

    public String getTituloTCC() {
        return TituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        TituloTCC = tituloTCC;
    }

    public String getLocalEstagio() {
        return LocalEstagio;
    }

    public void setLocalEstagio(String localEstagio) {
        LocalEstagio = localEstagio;
    }

    public void informacoesEstudanteGrad(){
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Matricula: " + Matricula );
        System.out.println("Carga Horária: " +  CargaHorariaDisciplinas);
        System.out.println("Horas complementares: " +  CargaHorariaComplementar);
        System.out.println("Local do estágio: " +  CargaHorariaComplementar);
        System.out.println("Título do TCC: " +  TituloTCC);

    
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certifico que o " +  super.Nome + "realiza estágio em " + this.LocalEstagio);
    }

      //EXCERCICIO 4
      @Override
      public boolean ehSenior(Senioridade obj) {
          EstudanteGrad2 e = ((EstudanteGrad2) obj);
        if(CargaHorariaComplementar > e.CargaHorariaComplementar){
            return true;
        }else{
            return false;
        }
    
    }
         
}
