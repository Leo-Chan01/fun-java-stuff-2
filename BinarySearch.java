import java.util.Scanner;

public class BinarySearch {
    //a binary list basically involves comparison of the midpoint with the value we are 
    //looking for
    //change these values to your 12
    private static int[] binarySearchList = new int[]{11,15,43,67,44,26,67,77,98,19,150};

    //to use binary search, we need to sort the list first

    public static void main(String[] args) {

        System.out.println("Input a key to find it's associated number form this list ");
        for (int i = 0; i < binarySearchList.length; i++) {
            if (i == (binarySearchList.length-1)) {
                System.out.print(binarySearchList[i]);
            }else{
                System.out.print(binarySearchList[i] + ", ");
            }
        }
        System.out.print("\n");
        Scanner inputScanner = new Scanner(System.in);
        // int inputFromUser = 0;
        int indexInputFromUser = 0;
        // inputFromUser = inputScanner.nextInt();
        indexInputFromUser = inputScanner.nextInt();
        //close your scanner to avoid leaks
        inputScanner.close();
        //the first parameter is the list, the second is the number we are looking for
        if (binarySearch(binarySearchList, binarySearchList[indexInputFromUser])) {
            System.out.println("Found " + binarySearchList[indexInputFromUser] + " at key " + indexInputFromUser);
        }else{
            System.out.println("Could not find that number at any key");
        }
    }

    private static boolean binarySearch(final int[] array, final int search) {
        //note we are working with index for each element variables, as follows
        //for the first element
        int firstElement = 0;
        //for the last element this is true because we start from zero when counting the elements of an array
        int lastElement = array.length -1; 
        //now we iterate
        while (firstElement <= lastElement) {
            //to get the middle element, we add the index of the first and last element, divided by 2
            int middleElement = (firstElement + lastElement)/2;
            if (array[middleElement] < search) {
               firstElement = middleElement + 1; 
            }else if (array[middleElement] == search) {
                return true;
            }else{
                lastElement = middleElement -1;
            }
            middleElement = (firstElement + lastElement)/2;
        }
        return false;
    }
}