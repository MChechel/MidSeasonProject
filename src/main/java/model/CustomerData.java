package model;

import javax.persistence.*;

@Entity
public class CustomerData {
    @Id
    private int id;


    @MapsId
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name="data_id")
    private PersonalData personalData;


}
