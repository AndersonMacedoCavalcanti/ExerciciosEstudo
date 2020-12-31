package aulaInterfaces.Exercicio.entities;

import aulaInterfaces.Exercicio.service.ServicoPagamentoInterface;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Integer numeroContrato;
    private Date dataContrato;
    private Double valorTotalContrato;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private ServicoPagamentoInterface servicoPagamentoInterface;

    List<parcelas> list = new ArrayList<>();


    public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotalContrato) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotalContrato = valorTotalContrato;
        this.servicoPagamentoInterface = servicoPagamentoInterface;
    }


    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotalContrato() {
        return valorTotalContrato;
    }

    public void setValorTotalContrato(Double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }


    public List<parcelas> getList() {
        return list;
    }


}
