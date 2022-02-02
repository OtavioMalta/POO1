public class VIP extends Ingresso {
    protected double valorAdicional = 3.0; 

    public double valor(){
        return super.valor() + valorAdicional();
    }
}
