import java.util.Scanner;

public class GreetNumber{

    public static void main(String[] args){

      int number = EnterNumber();
      Repeat(number);

    }
    public static int EnterNumber(){
      Scanner number = new Scanner(System.in);
      System.out.print("Enter a number between 0 & 10 : ");
      return number.nextInt();
    }
    public static void Repeat(int number)

    {

      if (number>=0 && number<=10)
            {System.out.println("Congratulation!!You have entered correct number number.");}

        if(number<0 || number>10)
            {System.out.println("Oops!! You have entered incorrect number");
             EnterNumber (int number1);
             Repeat (int number1);
            }

      }


      }
