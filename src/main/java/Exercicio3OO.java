import java.util.Scanner;
import java.util.Locale;
import entities.Aluno;

public class Exercicio3OO {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno resultado  = new Aluno();
		
		resultado.name=sc.nextLine();
		resultado.nota1=sc.nextDouble();
		resultado.nota2=sc.nextDouble();
		resultado.nota3=sc.nextDouble();
		resultado.mediaFinal();
		System.out.println(resultado.toString());
		System.out.println(resultado.valida());
		
		
		sc.close();
		
	
	
	}

}
