import java.util.Scanner;
import java.util.Locale;
import entities.Produto;


public class ApplicationMetodoConstrutoreSobrecargaeEncapsulamento {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		Double price = sc.nextDouble();

	
//<<<<<<<<<<<<<<<<<<<<METODO CRONTRUTOR, COLOCADO DEPOIS DA VARIAVEIS>>>>>>>>>>>>>>>>>
		Produto prod = new Produto(name, price);
//<<<<<<<<<<<<<<<<<<<<<FIM DO METODO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
	    prod.setName("Computer");
	    System.out.println("Update name: " + prod.getName());
	    prod.setPrice(1200.00);
	    System.out.println("Update price: "+ prod.getPrice());
		System.out.println("Product data: " + prod);
		System.out.print("Enter the number of product to be added in stock:");
		int qt = sc.nextInt();
		prod.addProducts(qt);
		System.out.println("Updated data: " + prod);

		System.out.print("Enter the number of product to be removed from stock:");
		int qtR = sc.nextInt();
		prod.removeProducts(qtR);
		System.out.println("Updated data: " + prod);

		sc.close();
	}

}
