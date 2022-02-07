public class Quadrado extends FormaBi {
    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;
        super.area = obterArea();
    }

    @Override
    public double obterArea(){
        super.area = lado*lado;
        return super.area;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    public void descricao(){
        System.out.println("|Quadrado|Lado: " + lado + " Area: " + obterArea());
    }

}
