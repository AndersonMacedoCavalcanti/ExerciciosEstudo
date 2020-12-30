package util;

import entities.ExercicioVectAluguel;
import java.util.Scanner;
import java.util.Locale;

public class ExercicioVectProgram {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		ExercicioVectAluguel[] vect = new ExercicioVectAluguel[10];
		int[] vectn = new int[n];

		if (n > 10) {
			System.out.printf("Não possuimos esta quantidade de quartos vagos, digite um numero menor");
		} else {

			for (int i = 0; i < n; i++) {
				System.out.println();
				System.out.println("Rent #" + (i + 1));
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("E-mail: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt() - 1;
				vect[room] = new ExercicioVectAluguel(name, email);
				vectn[i] = room;
			}

			int aux;
			for (int i = 0; i < vectn.length - 1; i++) {
				for (int j = i + 1; j < vectn.length; j++) {
					if (vectn[j] < vectn[i]) {
						aux = vectn[j];
						vectn[j] = vectn[i];
						vectn[i] = aux;
					}
				}
			}

			for (int i = 0; i < vectn.length; i++) {
				System.out.println("\n"+(vectn[i] + 1) + ": " + vect[vectn[i]]);
			}
		}
		sc.close();
	}

}
