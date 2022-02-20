package model;

import javax.persistence.*;

@Entity
public class IngridientInvenroty {

    @Id
    private int id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "ingridient_id")
    private Ingredient ingredient;

    @OneToOne
    @JoinColumn(name = "inventory_id")
    private BarInventory barInventory;



}
