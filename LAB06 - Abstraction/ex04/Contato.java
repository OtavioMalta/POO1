public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;


    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }


    public void imprimirBasico(){
        System.out.print("Apelido: " + apelido + " Nome: " + nome + " Email: " + email + " Nascimento: " + aniversario);
    }

    public abstract void imprimirContato();


}
