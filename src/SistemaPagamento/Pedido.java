package SistemaPagamento;

public class Pedido {
    private FormaPagamento formaPagamento;
    private double valor;

    public Pedido(FormaPagamento formaPagamento, double valor){
        this.formaPagamento = formaPagamento;
        this.valor = valor;
    }
    public void finalizarpedido(){
        formaPagamento.processar(valor);
    }
}
