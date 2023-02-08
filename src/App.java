
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {


    public static void main(String[] args) throws Exception {

        boolean toContinue = true;
        boolean isFirstTime = true;
        Scanner scanner = new Scanner(System.in);

        while (toContinue) {
            displayMenu(isFirstTime);
            String chosenOption = scanner.next();

            switch (chosenOption) {
                case "1":
                    System.out.println("You have reached option 1 now the average will be calculated.");
                    System.out.println("After that all elements will be displayed as their differences with average.");
                    App.displayDifference(null);
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

    public static int[] createArray(int size) {
        int[] returnArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            returnArray[i] = random.nextInt(101);
        }
        return returnArray;
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

    public static void displayDifference(int[] nums) {

        int sum = 0;
        for (int element : nums) {
            sum += element;
        }
        double average = ((double) sum) / nums.length;

        double[] newNums = new double[nums.length];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[i] - average;
        }
        System.out.println(Arrays.toString(newNums));

    }


    private static void findOddEvenSum(int[] array) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenSum += array[i];
            } else {
                oddSum += array[i];
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
