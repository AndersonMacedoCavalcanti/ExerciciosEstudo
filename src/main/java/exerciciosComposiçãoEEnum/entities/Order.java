package exerciciosComposiçãoEEnum.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatusExercice status;

    private Client client;
    private List<OrderItem> listItens = new ArrayList<OrderItem>();


    public Order(){

    }

    public Order(Date moment, OrderStatusExercice status,Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusExercice getStatus() {
        return status;
    }

    public void setStatus(OrderStatusExercice status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        listItens.add(item);
    }

    public void removeItem(OrderItem item){
        listItens.remove(item);
    }

    public double total(){
        double sum = 0.00;
        for(OrderItem price : listItens){
            sum += price.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append(client).append("\n");
        sb.append("Order items:\n");
        for(OrderItem it : listItens){
            sb.append(it).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f",total()));
        return sb.toString();
    }
}
