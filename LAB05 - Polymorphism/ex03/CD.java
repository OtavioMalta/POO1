public class CD extends Item{
    
    private String artista;

    public CD(String titulo, int tempoDuracao, String comentario, String artista) {
        super(titulo, tempoDuracao, comentario);
        this.artista = artista;
    }
    @Override
    public void print (){
        super.print();
        //System.out.println("Titulo: " + titulo + " Duracao: " + tempoDuracao + " Artista: " + artista + " Comentarios: "+ comentario);
    }
}
