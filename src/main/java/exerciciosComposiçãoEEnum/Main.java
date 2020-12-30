package exerciciosComposiçãoEEnum;

import exerciciosComposiçãoEEnum.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        sc.close();

        Product p = new Product("TV",1000);
        OrderItem orderItem1 = new OrderItem(2,1000,p);

        Product p2 = new Product("TV",1000);
        OrderItem orderItem2 = new OrderItem(2,1000,p);

        Client client1 = new Client("Anderson Macedo Cavalcanti","Anderson@gmail.com", sdf.parse("02/08/1997"));

        Order order = new Order(new Date(), OrderStatusExercice.DELIVERED,client1);
        order.addItem(orderItem1);
        order.addItem(orderItem2);

        System.out.println(order);



    }

}
