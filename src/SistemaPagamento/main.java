package SistemaPagamento;

public class main {
    public static void main(String[] args){
        Pedido pedido1 = new Pedido(new Pix(), 100);
        Pedido pedido2 = new Pedido(new CartaoCredito(), 100);
        Pedido pedido3 = new Pedido(new Boleto(), 100);

        pedido1.finalizarpedido();
        pedido2.finalizarpedido();
        pedido3.finalizarpedido();

    }
}
