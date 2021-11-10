import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    //this applies recurssion to get the factorial of a number
    public static void main(String[] args) {
        //since a factorial is a number multiplied by it's preceeding number...
        // 5! = 5*4*3*2*1 = 120
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input a positive integer number - ");
        int inputFromUser = 0;
        String input;
        try {
            input = inputScanner.nextLine();
            inputFromUser = Integer.parseInt(input);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        //we make sure to close the scanner to avoid leaks
        inputScanner.close();
        if (inputFromUser < 0) {
            System.out.println("Please input a valid number\nto find it's factorial");
        }else{
            System.out.println(factorialOfTheNumber(inputFromUser));
        }
    }

    //recurssion has to do with calling a function again and again, inside its own declaration
    //therefore...
    public static int factorialOfTheNumber(int userInput) {
        if (userInput == 1) {
            return 1;
        }else{
            return userInput * factorialOfTheNumber(userInput -1);
        }
    }
}
