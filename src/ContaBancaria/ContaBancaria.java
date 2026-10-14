package ContaBancaria;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    public void sacar (double valorSaque){
        if (valorSaque > saldo){
            System.out.println("Erro. O valor do saque é maior que o do depósito.");
            System.out.println("Saldo: " + saldo);
        }
        else{
            saldo -= valorSaque;
            System.out.println("Valor do saque: "+ valorSaque);
            System.out.println("Saldo restante: "+ saldo);
        }
    }
    public double getSaldo(){
        return saldo;
    }
}
