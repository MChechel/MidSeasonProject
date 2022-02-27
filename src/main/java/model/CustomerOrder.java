package model;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    @Column(name="customer_order_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String dateOfRegister;

    public String getDateOfRegister() {
        return dateOfRegister;
    }

    public void setDateOfRegister() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        this.dateOfRegister = formatter.format((date));
    }

    public CustomerOrder(int id) {
        this.id = id;
    }

    public CustomerOrder(Customer customer) {
        this.customer = customer;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        this.dateOfRegister = formatter.format((date));

    }
}
