public class FormaBi extends Forma{
    protected double area;
    
    public double obterArea(){
        return area;
    }

    @Override
    public void descricao(){
        
    }

    @Override
    public void atributos(){
        System.out.println("|Forma Bidimensional| Area: " + area );
    }
}
