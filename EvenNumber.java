import java.util.Scanner;

public class EvenNumber{

    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      System.out.println(isEven(number));
}
      public static boolean isEven(int number){


        if(number%2 == 0)
        { return true;}
        else {return false;}
      }
}
