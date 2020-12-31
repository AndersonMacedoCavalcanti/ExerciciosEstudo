package aulaInterfaces.Exercicio.service;

import aulaInterfaces.Exercicio.entities.Contrato;
import aulaInterfaces.Exercicio.entities.parcelas;

import java.util.Calendar;
import java.util.Date;

public class ProcessamentoContrato {

    private ServicoPagamentoInterface spi;

    public ProcessamentoContrato(ServicoPagamentoInterface spi) {
        this.spi = spi;
    }

    public void processeContract(Contrato contrato, int months){

        double parcelaBasica = contrato.getValorTotalContrato()/months;

        for(int i = 1; i <= months; i++){
            double jurosPorMeses = parcelaBasica + spi.juros(parcelaBasica, i );
            double totalTaxas = jurosPorMeses + spi.taxaPagamento(jurosPorMeses);
            System.out.println(totalTaxas);
            Date dueDate = addMonths(contrato.getDataContrato(), i );
            contrato.getList().add(new parcelas(dueDate,totalTaxas));
        }
    }


    private Date addMonths(Date data, int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.MONTH,n);
        return calendar.getTime();
    }


}
