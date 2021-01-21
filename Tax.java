import java.util.Scanner;

public class Tax{

    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Tax to be paid : " + CalculateTax(salary));
        System.out.println("Net salary :" + (salary - CalculateTax(salary)));
    }
    public static double CalculateTax(double salary)
    {
      if (salary >=100000){
        return salary*0.4;
       }


      else
        { return salary*0.3;}
    }
  }
