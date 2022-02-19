package model;

// it is bar menu, not program application
public class Menu {
    private int menuId;
    private float price;

    public Menu(int menuId, float price) {
        this.menuId = menuId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", price=" + price +
                '}';
    }

    public Menu() {
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
