import java.util.Scanner;

public class Mean{

    public static void main(String[] args){
      System.out.println("Enter two numbers to calculate mean :");
      double number1 = GetIntFromUser();
      double number2 = GetIntFromUser();
      double mean = CalculateMean(number1,number2);
      System.out.println("Mean of two numbers is: " +mean);
      //System.out.println(mean);

    }

    public static double GetIntFromUser(){
      Scanner input = new Scanner(System.in);
      return input.nextDouble();

    }
    public static double CalculateMean(double number1, double number2){

        return (number1 + number2)/2;

    }

  }
