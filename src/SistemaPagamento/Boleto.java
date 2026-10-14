package SistemaPagamento;

public class Boleto implements FormaPagamento {
    public double calculartaxa(double valor){
        return 2.50;
    }

    public void processar(double valor) {
        double total = valor + calculartaxa(valor);
        System.out.println("Pago via Boleto. Total" + total);
    }
}
