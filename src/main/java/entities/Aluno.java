package entities;

public class Aluno {

	public String name;
	public double nota1, nota2, nota3;
	public double media;

	public double mediaFinal() {
		return media = nota1+nota2+nota3;
	}

	public String toString() {
		return "FINAL GRADE = " +String.format("%.2f",media);
	}
	
	public String valida() {
		return (media < 60) ? "FAILED\nMISSING "+String.format("%.2f", (60-media))+" POINTS" : "PASS";

	}

}
