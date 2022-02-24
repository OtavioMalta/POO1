public class Principal {
    public static void main(String[] args) {
        
       Cliente[] clientes = new Cliente[3];
        clientes[0] = new Cliente("Bernardo");
        clientes[1] = new Cliente("Caio");
        clientes[2] = new Cliente("Alberto");

       Servico[] servicos = new Servico[3];
        servicos[0] = new Servico(28.30);
        servicos[1] = new Servico(37.40);
        servicos[2] = new Servico(19.20);

       Produto[] produtos = new Produto[3];
        produtos[0] = new Produto(3);
        produtos[1] = new Produto(1);
        produtos[2] = new Produto(2);

        System.out.println("\nCLIENTES");
        for(Cliente c : clientes){
            System.out.println(c.getNome());
        }
        System.out.println("\nSERVICOS");
        for(Servico s : servicos){
            System.out.println(s.getPreco());
        }
        System.out.println("\nPRODUTOS");
        for(Produto p : produtos){
            System.out.println(p.getCodigo());
        }

        Classificador classificador = new Classificador();

        classificador.ordena(clientes);
        classificador.ordena(servicos);
        classificador.ordena(produtos);

        System.out.println("\n---------------------\n");
        System.out.println("\nCLIENTES ORDENADOS");
        for(Cliente c : clientes){
            System.out.println(c.getNome());
        }
        System.out.println("\nSERVICOS ORDENADOS");
        for(Servico s : servicos){
            System.out.println(s.getPreco());
        }
        System.out.println("\nPRODUTOS ORDENADOS");
        for(Produto p : produtos){
            System.out.println(p.getCodigo());
        }

    }
}
