import java.util.*;

// This program will prompt the user for their income and then calculate the amount of taxes 
// they will need to pay.

public class TaxCalculator {   
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
   
      double income = getIncome(console);
      
      int file = getFile(console); 
      
      sortFile(file, income);  
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
   
   // calculates the amount of taxes that are required to be paid by single filers
   public static double singleTax(double income) {
      
      double taxedIncome = 0.0;
      
      if (income <= 10275) {
         taxedIncome = income * 0.1;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 10276 && income <= 41775) {
         taxedIncome = (income * 0.12) + 1027.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 41776 && income <= 89075) {
         taxedIncome = (income * 0.22) + 4807.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 89076 && income <= 170050) {
         taxedIncome = (income * 0.24) + 15213.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 170051 && income <= 215950) {
         taxedIncome = (income * 0.32) + 34647.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 215951 && income <= 539900) {
         taxedIncome = (income * 0.35) + 49335.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income > 539901) {
         taxedIncome = (income * 0.37) + 162718;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      
      return taxedIncome;
   }
   
   // calculates the amount of taxes that are required to be paid by married joint filers
   public static double jointTax(double income) {
      
      double taxedIncome = 0.0;
      
      if (income <= 20550) {
         taxedIncome = income * 0.1;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 20551 && income <= 83550) {
         taxedIncome = (income * 0.12) + 2055;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 83551 && income <= 178150) {
         taxedIncome = (income * 0.22) + 9615;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 178151 && income <= 340100) {
         taxedIncome = (income * 0.24) + 30427;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 340101 && income <= 431900) {
         taxedIncome = (income * 0.32) + 69295;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 431901 && income <= 647850) {
         taxedIncome = (income * 0.35) + 98671;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income > 647851) {
         taxedIncome = (income * 0.37) + 174253.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      
      return taxedIncome;
   }
   
   // calculates the amount of taxes that are required to be paid by married seperate filers
   public static double seperateTax(double income) {
      
      double taxedIncome = 0.0;
      
      if (income <= 10275) {
         taxedIncome = income * 0.1;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 10276 && income <= 41775) {
         taxedIncome = (income * 0.12) + 1027.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 41776 && income <= 89075) {
         taxedIncome = (income * 0.22) + 4807.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 89076 && income <= 170050) {
         taxedIncome = (income * 0.24) + 15213.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 170051 && income <= 215950) {
         taxedIncome = (income * 0.32) + 34647.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 215951 && income <= 323925) {
         taxedIncome = (income * 0.35) + 49335.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income > 323926) {
         taxedIncome = (income * 0.37) + 87126.75;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      
      return taxedIncome;
   }
   
   // calculates the amount of taxes that are required to be paid by household filers
   public static double houseTax(double income) {
      
      double taxedIncome = 0.0;
      
      if (income <= 14650) {
         taxedIncome = income * 0.1;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 14651 && income <= 55900) {
         taxedIncome = (income * 0.12) + 1465;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 55901 && income <= 89050) {
         taxedIncome = (income * 0.22) + 6415;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 89051 && income <= 170050) {
         taxedIncome = (income * 0.24) + 13708;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 170051 && income <= 215950) {
         taxedIncome = (income * 0.32) + 33148;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income >= 215951 && income <= 539900) {
         taxedIncome = (income * 0.35) + 47836;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      else if (income > 539901) {
         taxedIncome = (income * 0.37) + 161218.5;
         
         System.out.println("Income Tax: $" + taxedIncome);
      }
      
      return taxedIncome;
   }
}
