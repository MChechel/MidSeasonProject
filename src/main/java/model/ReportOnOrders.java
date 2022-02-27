package model;

public class ReportOnOrders {
    private int orderId;
    private String CustomerName;
    private String CocktailName;
    private float price;
    @Override
    public String toString() {
        return "ReportOnOrders{" +
                "orderId=" + orderId +
                ", CustomerName='" + CustomerName + '\'' +
                ", CocktailName='" + CocktailName + '\'' +
                ", price=" + price +
                '}';
    }

    public ReportOnOrders() {
    }

    public ReportOnOrders(int orderId, String customerName, String cocktailName, float price) {
        this.orderId = orderId;
        CustomerName = customerName;
        CocktailName = cocktailName;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCocktailName() {
        return CocktailName;
    }

    public void setCocktailName(String cocktailName) {
        CocktailName = cocktailName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
