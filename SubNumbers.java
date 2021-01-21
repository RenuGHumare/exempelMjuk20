import java.util.Scanner;

public class SubNumbers{

    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number1: ");
      int number1 = input.nextInt();
      System.out.print("Enter a number2: ");
      int number2 = input.nextInt();

      printSubtract(number1,number2);
   }
   public static void printSubtract(int number1, int number2) {
     System.out.println("Output : " + (number1-number2));
      }
    }
