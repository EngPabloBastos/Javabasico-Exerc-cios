package SistemaPagamento;

public class Pix implements FormaPagamento {
    public double calculartaxa(double valor) {
        return 0;
    }
    public void processar(double valor){
            double total = valor + calculartaxa(valor);
            System.out.println("Pago via PIX. Total: "+ total);
    }
}
