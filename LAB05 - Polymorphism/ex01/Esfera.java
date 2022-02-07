public class Esfera extends FormaTri{
    private double raio;

    @Override
    public double obterArea(){
        super.area = 4*(Math.PI*Math.pow(raio, 2)); 
        return super.area;
    }
    @Override
    public double obterVolume(){
        super.volume = (4/3)*Math.PI*Math.pow(raio, 3);
        return super.volume;
    }

    public Esfera(double raio) {
        this.raio = raio;
        super.volume = obterVolume();
        super.area = obterArea();
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public void descricao(){
        System.out.println("|Esfera|Lado: " + raio + " Area: " + obterArea() + " Volume" + obterVolume());
    }
}
