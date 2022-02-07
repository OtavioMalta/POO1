public class Main {
    public static void main(String[] args) {
        Forma formas[] = new Forma[6];
        formas[0] = new Circulo(3);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(2, 5);
        formas[3] = new Esfera(6);
        formas[4] = new Cubo(7);
        formas[5] = new Tetraedro(8); 

        System.out.println("ATRIBUTOS\n");

        for(Forma f : formas){
            f.atributos();
        }

        System.out.println("\n\nDESCRICAO\n");

        for(Forma f : formas){
            f.descricao();
        }
    }
}
