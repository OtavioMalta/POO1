public class Trabalho extends Contato {
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        System.out.println(" Tipo: " + tipo);
    }
    

    public String getTipo() {
        return this.tipo;
    }


}
