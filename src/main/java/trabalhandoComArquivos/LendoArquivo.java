package trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo {
    public static void main(String [] args){

        File file = new File("c:\\users\\ander\\desktop\\txt.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }



        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            if(sc != null){ sc.close();}
        }

    }
}
