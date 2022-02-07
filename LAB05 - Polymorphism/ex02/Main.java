public class Main {
    public static void main(String[] args) {
        Funcionario Funcionarios[] = new Funcionario[2];
        Funcionarios[0] = new Atendente("Alberto Silva", "123.123.123-33", "12.123.123-12", 28, 123);
        Funcionarios[1] = new Piloto("Carlos Pereira", "678.678.678.67", "67.678.678-67", 35, 678, 60);

        for(Funcionario p : Funcionarios){
            System.out.println(p.calculaSalario()); 
        }
    }
}
