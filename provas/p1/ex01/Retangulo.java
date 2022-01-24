public class Retangulo {
    private Ponto ponto1;
    private Ponto ponto2;

    //Construtor vazio(para a inicialização do objeto sem nenhum dado)
    public Retangulo() {
    }
    
    //Construtor com os atributos sendo passados como parametro
    public Retangulo(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public Ponto getPonto1() {
        return this.ponto1;
    }

    public void setPonto1(Ponto ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto getPonto2() {
        return this.ponto2;
    }

    public void setPonto2(Ponto ponto2) {
        this.ponto2 = ponto2;
    }

    public String print() {
        return "Ponto1 = " + getPonto1().print() +", Ponto2 = " + getPonto2().print();
    }

    public Double area(){   
        return (ponto2.getX()-ponto1.getX())*(ponto2.getY()-ponto1.getY());
    }
}

