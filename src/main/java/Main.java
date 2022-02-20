import menu.BarTenderMenu;
import menu.PersonalDataMenu;
import model.*;
import persistence.RepositoryBarTender;


public class Main {
    public static void main(String[] args) {
        System.out.println("Let's run the program!");
//        BarInventory barInventory = new BarInventory();
//        Bartender bt = new Bartender("Mike");
//        Bartender bt1 = new Bartender("Gl");
//        Bartender bt2 = new Bartender("Artur");
//        System.out.println(bt);
//        System.out.println(bt1);

//        RepositoryBarTender RepositoryBarTender = new RepositoryBarTender();
//        RepositoryBarTender.saveBartender(bt);
//        RepositoryBarTender.saveBartender(bt1);
//        RepositoryBarTender.saveBartender(bt2);

//        BarTenderMenu barTenderMenu = new BarTenderMenu();
//        barTenderMenu.menuOption();

        PersonalDataMenu pdm = new PersonalDataMenu();
        pdm.menuOption();

        System.out.println("Let's run the program!");

    }
}
