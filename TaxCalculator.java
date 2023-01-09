import java.util.*;

// This program will prompt the user for their income and then calculate the amount of taxes 
// they will need to pay.

public class TaxCalculator {   
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
   
      double income = getIncome(console);
      
      String file = getFile(console);
   
   }

   // prompts the user for their income
   public static double getIncome(Scanner console) {
      System.out.print("How much income do you have? Please type your answer here: ");
      double income = console.nextDouble();
      System.out.println("$" + income);
      return income;
   }
   
   // prompts the user for filing status
   public static String getFile(Scanner console) {
      System.out.print("How are you filing? Single, Married Jointly, Married Separately, Head of Household? Please type your answer here: ");
      String file = console.nextLine();
      System.out.println(file);
      return file;
   }
}
