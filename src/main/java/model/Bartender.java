package model;


import javax.persistence.*;

@Entity
public class Bartender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    @Column(name = "bartender_id")
    private int bartenderId;
    private String name;

    @Override
    public String toString() {
        return "Bartender{" +
                "bartenderId=" + bartenderId +
                ", name='" + name + '\'' +
                '}';
    }

    public Bartender(int bartenderId, String name) {
        this.bartenderId = bartenderId;
        this.name = name;
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
