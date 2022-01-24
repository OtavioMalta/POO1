public class Ponto {
    private double x;
    private double y;
    
    //Construtor vazio(para a inicialização do objeto sem nenhum dado)
    public Ponto() {
    }

    //Construtor com os atributos sendo passados como parametro
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Getters e setters
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String print() {
        return "("+getX() +", " + getY()+")";
    }

}
