package Banco;

public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setSaldo(1000);
        c1.setLimite(1000);

        double saldoAtual = c1.getSaldo();
        System.out.println("Saldo atual eh: " + saldoAtual);
        double limiteConta = c1.getLimite();
        System.out.println("Limite eh: " + limiteConta);

        //V1
        Conta c2 = new Conta();
        c2.setLimite(300);
        c2.depositar(500);
        c2.sacar(200);
        System.out.println("O saldo eh " + c2.getSaldo());
    }
}
