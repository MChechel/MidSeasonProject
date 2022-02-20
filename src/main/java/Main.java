import model.*;
import persistence.RepositoryBarInventory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's run the program!");
        BarInventory barInventory = new BarInventory();
        Bartender bt = new Bartender();
        Cocktail cocktail = new Cocktail();
        Customer cust = new Customer();
        Ingredient ing = new Ingredient();
        Menu menu = new Menu();
        Orders orders = new Orders();
        PersonalData pd = new PersonalData();
        CustomerPreferences cp = new CustomerPreferences();
        RepositoryBarInventory rbi = new RepositoryBarInventory();

        System.out.println("Let's run the program!");

    }
}
