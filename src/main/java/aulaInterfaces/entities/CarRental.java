package aulaInterfaces.entities;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

public class CarRental {


    private Date start;
    private Date finish;

    private Vehicle vehicle;
    private Invoid invoid;

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoid getInvoid() {
        return invoid;
    }

    public void setInvoid(Invoid invoid) {
        this.invoid = invoid;
    }
}
