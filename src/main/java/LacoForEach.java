
public class LacoForEach {
	
	public static void main(String args[]) {
		
		String[] vect = new String[] {"Maria","bob","alex"};
		
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		
		for (String obj : vect) { // for eacht (tipo, apelido, cole��o) para cada objeto 'obj contido dentro de vect fa�a'
			System.out.println(obj);
		}
		
	}
}
