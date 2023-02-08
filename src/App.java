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
                    System.out.println("You have reached option 1.");
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
    public static void displayDifference(int [] nums)
    {
        
        int sum =0;
        for(int element: nums)
        {
            sum+=element;
        }
        double average = ((double)sum)/nums.length;

      double [] newNums = new double [nums.length];
      for(int i=0;i<newNums.length;i++)
      {
        newNums[i]  = nums[i]-average;    
      }
      System.out.println(Arrays.toString(newNums));

    }
   
}
