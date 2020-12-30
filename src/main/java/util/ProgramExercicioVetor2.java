package util;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductVetor2;

public class ProgramExercicioVetor2 {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ProductVetor2[] vect = new ProductVetor2[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetor2(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;

		System.out.printf("AVERAGE PRICE = %.2f\n", avg);
		
		sc.close();

	}

}
