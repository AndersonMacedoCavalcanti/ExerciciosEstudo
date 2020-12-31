package aulaInterfaces.services;

import aulaInterfaces.entities.CarRental;
import aulaInterfaces.entities.Invoid;

public class RentalServices {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService TaxService;

    public RentalServices(Double pricePerDay, Double pricePerHour, TaxService TaxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.TaxService = TaxService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double)(t2-t1)/1000/60/60;

        double basicPayment;
        if(hours <= 12.0){
            basicPayment = Math.ceil(hours) * pricePerHour;
        }

        else{
            basicPayment = Math.ceil(hours/24) * pricePerDay;
        }

        double tax = TaxService.tax(basicPayment);

        carRental.setInvoid(new Invoid(basicPayment,tax));
    }




    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public TaxService getTaxService() {
        return (TaxService) TaxService;
    }

    public void setTaxService(TaxService TaxService) {
        this.TaxService = TaxService;
    }
}
