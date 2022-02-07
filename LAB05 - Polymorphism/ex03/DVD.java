public class DVD extends Item{
    

    protected String diretor;

    public DVD(String titulo, int tempoDuracao, String comentario, String diretor) {
        super(titulo, tempoDuracao, comentario);
        this.diretor = diretor;
    }

    @Override
    public void print (){
        super.print();
        //System.out.println("Titulo: " + titulo + " Duracao: " + tempoDuracao + " Diretor: " + diretor + " Comentarios: "+ comentario);
    }
}
