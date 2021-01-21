import java.util.Scanner;

public class Subtract{

    public static void main(String[]args){
      int i;
    for(i=0;i<3;i++) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      printSubtractTen(number);
    }

      }

   public static void printSubtractTen(int number) {
     System.out.println("Output : " + (number-10));
      }
    }
