package aulaInterfaces;

import aulaInterfaces.entities.CarRental;
import aulaInterfaces.entities.Vehicle;
import aulaInterfaces.services.BrazilTaxService;
import aulaInterfaces.services.RentalServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String [] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data:");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = simpleDateFormat.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        Date finish = simpleDateFormat.parse(sc.nextLine());

        CarRental cr = new CarRental(start,finish,new Vehicle(carModel));

        System.out.print("Enter price per hor: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerDay,pricePerHour,new BrazilTaxService());

        rentalServices.processInvoice(cr);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: "+ String.format("%.2f",cr.getInvoid().getBasicPayment()));
        System.out.println("Tax: "+ String.format("%.2f",cr.getInvoid().getTax()));
        System.out.println("Total Payment: "+ String.format("%.2f",cr.getInvoid().getTotalPayment()));



        sc.close();






    }
}
