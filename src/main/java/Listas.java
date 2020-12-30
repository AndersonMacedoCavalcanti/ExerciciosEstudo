import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String args[]) {

		List<String> list = new ArrayList<>();

		list.add("Maria"); // INSERINDO VALORES
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add("Raquel");
		list.add("Silvania");

		list.add(2, "Carla"); // INSERINDO VALORES EM POSIÇÕES

		System.out.println(list.size()); // TAMANHO DA LISTA

		list.remove("Raquel"); // REMOVER ITEM

		list.removeIf(x -> x.charAt(0) == 'M'); // REMOVER COM PREDICADO

		System.out.println("Ana esta no endereço: " + list.indexOf("Ana"));// MOSTRAR o Local

		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String obj : result) {
			System.out.println(obj);
		}

		System.out.println("---------------------------------");
		String name = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);
		
	}
}

// TAMANHO DA LISTA: SIZE()
// INSERIR: ADD(OBJ), ADD(INT, OBJ)
// REMOVER: REMOVE(OBJ), REMOVE(INT), REMOVEIF(PREDICATE)
// ENCONTRAR: INDEXOF(OBJ), LASTINEXOF(OBJ)
// FILTRAR COM BASE NO PREDICADO: LIST<INTEGER> RESULT = LIST.STREAM().FILTER(X-> X> 4).COLLECT(COLLECTORS.TOLIST())
// ENCONTRAR PRIMEIRA OCORRENCIA: INTEGER RESULT = LIST.STREAM().FILTER()X -> X > 4).FINDFIRST().ORELSE(NULL);
