package model;

import javax.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    private int amount;


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }

    public Orders() {
    }

    public Orders(int orderId, int amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
