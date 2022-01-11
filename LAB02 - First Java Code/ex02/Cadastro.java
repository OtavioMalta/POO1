import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    Scanner sc = new Scanner(System.in);

    public void produto(ArrayList<Produto> produtosList){
        System.out.println("Cadastro de Produto");
        System.out.println("Quantos produtos gostaria de cadastrar? ");
        int resp = sc.nextInt();
        for (int i = 1; i <= resp; i++) {
            System.out.println("--------PRODUTO " + i + "-------");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Codigo: ");
            int id = sc.nextInt();
            System.out.println("Fabricante: ");
            String fabricante = sc.next();
            System.out.println("Preco |use virgula| : ");
            double preco = sc.nextDouble();
            Produto p = new Produto(id, nome, fabricante, preco);
            produtosList.add(p);
            System.out.println("");
            System.out.println("Produto cadastrado com sucesso!");
        }
    }
    public void cliente(ArrayList<Cliente> clientesList){
        System.out.println("Cadastro de Clientes");
        System.out.println("Quantos clientes gostaria de cadastrar? ");
        int resp = sc.nextInt();
        for (int i = 1; i <= resp; i++) {
            System.out.println("--------CLIENTE " + i + "-------");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("CPF: ");
            Long cpf = sc.nextLong();
            System.out.println("Data de nascimento: ");
            String nascimento = sc.next();
            System.out.println("CEP: ");
            Long cep = sc.nextLong();
            Cliente c = new Cliente(cpf, nome, nascimento, cep);
            clientesList.add(c);
            System.out.println("");
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }
    public void funcionario(ArrayList<Funcionario> funcionariosList){
        System.out.println("Cadastro de Funcionarios");
        System.out.println("Quantos funcionarios gostaria de cadastrar? ");
        int resp = sc.nextInt();
        for (int i = 1; i <= resp; i++) {
            System.out.println("--------FUNCIONARIO " + i + "-------");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("CPF: ");
            Long cpf = sc.nextLong();
            System.out.println("Data de nascimento: ");
            String nascimento = sc.next();
            System.out.println("Ingresso: ");
            String ingresso = sc.next();

            Funcionario f = new Funcionario(cpf, nome, nascimento, ingresso);

            funcionariosList.add(f);

            System.out.println("");
            System.out.println("Funcionario cadastrado com sucesso!");
        }
    }
    public void compra(ArrayList<Produto> produtosList,ArrayList<Cliente> clientesList,ArrayList<Funcionario> funcionariosList,ArrayList<Compra> comprasList){
        System.out.println("Efetuar compra");
        System.out.println("Id do Produto: ");
        int id = sc.nextInt();
        int qtd;
        for (Produto p : produtosList) {
            if (p.getId() == id) {
                System.out.println("Quantidade: ");
                qtd = sc.nextInt();
                System.out.println("CPF do Cliente: ");
                Long cpf = sc.nextLong();
                for (Cliente c : clientesList) {
                    if (c.getCpf().equals(cpf)) {
                        System.out.println("CPF do Funcionario: ");
                        Long cpff = sc.nextLong();
                        for (Funcionario f : funcionariosList) {
                            if (f.getCpf().equals(cpff)) {
                                double v = p.getPreco() * qtd;
                                Compra compra = new Compra(c, p, f, v);
                                f.vendeu(v);
                                p.compra(v);
                                c.compra(v);
                                comprasList.add(compra);
                                System.out.println("Compra efetuada com sucesso!");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
