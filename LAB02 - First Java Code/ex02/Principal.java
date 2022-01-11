import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a Loja Virtual");
        int res = 1;
        ArrayList<Produto> produtosList = new ArrayList();
        ArrayList<Cliente> clientesList = new ArrayList();
        ArrayList<Funcionario> funcionariosList = new ArrayList();
        ArrayList<Compra> comprasList = new ArrayList();
        Cadastro cadastro = new Cadastro();

        while (res != 0) {
            
            System.out.println("\n-----MENU-----");
            System.out.println("Escolha uma opcao: \n");
            System.out.println("1.Cadastrar Produto");
            System.out.println("2.Cadastrar Cliente");
            System.out.println("3.Cadastrar Funcionario");
            System.out.println("4.Mostrar Produtos");
            System.out.println("5.Mostrar Clientes");
            System.out.println("6.Mostrar Funcionarios");
            System.out.println("7.Efetuar Compra");
            System.out.println("8.Mostrar Compras");
            System.out.println("9.Relatorio de Funcionarios");
            System.out.println("10.Relatorio de Produtos");
            System.out.println("11.Relatorio de Clientes\n");
            res = sc.nextInt();

            if (res == 1) {
                cadastro.produto(produtosList);

            } else if (res == 2) {
                cadastro.cliente(clientesList);
                
            } else if (res == 3) {
                cadastro.funcionario(funcionariosList);
                
            } else if (res == 4) {

                produtosList.forEach(System.out::println);
            } else if (res == 5) {

                clientesList.forEach(System.out::println);
            } else if (res == 6) {

                funcionariosList.forEach(System.out::println);
            } else if (res == 7) {
                cadastro.compra(produtosList, clientesList, funcionariosList, comprasList);
               
            } else if (res == 8) {
                System.out.println("----------------------Compras----------------------");
                comprasList.forEach(System.out::println);

            } else if (res == 9) {
                System.out.println("Relatorio dos Funcionarios");
                for (Funcionario f : funcionariosList) {
                    System.out.println("----------------------------------------------");
                    System.out.println("Nome: " + f.getNome() + " | Vendas: R$ " + f.getVendas());
                    System.out.println("----------------------------------------------");
                }
            } else if (res == 10) {
                System.out.println("Relatorio dos Produtos");
                for (Produto p : produtosList) {
                    System.out.println("----------------------------------------------");
                    System.out.println("Nome: " + p.getNome() + " | Vendas: R$ " + p.getCompras());
                    System.out.println("----------------------------------------------");
                }
            } else if (res == 11) {
                System.out.println("Relatorio dos Clientes");
                for (Cliente c : clientesList) {
                    System.out.println("----------------------------------------------");
                    System.out.println("Nome: " + c.getNome() + " | Vendas: R$ " + c.getCompras());
                    System.out.println("----------------------------------------------");
                }
            }
        }
        System.out.println("Encerrando o Programa.....");
    }
}