import java.util.Scanner;

public class Matriz {

    public static void  main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numNegat = 0;
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j]<0){
                    numNegat+=1;
                }
            }
        }

        System.out.println(numNegat);

        sc.close();


    }
}