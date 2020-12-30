package classesEMetodosAbstratos;

public class SavindsAccount extends Account {

    private Double interestRade;

    public SavindsAccount(){
        super();
    }

    public SavindsAccount(Integer number, String holder, double balance, Double interestRade) {
        super(number, holder, balance);
        this.interestRade = interestRade;
    }

    public Double getInterestRade() {
        return interestRade;
    }

    public void setInterestRade(Double interestRade) {
        this.interestRade = interestRade;
    }

    public void updateBalance(){
        balance += balance * interestRade;
    }

    @Override //Indica que o metodo da superclasse esta sendo sobreescrito por este metodo
    public void withdraw(double amount) {
        balance -= amount;
    }
}
