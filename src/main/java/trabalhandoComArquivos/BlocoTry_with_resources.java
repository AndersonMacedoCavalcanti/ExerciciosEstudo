package trabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTry_with_resources {

    public static void main(String [] args) {
        String path = "c:\\users\\ander\\desktop\\txt.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (
                IOException e) {
            e.printStackTrace();

        }

    }
}
