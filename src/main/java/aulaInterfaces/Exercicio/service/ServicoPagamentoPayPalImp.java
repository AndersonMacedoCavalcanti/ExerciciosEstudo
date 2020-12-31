package aulaInterfaces.Exercicio.service;

public class ServicoPagamentoPayPalImp implements ServicoPagamentoInterface{

    private static final double taxaPagamento = 0.02;
    private static final double taxaJurosSimples = 0.01;

    @Override
    public double taxaPagamento(Double valor) {
        return valor * taxaPagamento;
    }


    @Override
    public double juros(Double valor, int Nmeses) {
       return valor * Nmeses * taxaJurosSimples;
    }
}
