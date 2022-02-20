package model;

// it is bar menu, not program application

import javax.persistence.*;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    @Column(name = "menu_id")
    private int menuId;
    private float price;

    @ManyToOne
    @JoinColumn(name = "Cocktail_name",referencedColumnName="name")
    private Cocktail cocktail;


    public Menu(int menuId, float price) {
        this.menuId = menuId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", price=" + price +
                '}';
    }

    public Menu() {
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
