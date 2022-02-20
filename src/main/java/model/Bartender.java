package model;


import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Bartender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    @Column(name = "bartender_id")
    private int bartenderId;
    private String name;
    private String dateOfRegister;

    public Bartender(String name) {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        this.name = name;
        this.dateOfRegister = formatter.format((date));
    }


    public String getDateOfRegister() {
        return dateOfRegister;
    }

    public void setDateOfRegister() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
         this.dateOfRegister = formatter.format((date));
    }

    @Override
    public String toString() {
        return "Bartender{" +
                "bartenderId=" + bartenderId +
                ", name='" + name + '\'' +
                ", dateOfRegister='" + dateOfRegister + '\'' +
                '}';
    }

    public Bartender() {
    }

    public int getBartenderId() {
        return bartenderId;
    }

    public void setBartenderId(int bartenderId) {
        this.bartenderId = bartenderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
