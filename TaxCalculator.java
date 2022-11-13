import java.util.*;

// This program will prompt the user for their income and then calculate the amount of taxes 
// they will need to pay.

public class TaxCalculator {   
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
   
      int income = getIncome(console);
   
   }

   // prompts the user for their income
   public static int getIncome(Scanner console) {
      System.out.print("How much income do you have? Please type your answer here: ");
      int income = console.nextInt();
      System.out.println("$" + income);
      return income;
   }
}
