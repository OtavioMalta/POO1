public class Familia extends Contato {
    private String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println(" Parentesco: " + parentesco);        
    }

    public String getParentesco() {
        return this.parentesco;
    }


 
    
}
