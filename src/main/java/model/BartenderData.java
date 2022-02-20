package model;

import javax.persistence.*;

@Entity

public class BartenderData {
    @Id
    private int id;


    @MapsId
    @OneToOne
    @JoinColumn(name = "bartender_id")
    private Bartender bartender;

    @OneToOne
    @JoinColumn(name="data_id")
    private PersonalData personalData;

}
