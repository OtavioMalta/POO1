public class Tetraedro extends FormaTri{
    private double lado;

    @Override
    public double obterArea(){
        super.area = Math.pow(lado, 2)*Math.sqrt(3);
        return super.area;
    }

    @Override
    public double obterVolume(){
        super.volume = (areaBase()*altura())/3;
        return super.volume;
    }

    public Tetraedro(double lado) {
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

    public double areaBase(){
        return (Math.pow(lado, 2)*Math.sqrt(3))/4;
    }

    public double altura(){
        return (lado*Math.sqrt(6))/3;
    }

    public void descricao(){
        System.out.println("|Tetraedro|Lado: " + lado + " Area: " + obterArea() + " Volume" + obterVolume());
    }
}
