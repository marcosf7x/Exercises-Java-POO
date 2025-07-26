package exercicios.basico;

public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;

    public Conta(int numero, String dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
    }

    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public static void main(String[] args) {
        Conta co = new Conta (1234, "Nickerson", 100.00, 1000.00);
        co.sacar(80.00);
        System.out.println("Novo saldo: " + co.saldo);
    }

}
