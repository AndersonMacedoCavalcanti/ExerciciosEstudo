package entities;

public class ContaBancaria {

	private int numConta;
	private String nomeTitular;
	private double saldoConta;
	private static double taxa = 5.00;

	public ContaBancaria(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public void depositarDinheiro(double valor) {
		saldoConta += valor;
	}

	public void sacarDinheiro(double valor) {
		saldoConta = saldoConta - taxa - valor;
	}

	public String toString() {
		return "Account " + numConta + ", Holder: " + nomeTitular + ", Balance: " + String.format("%.2f", saldoConta);
	}
}
