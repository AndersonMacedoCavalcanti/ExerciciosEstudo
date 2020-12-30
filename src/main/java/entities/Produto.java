package entities;

public class Produto {

	String name;
	private double price;
	private int quantity;

//<<<<<<<<<<<<<<<<<<<<<<<<METODO CONSTRUTOR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<FIM DO METODO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//>>>>>>>>>>>>>>>>>>>>>>>>CONSTRUTOR SOBRECARGA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>FIM DA SOBRECARGA<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return quantity * price;
	}

	
	public int addProducts(int qt) {
		return quantity += qt;
	}

	public int removeProducts(int qtR) {
		return quantity -= qtR;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
