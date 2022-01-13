import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto();

        System.out.println("--Ponto 1--");
        System.out.println("Digite o valor de X: ");
        p1.setX(sc.nextInt());

        System.out.println("Digite o valor de Y: ");
        p1.setY(sc.nextInt());
        System.out.println("O ponto digitado eh: " + p1.imprimir_ponto());
        
        System.out.println("--Ponto 2--");
        System.out.println("Digite o valor de X: ");
        p2.setX(sc.nextInt());

        System.out.println("Digite o valor de Y: ");
        p2.setY(sc.nextInt());
        System.out.println("O ponto digitado eh: " + p2.imprimir_ponto());

        p3 = p3.soma_pontos(p1, p2);
        System.out.println("|V1| A soma de "+p1.imprimir_ponto()+" com "+p2.imprimir_ponto()+" eh " +p3.imprimir_ponto() );

        p3.soma_pontos2(p1, p2, p3);
        System.out.println("|V2| A soma de "+p1.imprimir_ponto()+" com "+p2.imprimir_ponto()+" eh " +p3.imprimir_ponto() );

        Integer area = Ponto.calc_area(p1, p2);
        System.out.println("A área do retângulo definido por "+p1.imprimir_ponto()+ " e "+ p2.imprimir_ponto()+" eh: "+area);

        System.out.println("Digite um ponto: ");
        String res = sc.next();
        String[] val = res.split(",");
        p1.setX(Integer.parseInt(val[0]));
        p1.setY(Integer.parseInt(val[1]));

        System.out.println("Digite a constante: ");
        int c = sc.nextInt();
        
        System.out.print("Resultado: "+p1.imprimir_ponto()+" * " + c + " = ");
        p1.mult(c);
        System.out.println(p1.imprimir_ponto());

        System.out.print(p1.imprimir_ponto());
        p1.inc_dir('l');
        System.out.println("leste =>: " + p1.imprimir_ponto());

        System.out.print(p1.imprimir_ponto());
        p1.inc_dir('N');
        System.out.println("norte => " + p1.imprimir_ponto());

        System.out.print(p1.imprimir_ponto());
        p1.inc_diag("sudeste");
        System.out.println("sudeste => " + p1.imprimir_ponto());

        System.out.print(p1.imprimir_ponto());
        p1.inc_diag("sudoeste");
        System.out.println("sudoeste => " + p1.imprimir_ponto());
    
        List<Ponto> lista = new ArrayList<Ponto>();
        
        System.out.println("Quantos pontos deseja adicionar? ");
        c = sc.nextInt();
        int i = 1;
        while(i<=c){
            System.out.println("Digite o " + i +" ponto: ");
            res = sc.next();
            val = res.split(",");
            Ponto p = new Ponto();
            p.setX(Integer.parseInt(val[0]));
            p.setY(Integer.parseInt(val[1]));
            lista.add(p);
            i++;
        }
        System.out.println("Pontos: ");
        lista.forEach(System.out::println);
        Ponto norte = new Ponto(0, 0);
        Ponto sul = new Ponto(lista.get(0).getY(), lista.get(0).getY());
        Ponto leste = new Ponto(0, 0);
        Ponto oeste = new Ponto(lista.get(0).getX(), lista.get(0).getY());

        for(Ponto p:lista){
            if(p.getX()>leste.getX()){
                leste.setX(p.getX());
                leste.setY(p.getY());
            }if(p.getY()>norte.getY()){
                norte.setX(p.getX());
                norte.setY(p.getY());
            }if(p.getY()<sul.getY()){
                sul.setX(p.getX());
                sul.setY(p.getY());
            }if(p.getX()<oeste.getX()){
                oeste.setX(p.getX());
                oeste.setY(p.getY());
            }
        }

        System.out.println("O ponto mais ao norte é " +norte.imprimir_ponto());
        System.out.println("O ponto mais ao sul é " +sul.imprimir_ponto());
        System.out.println("O ponto mais ao leste é " +leste.imprimir_ponto());
        System.out.println("O ponto mais ao oeste é " +oeste.imprimir_ponto());

    }
}
