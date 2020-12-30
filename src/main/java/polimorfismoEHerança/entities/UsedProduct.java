package polimorfismoEHerança.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(", $");
        sb.append(String.format("%.2f",getPrice()));
        sb.append(" (Manufacture date: ");
        sb.append(simpleDateFormat.format(getManufactureDate()));
        sb.append(")");

        return sb.toString();
    }
}
