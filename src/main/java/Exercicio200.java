import java.util.Scanner;
import java.util.Locale;
import entities.Funcionario;

public class Exercicio200 {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario dadosF = new Funcionario();
		
		System.out.print("Name: ");
		dadosF.name=sc.nextLine();
		System.out.print("Gross salary: ");
		dadosF.grossSalary=sc.nextDouble();
		System.out.print("Tax: ");
		dadosF.tax=sc.nextDouble();
		dadosF.netSalary();

		System.out.println("Employee: "+dadosF.toString());
		System.out.print("Wich percentage to increase salary? ");
		double percent = sc.nextDouble();
		dadosF.increaseSalary(percent,dadosF.grossSalary);
		System.out.println("Update data: "+dadosF);

		sc.close();
	
	}

}
