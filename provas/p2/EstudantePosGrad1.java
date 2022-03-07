public class EstudantePosGrad1 extends Estudante1 implements Senioridade{
    String CPF;
    String Nome;
    String Matricula;
    int CargaHorariaDisciplinas;
    String Nivel; // doutorado ou mestrado
    String TemaProjetoPesquisa;


    public EstudantePosGrad1(String CPF, String Nome, String Matricula, int CargaHorariaDisciplinas, String Nivel, String TemaProjetoPesquisa) {
        super(CPF, Matricula, Nome, CargaHorariaDisciplinas);
        
        this.Nivel = Nivel;
        this.TemaProjetoPesquisa = TemaProjetoPesquisa;
    }

    
   
    public EstudantePosGrad1(String CPF, String Nome, String Matricula) {
        super(CPF, Matricula, Nome);
    }

    public int getCargaHorariaDisciplinas() {
        return CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        CargaHorariaDisciplinas = cargaHorariaDisciplinas;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
    }

    public String getTemaProjetoPesquisa() {
        return TemaProjetoPesquisa;
    }

    public void setTemaProjetoPesquisa(String temaProjetoPesquisa) {
        TemaProjetoPesquisa = temaProjetoPesquisa;
    }

    public void informacoesEstudantePos(){
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Matricula: " + Matricula );
        System.out.println("Carga Horária: " +  CargaHorariaDisciplinas);
        System.out.println("Nível: " +  Nivel);
        System.out.println("Tema de pesquisa: " +  TemaProjetoPesquisa);
    }

    @Override
    public boolean ehSenior(Senioridade obj) {
        if(Nivel.equals("Doutorado")){
            return true;
        }else{
            return false;
        }
    }
}

