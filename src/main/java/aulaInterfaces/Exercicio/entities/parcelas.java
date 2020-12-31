package aulaInterfaces.Exercicio.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class parcelas {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataVencimento;
    private Double valor;

    public parcelas(Date dataVencimento, Double valor) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String toString(){
        return simpleDateFormat.format(getDataVencimento())+ " - "+ String.format("%.2f", getValor())+"\n";
    }


}
