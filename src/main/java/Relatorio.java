import entities.Employee;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Relatorio {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> vectFunc = new ArrayList<>();

		System.out.print("How many employees will be registered?: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			Employee funcionario = new Employee(id, name, salary);
			vectFunc.add(funcionario);

		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id2 = sc.nextInt();

		if (position(vectFunc, id2) == null) {
			System.out.println("This id does not exist!");
		} else {

			System.out.print("the percentage: ");
			double percentage = sc.nextDouble();
			vectFunc.get(position(vectFunc, id2)).increaseSalary(percentage);;

			System.out.println("\nList of employee:");
			for (Employee obj : vectFunc) {
				System.out.println(obj);
			}
		}

		sc.close();
	}

	public static Integer position(List<Employee> vectFunc, int id) {
		for (int i = 0; i < vectFunc.size(); i++) {
			if (vectFunc.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
