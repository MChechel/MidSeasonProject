package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class IngredientUpdateLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    private int id;
    private String name;
    private float currentPrice;
    private float oldPrice;
    private String dates;

    public IngredientUpdateLog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(float oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getDate() {
        return dates;
    }

    public void setDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        this.dates = formatter.format((date));
    }

    @Override
    public String toString() {
        return "IngredientUpdateLog{" +
                "name='" + name + '\'' +
                ", currentPrice=" + currentPrice +
                ", oldPrice=" + oldPrice +
                ", date='" + dates + '\'' +
                '}';
    }

    public IngredientUpdateLog(String name, float currentPrice, float oldPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.oldPrice = oldPrice;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        this.dates = formatter.format((date));
    }
}
