public class Triangulo extends FormaBi{
    private double base;
    private double altura;

    @Override
    public double obterArea(){
        super.area = (base*altura);
        return super.area;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        super.area = obterArea();
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void descricao(){
        System.out.println("|Triangulo|Base: " + base + "Altura: " + altura + " Area" + obterArea());
    }
}
