public class Circulo extends FormaBi{
    private double raio;

    @Override
    public double obterArea(){
        super.area = Math.PI*(Math.pow(raio, 2));
        return super.area;
    }

    public Circulo(double raio) {
        this.raio = raio;
        super.area = obterArea();
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    

    public void descricao(){
        System.out.println("|Circulo|Raio: " + raio + " Area: " + obterArea());
    }

}
