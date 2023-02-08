import java.util.*;

// This program will prompt the user for their income and then calculate the amount of taxes 
// they will need to pay.

public class TaxCalculator {   
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
   
      double income = getIncome(console);
      
      int file = getFile(console);   
   }

   // prompts the user for their income
   public static double getIncome(Scanner console) {
      System.out.print("How much income do you have? Please type your answer here: ");
      double income = console.nextDouble();
      console.nextLine();
      System.out.println("$" + income);
      return income;
   }
   
   // prompts the user for filing status
   public static int getFile(Scanner console) {
      System.out.print("How are you filing? Single(1), Married Jointly(2), Married Separately(3), Head of Household(4)? Please type the corresponding number here: ");
      int file = console.nextInt();
      return file;
   }
   
   // identifies what status the user is filing under and runs the correct program
   public static void sortFile(int file, double income) {
   
      if (file == 1) {
         double taxedIncome = singleTax(income);
      }
      else if (file == 2) {
         double taxedIncome = jointTax(income);
      }
      else if (file == 3) {
         double taxedIncome = seperateTax(income);
      }
      else {
         double taxedIncome = houseTax(income);
      }  
   }
}
