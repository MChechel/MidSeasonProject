package model;

import org.hibernate.mapping.PrimaryKey;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints= @UniqueConstraint(columnNames = {"bartender_id", "data_id"}) )
public class BartenderData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment

    @Column(name="bartender_data_id")
    private int id;


    @OneToOne
    @JoinColumn(name = "bartender_id",nullable = false)
    private Bartender bartender;

    @ManyToOne
    @JoinColumn(name="data_id",nullable=false)
    private PersonalData personalData;

    public BartenderData() {

    }
    public BartenderData(Bartender bartender, PersonalData personalData) {
        this.bartender = bartender;
        this.personalData = personalData;
    }

    public Bartender getBartender() {
        return bartender;
    }

    public void setBartender(Bartender bartender) {
        this.bartender = bartender;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return "BartenderData{" +
                "bartender=" + bartender +
                ", personalData=" + personalData +
                '}';
    }
}
