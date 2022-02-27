package model;

import javax.persistence.*;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_details_id")
    private int orderDetailsId;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private CustomerOrder customerOrder;


    public OrderDetails(CustomerOrder customerOrder,Orders orders) {
        this.orders = orders;
        this.customerOrder = customerOrder;
    }

    public OrderDetails() {

    }
}
