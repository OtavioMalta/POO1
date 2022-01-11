package Banco;

public class Conta {
    private double limite;
    private double saldo;
    
    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // v1
    public void depositar(double x){
        saldo+=x;
    }
    public void sacar(double x){
        saldo-=x;
    }
    
    // V1.1
    public void sacar2(double x){
        if(saldo + limite >= x){
            saldo-=x;
        }
    }

}
