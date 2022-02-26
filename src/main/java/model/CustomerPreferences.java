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

    @OneToOne
    @JoinColumn(name = "Cocktail_name",referencedColumnName="name")
    private Cocktail cocktail;
    @OneToOne
    @JoinColumn(name = "Ingredient_name",referencedColumnName="name")
    private Ingredient ingredient;
}
