import java.util.ArrayList;
import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        int r = 1;
        Scanner sc = new Scanner(System.in);
        String apelido;
        String nome;
        String email;
        String aniversario;
        String grau;
        String parentesco;
        String tipo;
        while (r != 0) {
            System.out.println("\nEscolha uma opcao: ");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Imprimir to dos os contatos");
            System.out.println("3 - Imprimir somente os familiares");
            System.out.println("4 - Imprimir somente os amigos");
            System.out.println("5 - Imprimir somente os colegas de trabalho");
            System.out.println("6 - Imprimir os algum tipo de amigos");
            System.out.println("7 - Imprimir os dados de um ÚNICO contato");
            System.out.println("0 - Sair");
            r = sc.nextInt();
            sc.nextLine();
            System.out.println();
                if(r == 1){
                    System.out.println("Qual o tipo do contato? ");
                    System.out.println("1 - Amigo");
                    System.out.println("2 - Familia");
                    System.out.println("3 - Trabalho");
                    r = sc.nextInt();
                    sc.nextLine();
                    if(r == 1) {
                       
                            System.out.println("Apelido: ");
                            apelido = sc.nextLine();
                            System.out.println("Nome: ");
                            nome = sc.nextLine();
                            System.out.println("Email: ");
                            email = sc.nextLine();
                            System.out.println("Aniversario: ");
                            aniversario = sc.nextLine();
                            System.out.println("Grau|Melhor amigo: 1|Amigo: 2|Conhecido: 3|: ");

                            grau = sc.nextLine();

                            Amigos amigo = new Amigos(apelido, nome, email, aniversario, grau);
                            contatos.add(amigo);}

                    if(r == 2) {
                            System.out.println("Apelido: ");
                            apelido = sc.nextLine();
                            System.out.println("Nome: ");
                            nome = sc.nextLine();
                            System.out.println("Email: ");
                            email = sc.nextLine();
                            System.out.println("Aniversario: ");
                            aniversario = sc.nextLine();
                            System.out.println("Parentesco: ");

                            parentesco = sc.nextLine();

                            Familia familia = new Familia(apelido, nome, email, aniversario, parentesco);
                            contatos.add(familia);}
                        
                    if(r == 3){
                            System.out.println("Apelido: ");
                            apelido = sc.nextLine();
                            System.out.println("Nome: ");
                            nome = sc.nextLine();
                            System.out.println("Email: ");
                            email = sc.nextLine();
                            System.out.println("Aniversario: ");
                            aniversario = sc.nextLine();
                            System.out.println("Tipo: ");

                            tipo = sc.nextLine();

                            Trabalho trabalho = new Trabalho(apelido, nome, email, aniversario, tipo);
                            contatos.add(trabalho);}
                    
                    }else if(r == 2){
                        for(Contato c : contatos){
                            c.imprimirContato();}
                    }else if(r == 3){
                        for(Contato c : contatos){
                           if(c instanceof Familia){
                               c.imprimirContato();
                           }
                    }}else if(r == 4){
                        for(Contato c : contatos){
                           if(c instanceof Amigos){
                               c.imprimirContato();
                           }
                    }}else if(r == 5){
                        for(Contato c : contatos){
                           if(c instanceof Trabalho){
                               c.imprimirContato();
                           }
                    }}else if(r == 6){
                        for(Contato c : contatos){
                            if(c instanceof Amigos){
                                Amigos a = (Amigos)c;
                                if(a.getGrau().equals("1")){
                                    a.imprimirContato();
                                }
                            }else if(c instanceof Familia){
                                Familia f = (Familia)c;
                                if(f.getParentesco().equalsIgnoreCase("irmao")){
                                    f.imprimirContato();
                                }
                            }else if(c instanceof Trabalho){
                                Trabalho t = (Trabalho)c;
                                if(t.getTipo().equalsIgnoreCase("colega")){
                                    t.imprimirContato();
                                }
                            }
                        }

                        }else if(r == 7){
                        System.out.println("Indice: ");
                        r = sc.nextInt();
                        Contato res = contatos.get(r);
                        System.out.println(res.getClass());
                        res.imprimirContato();
                    }
                        
            }
        }
    }
