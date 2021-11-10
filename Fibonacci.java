import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int initialValue, step1 = 1, step2 =1;
        initialValue = 0;

        //we demand an input from the user, and make sure to close our scanner after that
        System.out.println("Input an Index (Number) to reference for the Fibonnacci series: ");
        Scanner inputScanner = new Scanner(System.in);
        int input = inputScanner.nextInt();
        inputScanner.close();

        //here goes the main calculations
        System.out.print("1 1");
        while (initialValue<=input) {
            initialValue = step1 + step2;
            if (initialValue >= input) {
                break;
            }
            System.out.print(initialValue + " ");
            step1 = step2;
            step2 = initialValue;
        }
    }
}