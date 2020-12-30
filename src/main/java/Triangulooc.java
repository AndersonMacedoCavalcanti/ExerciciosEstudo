import java.util.Scanner;
import java.util.Locale;
import entities.Triangulo;

public class Triangulooc {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		double areaX,areaY;
		String maiorArea;
		
		System.out.println("Enter he measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter he measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		areaX = x.area();
		areaY = y.area();
		
		maiorArea = (areaX > areaY) ? "X" : "Y";

		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		System.out.println("Large area: " + maiorArea);
		sc.close();
	}

}
