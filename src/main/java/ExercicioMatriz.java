import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de linhas");
        int lin = sc.nextInt();
        System.out.println("Digite o numero de colunas");
        int colun = sc.nextInt();

        int matriz[][] = new int[lin][colun];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < colun; j++) {
                matriz[i][j] = sc.nextInt();

            }
        }

        System.out.println("Digite um numero contido a matriz");
        int x = sc.nextInt();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == x) {
                    System.out.println("position linha: " + i + ", colun: " + j);
                    if (j>0) {
                        System.out.println("left: "+matriz[i][j-1]);
                    }
                    if (i>0) {
                        System.out.println("up: "+matriz[i-1][j]);
                    }
                    if (j<matriz[i].length-1) {
                        System.out.println("right: "+matriz[i][j+1]);
                    }
                    if (i<matriz.length-1) {
                        System.out.println("Dow :"+matriz[i+1][j]);
                    }
                }


            }
        }


    }
}
