public class Amigos extends Contato {
   
    
    private String grau;

    public Amigos(String apelido, String nome, String email, String aniversario, String grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println(" Grau: " + grau);        
    }

    public String getGrau() {
        return this.grau;
    }

    

}
