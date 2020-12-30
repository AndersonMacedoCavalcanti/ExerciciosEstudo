package entities;

import java.util.Date;

public class MainEnum {
    public static void main(String [] args){

        OrderEnum order = new OrderEnum(1080,new Date(), Enum.OrdenService.PENDEING_PAYMENT);

        System.out.println(order.toString());

        Enum.OrdenService os1 = Enum.OrdenService.valueOf("DELIVERED");

        Enum.OrdenService os2 = Enum.OrdenService.DELIVERED;

        System.out.println(os1);
        System.out.println(os2);



    }
}
