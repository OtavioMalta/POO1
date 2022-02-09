public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(3300, 1, 123, 2000);
        System.out.println(ce.debitaValor(3300, 123) + "Saldo: " + ce.getSaldo(123));
        System.out.println(ce.debitaValor(100, 123) + "Saldo: " + ce.getSaldo(123));

    }
}
