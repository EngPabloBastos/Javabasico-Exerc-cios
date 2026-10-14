package interface_exercicio;

public interface FormaPagamento {
    void processar(double valor);
    double CalcularTaxa(double valor);
}
