package polimorfismoEHerança;

import polimorfismoEHerança.entities.ImportedProduct;
import polimorfismoEHerança.entities.Product;
import polimorfismoEHerança.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AplicationExercice {

    public static void main(String [] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for(int i = 0; i < numberProducts; i++){
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("Common, user or imported (c/u/i): ");
            sc.nextLine();
            String type = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();


            if(type.equals("c")) {
               list.add(new Product(name,price));

            }else if(type.equals("u")){

                System.out.print("Manufatured date (DD/MM/YYYY): ");
                sc.nextLine();
                String dataProduto = sc.nextLine();
                list.add(new UsedProduct(name,price,(new SimpleDateFormat("dd/MM/yyyy").parse(dataProduto))));

            }else if(type.equals("i")){

                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
               list.add(new ImportedProduct(name,price,customsFee));
            }
        }

        for(Product prod : list){
            System.out.println(prod.priceTag());
        }







    }

}
