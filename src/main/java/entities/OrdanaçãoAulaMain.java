package entities;


public class OrdanaçãoAulaMain {
    public static void main(String[] args) {

        int vetor[] = {9, 8, 2, 7, 5, 1, 3, 6, 4, 10};

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }

        System.out.println("");

        OrdanaçãoAula ord = new OrdanaçãoAula();


        OrdanaçãoAula.selectionSort(vetor);


    }
}