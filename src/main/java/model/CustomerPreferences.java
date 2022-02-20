package model;

import javax.persistence.*;

@Entity
public class CustomerPreferences {

    @Id
    private int id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

//    @Id
//    private Long id;
//
//    private byte[] file;
//
//    @OneToOne
//    @JoinColumn(name = "id")
//    @MapsId

    @OneToOne
    @JoinColumn(name = "Cocktail_name",referencedColumnName="name")
    private Cocktail cocktail;
    @OneToOne
    @JoinColumn(name = "Ingredient_name",referencedColumnName="name")
    private Ingredient ingredient;
}
