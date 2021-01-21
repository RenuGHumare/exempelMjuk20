import java.util.Scanner;

public class Fib
{

    public static void main(String[]args)
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter numbers to print in Fibonacci series : ");
      int Number = input.nextInt();
      Fibonacci_series(Number);

     }

 public static void Fibonacci_series(int Number)
  {
    System.out.println("Fibonacci Series is : ");
    int i, First_Value = 0, Second_Value = 1, Next;
    for(i = 0; i < Number; i++)  {
    if(i <= 1) {
        Next = i;
        }
 else   {
                Next = First_Value + Second_Value;
                First_Value = Second_Value;
                Second_Value = Next;
        }
 System.out.println(Next);
  }
}

}
