public abstract class Pessoa2 {
    private boolean vacinado;

    public Pessoa2(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public Pessoa2() {
    }


    public abstract void gerarCertificado();
}