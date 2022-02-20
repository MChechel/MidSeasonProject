import model.*;
import persistence.RepositoryBarTender;


public class Main {
    public static void main(String[] args) {
        System.out.println("Let's run the program!");
        BarInventory barInventory = new BarInventory();
        Bartender bt = new Bartender("Mike");
        Bartender bt1 = new Bartender("Gleb");
        Bartender bt2 = new Bartender("Artur");
        System.out.println(bt);

        RepositoryBarTender RepositoryBarTender = new RepositoryBarTender();
        RepositoryBarTender.saveBartender(bt);
        RepositoryBarTender.saveBartender(bt1);
        RepositoryBarTender.saveBartender(bt2);

        System.out.println("Let's run the program!");

    }
}
