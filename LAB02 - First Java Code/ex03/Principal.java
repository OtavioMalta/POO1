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
    
    }
}
