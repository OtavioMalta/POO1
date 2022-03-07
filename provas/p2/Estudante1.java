public class Estudante1 {
    String Matricula;
    String Nome;
    String CPF;
    int CargaHorariaDisciplinas;

    public Estudante1(String cpf, String matricula, String nome,int CargaHorariaDisciplinas) {
        Nome = nome;
        Matricula = matricula;
        CPF = cpf;
        this.CargaHorariaDisciplinas = CargaHorariaDisciplinas;
    }

    public Estudante1(String cpf, String matricula, String nome) {
        Nome = nome;
        Matricula = matricula;
        CPF = cpf;
    }
    
    public String getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getCargaHorariaDisciplinas() {
        return this.CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int CargaHorariaDisciplinas) {
        this.CargaHorariaDisciplinas = CargaHorariaDisciplinas;
    }

    public void informacoesEstudanteGrad(){
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Matricula: " + Matricula );
        System.out.println("Carga Horária: " +  CargaHorariaDisciplinas);
    }
}
