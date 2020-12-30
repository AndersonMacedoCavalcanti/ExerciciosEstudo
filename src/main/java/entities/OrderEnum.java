package entities;

import java.util.Date;
import entities.Enum.*;

public class OrderEnum {

    private Integer id;
    private Date moment;
    private OrdenService status;

    public OrderEnum(){}

    public OrderEnum(Integer id, Date moment, OrdenService status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdenService getStatus() {
        return status;
    }

    public void setStatus(OrdenService status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderEnum{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
