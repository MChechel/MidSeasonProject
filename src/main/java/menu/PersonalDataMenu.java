package menu;

import model.Bartender;
import model.PersonalData;
import persistence.RepositoryBarTender;
import persistence.RepositoryPersonalData;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalDataMenu {

    private Scanner scanner = new Scanner(System.in);
    private RepositoryPersonalData repositoryPersonalData;

    public PersonalDataMenu() {
        this.scanner = scanner;
        this.repositoryPersonalData = new RepositoryPersonalData();
    }

    public void menuOption() {
        System.out.println("#### Bartender menu ####");
        System.out.println("Type the option menu");
        System.out.println("1 - Insert new Personal Data into DB\n To leave menu enter any integer value that is not on the list");
        int optionSelected = scanner.nextInt();
        switch (optionSelected) {
            case 1:
                savePersonalData();
                break;
            default:
                System.out.println("Your input is not recognized - now menu will be closed!");
        }
    }

    private void savePersonalData() {
        System.out.println("Menu - register a new personal data set");
        System.out.println("Please enter email address");
        String email = scanner.next();
        while (!checkEmail(email)){
            System.out.println("Your input of email is incorrect - please enter correct one");
            email = scanner.next();
        }
        System.out.println("Please enter address address");
        String address = scanner.nextLine();
        System.out.println("Please enter phone number address");
        String phoneNumber = scanner.next();
        while (!checkPhoneNumber(phoneNumber)){
            System.out.println("Your input of phone number is incorrect - please enter correct one");
            phoneNumber = scanner.next();
        }
        PersonalData pd = new PersonalData(email,phoneNumber,address);
        repositoryPersonalData.savePersonalData(pd);
        menuOption();
    }
    private boolean checkPhoneNumber(String phoneNUmber){
        Pattern pattern = Pattern.compile("[0-9]{6,12}");
        Matcher matcher = pattern.matcher(phoneNUmber);
        if(matcher.matches()){
            return true;
        }else{return false;}

    }
    private boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }else{return false;}
    }


}
