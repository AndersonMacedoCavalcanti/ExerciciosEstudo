package entities;

public class Funcionario {

	public String name; 
	public double grossSalary;
	public double tax;
	public double aux;

	public void increaseSalary(double percentage, double salary) {
		 aux+=(percentage*=salary/100);
	}
	
	
	public double netSalary() {
		return aux = grossSalary-tax;
	}
	

	public String toString() {
		return name+", $ "+String.format("%.2f",aux );
	}
}
