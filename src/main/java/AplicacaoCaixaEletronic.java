import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class AplicacaoCaixaEletronic {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char opcao = sc.next().charAt(0);

		ContaBancaria conta = new ContaBancaria(numero, nome);

		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			conta.depositarDinheiro(sc.nextDouble());
		}
		
		System.out.println("\nAccount data: \n"+conta.toString());
		System.out.print("\nEnter a deposit value: ");
		conta.depositarDinheiro(sc.nextDouble());
		System.out.println("Updated account data: \n"+conta.toString());
		System.out.print("\nEnter a withfraw value: ");
		conta.sacarDinheiro(sc.nextDouble());
		System.out.println("Updated account data: \n"+conta.toString());
		
		sc.close();

	}

}
