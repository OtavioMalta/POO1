public class ContaCorrente{
    private float saldo;
    private int estado;
    private int numConta;
    private int senha;

    public ContaCorrente(float val,int num,int pwd){
    numConta=num;
    senha=pwd;
    saldo=val;
    estado=1;
}

    public boolean debitaValor(float val,int pwd){
        if(pwd!=senha)
        return(false);
        if(estado!=1)
        return(false);
        if(val<=0)
        return(false);
        if(val>saldo)
        return(false);

    saldo-=val;
        if(saldo==0)
        estado=2;
        return(true);
    }

    public void debitaValor(float val){
        saldo-=val;
    }

    public float getSaldo(int pwd){
        if(senha==pwd)
        return saldo;
        else
        return-1;
    }

    public void creditaValor(int pwd,float val){
        if(senha==pwd)
        saldo+=val;
    }

    protected int getEstado(int pwd){
        if(senha==pwd)
        return estado;
        else
        return-1;
    }

    protected void setEstado(int pwd,int e){
        if(senha==pwd)
        estado=e;
    }

    protected boolean isSenha(int pwd){
        if(senha==pwd)
        return true;
        else
        return false;
        }
    }