package trabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class InformacoesDoCaminhoDoArquivo {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path");
        String strPath = sc.nextLine();

        File file = new File(strPath);

        System.out.println("getName: "+file.getName());
        System.out.println("getParent: "+file.getParent());
        System.out.println("getPath: "+file.getPath());


        sc.close();
    }

}
