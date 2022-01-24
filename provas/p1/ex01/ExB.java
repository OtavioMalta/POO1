import java.util.ArrayList;
import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de ratangulos: ");
        ArrayList<Retangulo> lista = new ArrayList<Retangulo>();
        Ponto ponto1 = new Ponto(0,0);
        Ponto ponto2 = new Ponto(0,0);
        Retangulo maiorRetangulo = new Retangulo(ponto1,ponto2);
        int i = 0;
        int n = sc.nextInt();
        while(i < n){
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
            lista.add(retangulo);

            if(retangulo.area() > maiorRetangulo.area()){
                maiorRetangulo = retangulo;
            }
            i++;
        }
        System.out.println("Retangulos lidos: ");
        for(i = 0; i < n; i++){
            System.out.println(lista.get(i).print());
            
        }
        System.out.println("\n---------------------------\n");
        System.out.println("Maior Retangulo(Area= "+maiorRetangulo.area()+"): " + maiorRetangulo.print());
        

        
    }
}
