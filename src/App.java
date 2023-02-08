import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static ArrayList<Integer> array = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        boolean toContinue = true;
        boolean isFirstTime = true;
        Scanner scanner = new Scanner(System.in);

        while (toContinue) {
            displayMenu(isFirstTime);
            String chosenOption = scanner.next();

            switch (chosenOption) {
                case "1":
                    System.out.println("You have reached option 1.");
                    break;
                case "2":
                    findOddEvenSum(null);
                    break;
                case "3":
                    findMax(null);
                    break;
                case "4":
                    findMin(null);
                    break;
                case "999":
                    System.err.println("Exiting application..");
                    System.exit(0);

                default:
                    System.out.println("Unknown option.");
                    break;
            }

            isFirstTime = false;
        }

        scanner.close();
    }

    public static void displayMenu(boolean isFirstTime) {
        String menu = "";

        if (isFirstTime) {
            menu += "Welcome to this application.\n";
        }

        menu += "-----------------------------\n";
        menu += "Option 1: Example\n";
        menu += "Option 999: Exit\n";

        System.out.println(menu);
    }
    private static void findOddEvenSum(int[] array) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (i % 2 == 0) {
                evenSum += array.get(i);
            } else {
                oddSum += array.get(i);
            }
        }
        System.out.println("Sum of elements with odd indexes: " + oddSum);
        System.out.println("Sum of elements with even indexes: " + evenSum);
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
