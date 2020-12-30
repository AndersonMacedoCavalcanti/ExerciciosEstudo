package entities;

public class OrdanaçãoAula {


    public static void insertSort(int vetor[]){
        int aux;
        int tam = vetor.length;
        int j;
        for(int i=1; i < tam; i++){
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && aux < vetor[j]){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

    }


    public static void selectionSort(int vetor[]){

        int aux = 0;
        for(int b = 0;b < vetor.length;b++) {
            for (int j = 1+b; j < vetor.length; j++) {
                if (vetor[j] < vetor[b]) {
                    aux = vetor[j];
                    vetor[j] = vetor[b];
                    vetor[b] = aux;
                }
            }
        }

        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+", ");
        }


    }


    public static void bubbleSort(int vetor[]){

        int aux=0;

        for(int j=0;j<vetor.length;j++) {
            for (int i = 1; i < vetor.length; i++) {
                aux = vetor[i - 1];
                if (vetor[i] < vetor[i - 1]) {
                    vetor[i - 1] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+", ");
        }

    }















}
