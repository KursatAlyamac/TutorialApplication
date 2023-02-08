
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    private static int[] array;

    public static void main(String[] args) throws Exception {

        boolean toContinue = true;
        boolean isFirstTime = true;
        Scanner scanner = new Scanner(System.in);

        while (toContinue) {
            if (isFirstTime) {
                System.out.print("Enter the array size: ");
                int size = scanner.nextInt();
                createArray(size);
            }

            displayMenu(isFirstTime);
            String chosenOption = scanner.next();

            switch (chosenOption) {
                case "1":
                    System.out.println("You have reached option 1 now the average will be calculated.");
                    System.out.println("After that all elements will be displayed as their differences with average.");
                    App.displayDifference();
                    break;
                case "2":
                    findOddEvenSum();
                    break;
                case "3":
                    findMax();
                    break;
                case "4":
                    findMin();
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

    public static void createArray(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public static void displayMenu(boolean isFirstTime) {
        String menu = "";

        if (isFirstTime) {
            menu += "Welcome to this application.\n";
        }

        menu += "-----------------------------\n";
        menu += "Option 1: Display Difference with Avg\n";
        menu += "Option 2: Find odd and even sums\n";
        menu += "Option 3: Find maximum element\n";
        menu += "Option 4: Find minimum element\n";
        menu += "Option 999: Exit\n";

        System.out.println(menu);
    }


    public static void displayDifference() {

        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        double average = ((double) sum) / array.length;

        double[] newNums = new double[array.length];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = array[i] - average;
        }
        System.out.println(Arrays.toString(newNums));

    }

    private static void findOddEvenSum() {
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

    public static void findMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }

    public static void findMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum element in the array is: " + min);
    }
    public int sumOfEvenOrOdd(int[] arr, boolean even){
        if(even){
            int sum = 0;
            for(int i = 0; i<arr.length; i++){
                sum += arr[i];
            }
            return sum;
        }
        else{
            int sum = 0;
            for(int i = 1; i<arr.length; i++){
                sum += arr[i];
            }
            return sum;
        }

    }
}
