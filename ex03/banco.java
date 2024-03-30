package ex03;

public class banco {
    int NumeroDaConta;
    String NomeDoTitular;
    private double SaldoDaConta;

    public banco(int NumeroDaConta, String NomeDoTitular, double SaldoDaConta) {
        this.NumeroDaConta = NumeroDaConta;
        this.NomeDoTitular = NomeDoTitular;
        this.SaldoDaConta = SaldoDaConta;
    }

    public void SaldoNaConta() {
        System.out.println("Saldo atual: " + SaldoDaConta);
    }

    public void DepositoNaConta(double deposito) {
        System.out.println("Informe o valor do depósito: " + deposito);
        SaldoDaConta += deposito;
        System.out.println("Seu saldo foi alterado para: " + SaldoDaConta);
    }

    public void SacarDaConta(double saque) {
        System.out.println("Informe o valor que deseja sacar: " + saque);
        if (saque > SaldoDaConta) {
            System.out.println("Saldo insuficiente.");
        } else {
            SaldoDaConta -= saque;
            System.out.println("O saldo foi alterado para: " + SaldoDaConta);
        }
    }
}
