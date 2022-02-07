public class Cubo extends FormaTri{
    private double lado;

    @Override
    public double obterArea(){
        super.area = 6*(Math.pow(lado, 2));
        return super.area;
    }

    @Override
    public double obterVolume(){
        super.volume = Math.pow(lado, 3);
        return super.volume;
    }

    public Cubo(double lado) {
        this.lado = lado;
        super.volume = obterVolume();
        super.area = obterArea();
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public void descricao(){
        System.out.println("|Cubo|Lado: " + lado + " Area: " + obterArea() + " Volume" + obterVolume());
    }
}
