package classesEMetodosAbstratos.MetodosAbstratos.Exercicio.entities;

public class PessoaJuridica extends Pessoa {

    private Integer numerosFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numerosFuncionarios) {
        super(nome, rendaAnual);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public Integer getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    public void setNumerosFuncionarios(Integer numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }

    @Override
    public double calcularImposto() {
        double taxa = 0;

        if(getNumerosFuncionarios()>10) {
            taxa = (getRendaAnual()* 14) / 100;

        }else {
           taxa =  (getRendaAnual()*16)/100;
        }
        return taxa;
    }
}
