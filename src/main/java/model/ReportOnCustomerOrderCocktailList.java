package model;

public class ReportOnCustomerOrderCocktailList {
    private String cocktailName;
    private float price;
    private String customerName;

    public ReportOnCustomerOrderCocktailList(String cocktailName, float price, String customerName) {
        this.cocktailName = cocktailName;
        this.price = price;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "ReportOnCustomerOrderCocktailList{" +
                "Cocktail name is " + cocktailName + '\'' +
                ", price is " + price +
                " - ordered by " + customerName + '\'' +
                '}';
    }
}
