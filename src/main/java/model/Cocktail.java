package model;

import javax.persistence.*;

@Entity
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    @Column(name = "cocktail_id")
    private int cocktailId;
    private String name;
    private String description;
    private String additionalInfo;

    @Override
    public String toString() {
        return "Cocktail{" +
                "cocktailId=" + cocktailId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }

    public Cocktail() {
    }

    public int getCocktailId() {
        return cocktailId;
    }

    public void setCocktailId(int cocktailId) {
        this.cocktailId = cocktailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Cocktail(int cocktailId, String name, String description, String additionalInfo) {
        this.cocktailId = cocktailId;
        this.name = name;
        this.description = description;
        this.additionalInfo = additionalInfo;
    }
}
