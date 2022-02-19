package model;

public class Ingredient {
    private int ingredientId;
    private String name;
    private float price;

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientId=" + ingredientId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Ingredient() {
    }

    public Ingredient(int ingredientId, String name, float price) {
        this.ingredientId = ingredientId;
        this.name = name;
        this.price = price;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
