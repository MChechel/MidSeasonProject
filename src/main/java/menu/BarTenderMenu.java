package menu;

import model.Bartender;
import persistence.RepositoryBarTender;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarTenderMenu {
    private Scanner scanner = new Scanner(System.in);
    private RepositoryBarTender repositoryBarTender;

    public BarTenderMenu() {
        this.scanner = scanner;
        this.repositoryBarTender = new RepositoryBarTender();
    }

    public void menuOption() {
        System.out.println("#### Bartender menu ####");
        System.out.println("Type the option menu");
        System.out.println("1 - Register a new Bartender\n To leave menu enter any value that is not on the list");
        int optionSelected = scanner.nextInt();
        switch (optionSelected) {
            case 1:
                saveEmployee();
                break;
            default:
                System.out.println("Your input is not recognized - now menu will be closed!");
        }
    }

    private void saveEmployee() {
        System.out.println("Menu - register a new bartender");
        String name = scanner.nextLine();
        if (checkName(name)) {
            Bartender barT = new Bartender(name);
            repositoryBarTender.saveBartender(barT);
        }else{
            System.out.println("Your input is incorrect, name has to contain only letters and length in range from 3 to 26");
            saveEmployee();
        }
        menuOption();
    }

    private boolean checkName(String name){
        Pattern pattern = Pattern.compile("[a-zA-Z]{3,26}");
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            return true;
        }else{return false;}

    }

}




