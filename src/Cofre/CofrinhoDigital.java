package Cofre;

public class CofrinhoDigital {
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public double quebrar() {
        double valorGuardado = saldo;
        saldo = 0;
        return valorGuardado;
    }

    public double getSaldo(){
        return saldo;
    }
}
