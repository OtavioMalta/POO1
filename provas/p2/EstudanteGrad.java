public class EstudanteGrad {
    String Matricula;
    String Nome;
    String CPF;
    int CargaHorariaDisciplinas;
    int CargaHorariaComplementar;
    String TituloTCC;
    String LocalEstagio;

    public EstudanteGrad(String cpf, String matricula, String nome) {
        Nome = nome;
        Matricula = matricula;
        CPF = cpf;
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
