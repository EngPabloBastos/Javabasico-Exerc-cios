package SistemaPagamento;

public class CartaoCredito implements FormaPagamento{
    public double calculartaxa(double valor) {
        return valor * 0.03;
    }

    public void processar(double valor){
        double total = valor + calculartaxa(valor);
        System.out.println("Pago via Cartão de Crédito. Total: "+ total);
    }
}
