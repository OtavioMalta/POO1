public class EstudantePosGrad {
    String CPF;
    String Nome;
    String Matricula;
    int CargaHorariaDisciplinas;
    String Nivel; // doutorado ou mestrado
    String TemaProjetoPesquisa;

    public EstudantePosGrad(String CPF, String matricula, String nome) {
        this.CPF = CPF;
        Nome = nome;
        Matricula = matricula;
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
}

