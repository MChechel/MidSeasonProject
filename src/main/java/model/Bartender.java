package model;


import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
public class Bartender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    @Column(name = "bartender_id")
    private int bartenderId;
    private String name;
    private String dateOfRegister;

    public String getDateOfRegister() {
        return dateOfRegister;
    }
    public void setDateOfRegister() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
         this.dateOfRegister = formatter.format((date));
    }
    public Bartender(String name) {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        Pattern pattern = Pattern.compile("[a-zA-Z]{3,26}");
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            this.name = name;
        }
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

    public Bartender(int bartenderId) {
        this.bartenderId = bartenderId;
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
