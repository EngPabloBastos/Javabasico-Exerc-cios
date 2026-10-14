package ContaBancaria;
import java.util.Scanner;
import java.util.Locale;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o valor do saldo: ");
        double saldo = sc.nextDouble();
        while (saldo <= 0){
            System.out.println("Erro. Valor do deposito não pode ser negativo. Tente novamente: ");
            saldo = sc.nextDouble();
        }
        conta.depositar(saldo);

        System.out.println("Saldo atual: R$"+ String.format(Locale.of("pt", "BR"), "%.2f", conta.getSaldo()));

        System.out.println("Digite o valor para saque: ");
        double saque = sc.nextDouble();
        while(saque > conta.getSaldo()){
            System.out.println("ERRO. Saque maior que o saldo, digite novamente: ");
            saque = sc.nextDouble();
        }
        conta.sacar(saque);

    }
}
