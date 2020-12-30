package entities;

public class ExercicioVectAluguel {

	public String name;
	public String email;
	public int quantQuartos = 10;

	public ExercicioVectAluguel(String name, String email) {
		this.name = name;
		this.email = email;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return name + ", " + email;
		}

	
}
