public class EstudanteGrad1 extends Estudante1{
    int CargaHorariaComplementar;
    String TituloTCC;
    String LocalEstagio;

    public EstudanteGrad1(String cpf, String matricula, String nome) {
        super(cpf, matricula, nome);
        
    }


    public EstudanteGrad1(String cpf, String matricula, String nome,int CargaHorariaDisciplinas, int CargaHorariaComplementar, String TituloTCC, String LocalEstagio) {
        super(cpf, matricula, nome, CargaHorariaDisciplinas);
        this.CargaHorariaComplementar = CargaHorariaComplementar;
        this.TituloTCC = TituloTCC;
        this.LocalEstagio = LocalEstagio;
    }


   

    public int getCargaHorariaDisciplinas() {
        return CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        CargaHorariaDisciplinas = cargaHorariaDisciplinas;
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
}
