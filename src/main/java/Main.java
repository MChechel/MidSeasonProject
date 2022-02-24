import menu.BarTenderMenu;
import menu.PersonalDataMenu;
import model.*;
import org.hibernate.PersistentObjectException;
import persistence.RepositoryBarTender;
import persistence.RepositoryCustomer;
import persistence.RepositoryIngredient;
import persistence.RepositoryPersonalData;


public class Main {
    public static void main(String[] args) {
        System.out.println("Let's run the program!");
//        BarInventory barInventory = new BarInventory();
        Bartender bt = new Bartender("Mike");
        Bartender bt1 = new Bartender("Gl");
        Bartender bt2 = new Bartender("Artur");
//        System.out.println(bt);
//        System.out.println(bt1);

//        RepositoryBarTender RepositoryBarTender = new RepositoryBarTender();
//        RepositoryBarTender.saveBartender(bt);
//        RepositoryBarTender.saveBartender(bt1);
//        RepositoryBarTender.saveBartender(bt2);

//        BarTenderMenu barTenderMenu = new BarTenderMenu();
//        barTenderMenu.menuOption();

            // I will use menu after basic methods for each table is done
//        PersonalDataMenu pdm = new PersonalDataMenu();
//        pdm.menuOption();


//###########################        Bartender and personal data
//        RepositoryBarTender repositoryBarTender = new RepositoryBarTender();
//        repositoryBarTender.updateBartender(8,"Tolian");
//        //repositoryBarTender.deleteBartender(6);
//        PersonalData pd = new PersonalData("mixa_test1.@gmail.com","596650","www.zp.ua");
//        RepositoryPersonalData repositoryPersonalData = new RepositoryPersonalData();
//        repositoryPersonalData.updatePersonalData(2,pd);
//        repositoryPersonalData.deletePersonalData(3);

//        ######################### CUSTOMER and INGREDIENTS

//        Customer customer1 = new Customer("Mike");
//        Customer customer2 = new Customer("Tim");
//        RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
//        repositoryCustomer.saveCustomer(customer1);
//        repositoryCustomer.saveCustomer(customer2);
//        repositoryCustomer.saveCustomer(customer1);
//        repositoryCustomer.saveCustomer(customer2);
//        repositoryCustomer.updateCustomer(4,"Paul");
//        repositoryCustomer.deleteCustomer(1);
//        repositoryCustomer.deleteCustomer(2);
        Ingredient hendrixClassic = new Ingredient("test1",50);
        Ingredient kingsMill = new Ingredient("test2",100);
        Ingredient craftersCopper = new Ingredient("test3",150);

        RepositoryIngredient repositoryIngredient = new RepositoryIngredient();
//        repositoryIngredient.saveIngredient(hendrixClassic);
        //repositoryIngredient.saveIngredient(kingsMill);
//        repositoryIngredient.saveIngredient(craftersCopper);
        kingsMill.setPrice(270F);
        repositoryIngredient.updateIngredient(kingsMill);
//        repositoryIngredient.deleteIngredient(4);
//        repositoryIngredient.deleteIngredient(5);

        System.out.println("Let's run the program!");

    }
}
