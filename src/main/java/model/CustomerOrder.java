package model;

import javax.persistence.*;

@Entity
public class CustomerOrder {

    @Id
    private int id1;


    @MapsId
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String date;



}
