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
//        pd.setPersonalDataId(6);
//        RepositoryBartenderData repositoryBartenderData = new RepositoryBartenderData();
//
//        BartenderData btd = new BartenderData();
//        btd.setBartender(new Bartender(2));
//        btd.setPersonalData(new PersonalData(2));
//        System.out.println(btd);
//        repositoryBartenderData.saveData(btd);
//        repositoryBartenderData.saveData(new BartenderData(new Bartender(3), new PersonalData(2)));
//        repositoryBartenderData.saveData(new BartenderData(new Bartender(4), new PersonalData(1)));
//        repositoryBartenderData.saveData(new BartenderData(new Bartender(1), new PersonalData(2)));
//
//        System.out.println(bt);
//        System.out.println(bt1);
//
//        RepositoryBarTender repositoryBarTender = new RepositoryBarTender();
//        repositoryBarTender.saveBartender(bt);
//        repositoryBarTender.saveBartender(bt1);
//        repositoryBarTender.saveBartender(bt2);
//
////        BarTenderMenu barTenderMenu = new BarTenderMenu();
////        barTenderMenu.menuOption();
//
////             I will use menu after basic methods for each table is done
////        PersonalDataMenu pdm = new PersonalDataMenu();
////        pdm.menuOption();
//
//
////###########################        Bartender and personal data
//        repositoryBarTender.updateBartender(8, "Tolian");
//
//        RepositoryPersonalData repositoryPersonalData = new RepositoryPersonalData();
//        repositoryPersonalData.updatePersonalData(2, pd);
//        repositoryPersonalData.deletePersonalData(3);
//
////        ######################### CUSTOMER and INGREDIENTS
//
//        CustomerOrder customerOrder = new CustomerOrder(new Customer(5), new Orders(1));
//        RepositoryCustomerOrder repositoryCustomerOrder = new RepositoryCustomerOrder();
//        repositoryCustomerOrder.saveData(customerOrder);
//        RepositoryOrders repositoryOrders = new RepositoryOrders();
//
//        Ingredient hendrixClassic = new Ingredient("Craffters copper", 150);
//        Ingredient kingsMill = new Ingredient("Aclohol_Free_ingredient", 200);
//        Ingredient craftersCopper = new Ingredient("test3", 55);
//
//        RepositoryIngredient repositoryIngredient = new RepositoryIngredient();
//        repositoryIngredient.saveIngredient(hendrixClassic);
//        repositoryIngredient.saveIngredient(kingsMill);
//        repositoryIngredient.saveIngredient(craftersCopper);
//        Customer customer1 = new Customer("Mike");
//        Customer customer2 = new Customer("Tim");
//        RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
//        repositoryCustomer.saveCustomer(customer1);
//        repositoryCustomer.saveCustomer(customer2);
//        repositoryCustomer.saveCustomer(customer1);
//        repositoryCustomer.saveCustomer(customer2);
//        System.out.println("Let's run the program!");
//        BartenderData barD = new BartenderData(new Bartender(1),new PersonalData(1));
//        repositoryCustomer = new RepositoryCustomer();
//        //repositoryCustomer.getListOfAllCustomers().stream().forEach(System.out::println);
//        System.out.println(repositoryCustomer.getAmountOfCustomersByDate());
//        System.out.println(repositoryCustomer.getAmountOfCustomersByDate1());
//        Cocktail cocktail = new Cocktail("OLD fashion", "Really cool one", "test additional info");
//        RepositoryCocktail repositoryCocktail = new RepositoryCocktail();
//        repositoryCocktail.saveCocktail(cocktail);
//        Menu menuitem1 = new Menu(9.5F, cocktail);
//        RepositoryMenu repositoryMenu = new RepositoryMenu();
//        repositoryMenu.saveMenuItem(menuitem1);
//        Orders myOrder = new Orders(new Menu(1), 2);
//        repositoryOrders.saveOrder(myOrder);
//
//
//        Cocktail cocktail1 = new Cocktail("Tom Collins", "Really cool one", "test additional info");
//        Cocktail cocktail2= new Cocktail("OLD fashion", "Really cool one", "test additional info");
//        Cocktail cocktail = new Cocktail("Gin Tonic", "Really cool one", "test additional info");
//
//        RepositoryCocktail repositoryCocktail = new RepositoryCocktail();
//        repositoryCocktail.saveCocktail(cocktail1);
//        repositoryCocktail.saveCocktail(cocktail2);
//        repositoryCocktail.saveCocktail(cocktail);
//        Menu menuitem1 = new Menu(7F, cocktail1);
//        Menu menuitem2 = new Menu(8F, cocktail2);
//        Menu menuitem3 = new Menu(6F, cocktail);
//        RepositoryMenu repositoryMenu = new RepositoryMenu();
//        repositoryMenu.saveMenuItem(menuitem1);
//        repositoryMenu.saveMenuItem(menuitem2);
//        repositoryMenu.saveMenuItem(menuitem3);


//        Orders order1 = new Orders(new Menu(1),12);
//        Orders order2 = new Orders(new Menu(4),3);
//        Orders order3 = new Orders(new Menu(5),4);
//        Orders order4 = new Orders(new Menu(4),2);
//
//        RepositoryOrders repositoryOrders = new RepositoryOrders();
//        repositoryOrders.saveOrder(order1);
//        repositoryOrders.saveOrder(order2);
//        repositoryOrders.saveOrder(order3);
//        repositoryOrders.saveOrder(order4);

//        CustomerOrder myOrder1 = new CustomerOrder(new Customer(1));
//        CustomerOrder myOrder2 = new CustomerOrder(new Customer(2));
//
//        RepositoryCustomerOrder repositoryCustomerOrder = new RepositoryCustomerOrder();
//        repositoryCustomerOrder.saveData(myOrder1);
//        repositoryCustomerOrder.saveData(myOrder2);

//        OrderDetails orderDetails0 = new OrderDetails(new CustomerOrder(4),new Orders(1));
//        OrderDetails orderDetails01 = new OrderDetails(new CustomerOrder(4),new Orders(2));
//        OrderDetails orderDetails02 = new OrderDetails(new CustomerOrder(4),new Orders(3));
//        OrderDetails orderDetails1 = new OrderDetails(new CustomerOrder(5),new Orders(2));
//        OrderDetails orderDetails2 = new OrderDetails(new CustomerOrder(4),new Orders(5));
//
//        RepositoryOrderDetails repositoryOrderDetails = new RepositoryOrderDetails();
//        repositoryOrderDetails.saveData(orderDetails0);
//        repositoryOrderDetails.saveData(orderDetails01);
//        repositoryOrderDetails.saveData(orderDetails02);
//        repositoryOrderDetails.saveData(orderDetails1);
//        repositoryOrderDetails.saveData(orderDetails2);



        RepositoryOrders repositoryOrders = new RepositoryOrders();
//        repositoryOrders.getOrderReport().stream().forEach(System.out::println);
        repositoryOrders.getCocktailsGroupedByCustomerOrder(5).stream().forEach(System.out::println);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        repositoryOrders.getCocktailsGroupedByCustomerOrder(4).stream().forEach(System.out::println);
    }
}
