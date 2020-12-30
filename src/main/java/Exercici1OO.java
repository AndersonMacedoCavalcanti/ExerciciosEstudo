import java.util.Scanner;
import java.util.Locale;
import entities.Retangulo;

public class Exercici1OO {

	public static void main(String ar[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo dado = new Retangulo();

		System.out.print("Enter rectangle width and height: \n");
		dado.width = sc.nextDouble();
		dado.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n",dado.area());
		System.out.printf("PERIMETER = %.2f\n",dado.perimeter());
		System.out.printf("DIAGONAL = %.2f\n",dado.diagonal());

		sc.close();
	}
}
