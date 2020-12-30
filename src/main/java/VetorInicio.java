import java.util.Scanner;
import java.util.Locale;

import static java.lang.System.*;

public class VetorInicio {

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        out.println("Digite o numero de inser�oes que ira fazer");
        int num = sc.nextInt();
        double[] vect = new double[num];
        for (int i = 0; i < num; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double media = sum / vect.length;

        System.out.println(String.format("%.2f", media));

        sc.close();

    }

}
