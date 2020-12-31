package aulaInterfaces.Exercicio.service;

public interface ServicoPagamentoInterface {

    public double taxaPagamento(Double valor);
    public double juros(Double valor, int Nmeses);


}
