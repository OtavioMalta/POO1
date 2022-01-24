import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Ponto 1: ");
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        Ponto p1 = new Ponto(x, y);

        System.out.println("Informe o Ponto 2: ");
        System.out.print("X: ");
        x = sc.nextDouble();
        System.out.print("Y: ");
        y = sc.nextDouble();
        Ponto p2 = new Ponto(x, y);

        Retangulo retangulo = new Retangulo(p1, p2);
        

        System.out.print("A area do retangulo eh");

        System.out.println(retangulo.area());
    }
}
