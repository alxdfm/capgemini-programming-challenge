package ui;

import services.PairAnagramService;
import services.PasswordValidationService;
import services.StairsService;

import java.util.Scanner;

public class UserInterface {

    Scanner scan = new Scanner(System.in);

    private int optionNumber;

    public UserInterface() {
    }

    public void mainMenu(){

        System.out.println("Which exercise do you wanna run?\n");
        System.out.println("1 - Stairs draw;");
        System.out.println("2 - Password validation;");
        System.out.println("3 - Pair anagram;");
        System.out.println("0 - Exit\n");

        try {
            optionNumber = scan.nextInt();
            System.out.println();
            switch (optionNumber) {

                case 1:
                    option1();
                    runOther();
                    break;

                case 2:
                    option2();
                    runOther();
                    break;

                case 3:
                    option3();
                    runOther();
                    break;

                case 0:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid option!\n");
                    mainMenu();
            }
        } catch (RuntimeException e) {
            System.out.println("Unexpected Error! ");
        }
    }

    private void runOther() {
        System.out.print("Do you wanna run other option(y/n)? ");

        if(scan.next().equals("y")){
            System.out.println();
            mainMenu();
        }

        else{
            System.out.println("Bye!");
        }
    }

    public void option1(){
        System.out.print("Enter the integer N (stair height): ");
        System.out.println(new StairsService().stairsDraw(scan.nextInt()));
    }

    public void option2(){
        System.out.print("Enter the string password: ");
        int pendencies = new PasswordValidationService().passwordValidation(scan.next());

        if(pendencies>0){
            System.out.println("You need add at least "+pendencies+" characters!\n");
        }

        else {
            System.out.println("Your password is strong!\n");
        }

    }

    private void option3() {

        System.out.print("Enter the string anagram: ");
        System.out.println("The number of substrings that are anagrams is "+new PairAnagramService().anagram(scan.next())+"\n");
    }
}
