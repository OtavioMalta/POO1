public class Item {
    protected String titulo;
    protected int tempoDuracao;
    protected String comentario;

    public void print(){
        System.out.println("Titulo: " + titulo + " Duracao: " + tempoDuracao + " Comentarios: "+ comentario);

    }

    public Item(String titulo, int tempoDuracao, String comentario) {
        this.titulo = titulo;
        this.tempoDuracao = tempoDuracao;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempoDuracao() {
        return this.tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
