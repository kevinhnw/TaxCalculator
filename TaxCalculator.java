import java.util.*;

public class TaxCalculator {   
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
   
      int income = getIncome(console);
   
   }

   public static int getIncome(Scanner console) {
      System.out.print("How much income do you have? Please type your answer here: ");
      int income = console.nextInt();
      return income;
   }
}
