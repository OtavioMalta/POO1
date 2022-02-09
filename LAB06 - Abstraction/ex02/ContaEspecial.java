public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        if(limite == 0){
            ContaComum cc = new ContaComum(val, num, pwd, 0);
        }else{
            this.limite = limite;
        }
    }

    @Override
    public boolean debitaValor(float val,int pwd){
        if(isSenha(pwd))
            return(false);
        if(getEstado(pwd)!=1)
            return(false);
        if(val<=0)
            return(false);
        if(val>getSaldo(pwd))
            return(false);
        
        debitaValor(val);
        return(true);
    }

}
