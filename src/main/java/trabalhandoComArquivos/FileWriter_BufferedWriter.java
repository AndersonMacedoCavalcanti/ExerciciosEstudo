package trabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {
    public static void main(String [] args){


        String[] lines = new String[] {"hi"};

        String path = "c:\\users\\ander\\desktop\\out.txt";
                                                 //true é para não subscrever o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
