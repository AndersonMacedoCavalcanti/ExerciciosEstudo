import java.util.Scanner;
import java.util.Locale;

public class Aula1ProblemaSemOO {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY, p;
		String maiorArea;
		System.out.println("Enter he measures of triangle X: ");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		System.out.println("Enter he measures of triangle Y: ");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double c2 = sc.nextDouble();

		p = (a1 + b1 + c1) / 2.0;
		areaX = Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));

		p = (a2 + b2 + c2) / 2.0;
		areaY = Math.sqrt(p * (p - a2) * (p - b2) * (p - c2));
		
		maiorArea=(areaX>areaY)?"X":"Y";
		
		System.out.printf("Triangle X area: %.4f\n",areaX);
		System.out.printf("Triangle Y area: %.4f\n",areaY);
		System.out.println("Large area: "+maiorArea);
		sc.close();
	}

}
