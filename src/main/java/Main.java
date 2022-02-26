import menu.BarTenderMenu;
import menu.PersonalDataMenu;
import model.*;
import org.hibernate.PersistentObjectException;
import org.hibernate.criterion.Order;
import persistence.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Let's run the program!");
//        BarInventory barInventory = new BarInventory();
//        Bartender bt = new Bartender("Mike");
//        Bartender bt1 = new Bartender("Gl");
//        Bartender bt2 = new Bartender("Artur");
//        PersonalData pd = new PersonalData();
////        pd.setPersonalDataId(6);
//        RepositoryBartenderData repositoryBartenderData = new RepositoryBartenderData();
//
//        BartenderData btd = new BartenderData();
//        btd.setBartender(new Bartender(2));
//        btd.setPersonalData(new PersonalData(2));
//        System.out.println(btd);
//        repositoryBartenderData.saveData(btd);
//        repositoryBartenderData.saveData(new BartenderData(new Bartender(3),new PersonalData(2)));
//        repositoryBartenderData.saveData(new BartenderData(new Bartender(4),new PersonalData(1)));
//        repositoryBartenderData.saveData(new BartenderData(new Bartender(1),new PersonalData(2)));

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
////        Customer customer2 = new Customer("Tim");
//        //        repositoryCustomer.saveCustomer(customer1);
////        repositoryCustomer.saveCustomer(customer2);
////        repositoryCustomer.saveCustomer(customer1);
////        repositoryCustomer.saveCustomer(customer2);
////        repositoryCustomer.updateCustomer(4,"Paul");
////        repositoryCustomer.deleteCustomer(1);
////        repositoryCustomer.deleteCustomer(2);
//        //Ingredient hendrixClassic = new Ingredient("test1",50);
//        Ingredient kingsMill = new Ingredient("Aclohol_Free_ingredient",999);
//        //Ingredient craftersCopper = new Ingredient("test3",150);
//
//        RepositoryIngredient repositoryIngredient = new RepositoryIngredient();
////        repositoryIngredient.saveIngredient(hendrixClassic);
//        //repositoryIngredient.saveIngredient(kingsMill);
////        repositoryIngredient.saveIngredient(craftersCopper);
//        kingsMill.setPrice(535F);
//        repositoryIngredient.updateIngredient(kingsMill);
////        repositoryIngredient.deleteIngredient(4);
////        repositoryIngredient.deleteIngredient(5);
//        //repositoryIngredient.saveIngredient(kingsMill);
//        System.out.println("Let's run the program!");
        //BartenderData barD = new BartenderData(1,1);
//        RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
//        //repositoryCustomer.getListOfAllCustomers().stream().forEach(System.out::println);
//        System.out.println(repositoryCustomer.getAmountOfCustomersByDate());
//        System.out.println(repositoryCustomer.getAmountOfCustomersByDate1());

//        Cocktail cocktail = new Cocktail("OLD fashion with a twist", "Really cool one", "test additional info");
//        RepositoryCocktail repositoryCocktail = new RepositoryCocktail();
//        repositoryCocktail.saveCocktail(cocktail);
//
//        Menu menuitem1 = new Menu(7.5F,cocktail);
//        RepositoryMenu repositoryMenu = new RepositoryMenu();
//        repositoryMenu.saveMenuItem(menuitem1);

//        Orders myOrder = new Orders(new Menu(1),3);
//        RepositoryOrders repositoryOrders = new RepositoryOrders();
//        repositoryOrders.saveOrder(myOrder);

//            CustomerOrder customerOrder = new CustomerOrder(new Customer(5),new Orders(1));
//            RepositoryCustomerOrder repositoryCustomerOrder = new RepositoryCustomerOrder();
//            repositoryCustomerOrder.saveData(customerOrder);
        RepositoryOrders repositoryOrders = new RepositoryOrders();
        repositoryOrders.getOrderReport().stream().forEach(System.out::println);
    }
}
