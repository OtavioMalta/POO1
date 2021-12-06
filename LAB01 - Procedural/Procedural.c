#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
#define MAX_CLIENTES 20
#define MAX_PRODUTOS 20
#define MAX_FUNCIONARIOS 20
#define MAX_VENDAS 20

struct produto
{
    int id;
    char nome[50];
    char fabricante[50];
    double preco;
    int ativo;
};

struct cliente
{
    int cpf;
    char nome[50];
    char nascimento[50];
    char cep[15];
    int ativo;
};

struct funcionario
{
    int cpf;
    char nome[50];
    char nascimento[50];
    char ingresso[50];
    int ativo;
};

struct venda
{
    int qtdProduto;
    int produto;
    double preco;
    char funcionario[50];
    char cliente[50];
    int efetuada;
};

struct relatorio
{
    int maisVendido;
    char nomeMaisVendido[50];
    double maisCompras;
    char nomeMaisCompras[50];
    int maiorVenda;
    char funcionarioDoMes[50];
};

void cadastrar_cliente(struct cliente clientes[])
{
    int op = 1;
    system("cls");

    while (op != 0)
    {

        FILE *arq;

        arq = fopen("arquivo_clientes.txt", "a");

        printf("*-------------------------*\n");
        printf("| Cadastrar um Cliente |\n");
        printf("*-------------------------*\n");

        for (int i = 0; i < MAX_CLIENTES; i++)
        {
            if (clientes[i].ativo == 0)
            {
                printf("CPF: ");
                scanf("%d", &clientes[i].cpf);
                fflush(stdin);
                printf("\nNome: ");
                fgets(clientes[i].nome, 50, stdin);
                printf("\nNascimento: ");
                fflush(stdin);
                fgets(clientes[i].nascimento, 50, stdin);
                fflush(stdin);
                printf("\nCep: ");
                fgets(clientes[i].cep, 50, stdin);
                clientes[i].ativo = 1;

                fprintf(arq, "CPF:    %d\n", clientes[i].cpf);
                fprintf(arq, "\nNome:    %s\n", clientes[i].nome);
                fprintf(arq, "Nascimento:    %s\n", clientes[i].nascimento);
                fprintf(arq, "CEP:    %s\n", clientes[i].cep);
                fprintf(arq, "\n----------------------------\n");
                fclose(arq);

                printf("Cadastro realizado com sucesso!\n");
                break;
            }
        }
        printf("\n1 - Continuar\n0 - Sair\n");
        scanf("%d", &op);
    }
}

void cadastrar_produto(struct produto produtos[])
{
    int op = 1;
    system("cls");

    while (op != 0)
    {

        FILE *arq;

        arq = fopen("arquivo_produtos.txt", "a"); // a = w + r

        printf("*-------------------------*\n");
        printf("| Cadastrar um produto |\n");
        printf("*-------------------------*\n");

        for (int i = 0; i < MAX_PRODUTOS; i++)
        {
            if (produtos[i].ativo == 0)
            {
                printf("Codigo: ");
                scanf("%d", &produtos[i].id);
                fflush(stdin);
                printf("\nNome: ");
                fgets(produtos[i].nome, 50, stdin);
                printf("\nFabricante: ");
                fflush(stdin);
                fgets(produtos[i].fabricante, 50, stdin);
                fflush(stdin);
                printf("\nPreco: ");
                scanf("%lf", &produtos[i].preco);
                fflush(stdin);
                produtos[i].ativo = 1;

                fprintf(arq, "ID:    	      %d\n", produtos[i].id);
                fprintf(arq, "\nNome:          %s\n", produtos[i].nome);
                fprintf(arq, "Fabricante:    %s\n", produtos[i].fabricante);
                fprintf(arq, "Preco:         %.2lf\n", produtos[i].preco);
                fprintf(arq, "----------------------------\n");
                fclose(arq);

                printf("\nCadastro realizado com sucesso!\n");
                break;
            }
        }
        printf("\n1 - Continuar\n0 - Sair\n");
        scanf("%d", &op);
    }
}

void cadastrar_funcionario(struct funcionario funcionarios[])
{
    int op = 1;
    system("cls");

    while (op != 0)
    {

        FILE *arq;

        arq = fopen("arquivo_funcionarios.txt", "a"); // a = w + r

        printf("*-------------------------*\n");
        printf("| Cadastrar um funcionario |\n");
        printf("*-------------------------*\n");

        for (int i = 0; i < MAX_FUNCIONARIOS; i++)
        {
            if (funcionarios[i].ativo == 0)
            {
                printf("CPF: ");
                scanf("%d", &funcionarios[i].cpf);
                fflush(stdin);
                printf("\nNome: ");
                fgets(funcionarios[i].nome, 50, stdin);
                printf("\nNascimento: ");
                fflush(stdin);
                fgets(funcionarios[i].nascimento, 50, stdin);
                fflush(stdin);
                printf("\nIngresso: ");
                fgets(funcionarios[i].ingresso, 50, stdin);
                funcionarios[i].ativo = 1;

                fprintf(arq, "CPF:    %d\n", funcionarios[i].cpf);
                fprintf(arq, "\nNome:    %s\n", funcionarios[i].nome);
                fprintf(arq, "Nascimento:    %s\n", funcionarios[i].nascimento);
                fprintf(arq, "Ingresso:    %s\n", funcionarios[i].ingresso);
                fprintf(arq, "----------------------------\n");
                fclose(arq);

                printf("\nCadastro realizado com sucesso!\n");
                break;
            }
        }
        printf("\n1 - Continuar\n0 - Sair\n");
        scanf("%d", &op);
    }
}

void cadastrar_venda(struct venda vendas[], struct funcionario funcionarios[], struct produto produtos[], struct cliente clientes[])
{
    int op = 1;
    system("cls");

    while (op != 0)
    {

        FILE *arq;

        arq = fopen("arquivo_vendas.txt", "a"); // a = w + r

        printf("*-------------------------*\n");
        printf("| Efetuar uma Venda |\n");
        printf("*-------------------------*\n");
        for (int i = 0; i < MAX_VENDAS; i++)
        {
            if (vendas[i].efetuada == 0)
            {
                fflush(stdin);
                printf("\nNome do Cliente: ");
                fgets(vendas[i].cliente, 50, stdin);
                fflush(stdin);
                printf("\nNome do Funcionario: ");
                fgets(vendas[i].funcionario, 50, stdin);
                fflush(stdin);
                printf("\nId do Produto: ");
                scanf("%d", &vendas[i].produto);
                fflush(stdin);
                printf("\nQuantidade: ");
                scanf("%d", &vendas[i].qtdProduto);
                fflush(stdin);
                printf("\nPreco: ");
                scanf("%lf", &vendas[i].preco);
                fflush(stdin);
                vendas[i].efetuada = 1;

                fprintf(arq, "Quantidade:     %d\n", vendas[i].qtdProduto);
                fprintf(arq, "\nCliente:        %s\n", vendas[i].cliente);
                fprintf(arq, "Funcionario:    %s\n", vendas[i].funcionario);
                fprintf(arq, "Produto:        %d\n", vendas[i].produto);
                fprintf(arq, "Total:          R$%.2lf\n", vendas[i].qtdProduto * vendas[i].preco);

                fprintf(arq, "----------------------------\n");
                fprintf(arq, "\n");
                fclose(arq);

                printf("\nCadastro realizado com sucesso!\n");
                break;
            }
        }
        printf("\n1 - Continuar\n0 - Sair\n");
        scanf("%d", &op);
    }
}

void lista_clientes(struct cliente clientes[])
{
    int id;
    system("cls");
    printf("*----------------------*\n");
    printf("| Lista de Clientes  |\n");
    printf("*----------------------*\n");
    for (int i = 0; i < MAX_CLIENTES; i++)
    {
        if (clientes[i].ativo == 1)
        {
            printf("\nNome: %s", clientes[i].nome);
            printf("\n---------------");
        }
    }
    printf("\nDigite qualquer tecla para continuar\n\n");
    getch();
}

void lista_produto(struct produto produtos[])
{
    int id;
    system("cls");
    printf("*----------------------*\n");
    printf("| Lista de produtos  |\n");
    printf("*----------------------*\n");
    for (int i = 0; i < MAX_PRODUTOS; i++)
    {
        if (produtos[i].ativo == 1)
        {
            printf("\nCodigo:   #%d", produtos[i].id);
            printf("\nNome:     %s", produtos[i].nome);
            printf("---------------");
        }
    }
    printf("\nDigite qualquer tecla para continuar\n\n");
    getch();
}

void lista_funcionario(struct funcionario funcionarios[])
{
    int id;
    system("cls");
    printf("*----------------------------*\n");
    printf("| Lista de funcionarios  |\n");
    printf("*----------------------------*\n");
    for (int i = 0; i < MAX_FUNCIONARIOS; i++)
    {
        if (funcionarios[i].ativo == 1)
        {
            printf("\nNome: %s", funcionarios[i].nome);
            printf("\n---------------");
        }
    }
    printf("\nDigite qualquer tecla para continuar\n\n");
    getch();
}

void mais_vendido(struct produto produtos[], struct venda vendas[], struct relatorio relatorio)
{
    for (int i = 0; i < MAX_PRODUTOS; i++)
    {
        int total = 0;
        if (produtos[i].ativo == 1)
        {
            for (int j = 0; j < MAX_VENDAS; j++)
            {
                if (vendas[j].efetuada == 1)
                {
                    if (produtos[i].id == vendas[j].produto)
                    {
                        total = total + vendas[j].qtdProduto;
                    }
                }
            }
        }
        if (total > relatorio.maisVendido)
        {
            relatorio.maisVendido = total;
            strcpy(relatorio.nomeMaisVendido, produtos[i].nome);
        }
    }

    printf("Produto mais vendido: %s", relatorio.nomeMaisVendido);
    printf("Total vendido: %d", relatorio.maisVendido);

    printf("\nDigite qualquer tecla para continuar\n\n");
    getch();
}

void mais_compras(struct cliente clientes[], struct venda vendas[], struct relatorio relatorio)
{
    for (int i = 0; i < MAX_CLIENTES; i++)
    {
        double total = 0;
        if (clientes[i].ativo == 1)
        {
            for (int j = 0; j < MAX_VENDAS; j++)
            {
                if (vendas[j].efetuada == 1)
                {
                    if ((strcmp(clientes[i].nome, vendas[j].cliente)) == 0)
                    {
                        total = total + vendas[j].qtdProduto * vendas[j].preco;
                    }
                }
            }
        }
        if (total > relatorio.maisCompras)
        {
            relatorio.maisCompras = total;
            strcpy(relatorio.nomeMaisCompras, clientes[i].nome);
        }
    }

    printf("Cliente que mais gasta: %s", relatorio.nomeMaisCompras);
    printf("Total gasto: R$%.2lf", relatorio.maisCompras);

    printf("\nDigite qualquer tecla para continuar\n\n");
    getch();
}

void funcionario_do_mes(struct funcionario funcionarios[], struct venda vendas[], struct relatorio relatorio)
{
    for (int i = 0; i < MAX_FUNCIONARIOS; i++)
    {
        int total = 0;
        if (funcionarios[i].ativo == 1)
        {
            for (int j = 0; j < MAX_VENDAS; j++)
            {
                if (vendas[j].efetuada == 1)
                {
                    if ((strcmp(funcionarios[i].nome, vendas[j].funcionario)) == 0)
                    {
                        total++;
                    }
                }
            }
        }
        if (total > relatorio.maiorVenda)
        {
            relatorio.maiorVenda = total;
            strcpy(relatorio.funcionarioDoMes, funcionarios[i].nome);
        }
    }

    printf("Funcionario do mes: %s", relatorio.funcionarioDoMes);
    printf("Total de vendas: %d", relatorio.maiorVenda);

    printf("\nDigite qualquer tecla para continuar\n\n");
    getch();
}

void menu()
{
    int opcao;
    struct cliente clientes[MAX_CLIENTES];
    struct funcionario funcionarios[MAX_CLIENTES];
    struct produto produtos[MAX_CLIENTES];
    struct venda vendas[MAX_VENDAS];
    struct relatorio relatorio;

    memset(&funcionarios, 0, sizeof(funcionarios));
    memset(&clientes, 0, sizeof(clientes));
    memset(&relatorio, 0, sizeof(relatorio));

    while (1)
    {
        system("cls");
        printf("\n*-----------------------*");
        printf("\n| Bem vindo a Loja! |");
        printf("\n*-----------------------*");
        printf("\n1- Cadastrar cliente");
        printf("\n2- Cadastrar produto");
        printf("\n3- Cadastrar funcionario");
        printf("\n4- Efetuar venda");
        printf("\n5- Lista de clietes");
        printf("\n6- Lista de produtos");
        printf("\n7- Lista de funcionarios");
        printf("\n8- Produto mais vendido");
        printf("\n9- Cliente que mais gasta");
        printf("\n10- Funcionario do mes");

        printf("\n0- Sair ");
        printf("\n\nDigite uma  opcao: ");
        scanf("%d", &opcao);
        if (opcao == 1)
            cadastrar_cliente(clientes);
        if (opcao == 2)
            cadastrar_produto(produtos);
        if (opcao == 3)
            cadastrar_funcionario(funcionarios);
        if (opcao == 4)
            cadastrar_venda(vendas, funcionarios, produtos, clientes);
        if (opcao == 5)
            lista_clientes(clientes);
        if (opcao == 6)
            lista_produto(produtos);
        if (opcao == 7)
            lista_funcionario(funcionarios);
        if (opcao == 8)
            mais_vendido(produtos, vendas, relatorio);
        if (opcao == 9)
            mais_compras(clientes, vendas, relatorio);
        if (opcao == 10)
            funcionario_do_mes(funcionarios, vendas, relatorio);

        if (opcao == 0)
            return;
    }
}

int main()
{
    menu();
}