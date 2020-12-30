package entities;

public class Retangulo {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double diagonal() {
		// NÃO PRECISAVA USAR O POW, PODIA TER FEITO WIDTH*2+HEIGHT*2
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}

	public double perimeter() {
		return 2 * (width + height);
	}

}
