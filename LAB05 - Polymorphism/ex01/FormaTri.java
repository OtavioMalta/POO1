public class FormaTri extends Forma{
    protected double area;
    protected double volume;

    public double obterVolume(){
        return volume;
    }
    public double obterArea(){
        return area;
   }
   public void descricao(){
       
   }

   @Override
   public void atributos(){
       System.out.println("|Forma Tridimensional| Volume: " + volume);
   }
}
