package classesEMetodosAbstratos.MetodosAbstratos.Exercicio.entities;

public class PessoaFisica extends Pessoa{

    private Double gastosSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }


    @Override
    public double calcularImposto() {

        double taxa = 0;

        if(getRendaAnual()<20000.00) {
            taxa = (getRendaAnual() * 15) / 100;

        }else if(getRendaAnual()>=20000.00){
            taxa =  (getRendaAnual()*25)/100;
        }
        taxa-=(getGastosSaude()*50/100);

        if(taxa < 0.0){
            taxa = 0;
        }

        return taxa;
    }
}
