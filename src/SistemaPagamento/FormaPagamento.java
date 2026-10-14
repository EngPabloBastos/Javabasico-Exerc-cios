package SistemaPagamento;

public interface FormaPagamento {
    void processar(double valor);
    double calculartaxa(double valor);
}
