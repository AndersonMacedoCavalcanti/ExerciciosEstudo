package trabalhandoComArquivos;


import trabalhandoComArquivos.entities.Produtos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo");
        String strPath = sc.nextLine();

        List<Produtos> list = new ArrayList<>();
        File file = new File(strPath);

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(strPath));

            String item = bufferedReader.readLine();
            while(item != null){

                String[] arquivo = item.split(",");
                String nome = arquivo[0];
                double price = Double.parseDouble(arquivo[1]);
                int quantity = Integer.parseInt(arquivo[2]);
                list.add(new Produtos(nome,price,quantity));
                item = bufferedReader.readLine();
            }

        }catch (IOException exception){
            exception.printStackTrace();
        }

        System.out.println("\nDigite o nome do arquivo de saida: ");
        String novoNome = sc.next();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file.getParent()+"\\"+novoNome+".csv"))){

            for(Produtos item : list){
                bw.write(item.getName()+", "+String.format("%.2f",item.total()));
                bw.newLine();
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
