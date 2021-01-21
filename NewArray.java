import java.util.Scanner;

public class NewArray
{

    public static void main(String[]args)
    {
      Scanner input = new Scanner(System.in);

      System.out.print("How many numbers of Array do you want to print? : ");
      int n = input.nextInt();
      int[] array = new int [n];

      createArray(array);
      printArray(array);
      doubleArray(array);

    }
    public static void createArray(int[] array){

      for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println();

      }

      public static void printArray(int[] array){
        System.out.print("[");
        for(int i = 0; i< array.length-1;i++){
            System.out.print(array[i] + ",");
          }
        System.out.print(array[array.length-1] + "]");
        System.out.println();
        System.out.println("Length of Array :  "+ array.length);
      }

      public static void doubleArray(int[] array){
        int[] newArray = new int[array.length *2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
          }
          for (int i = 0; i < newArray.length; i++) {
              System.out.print(newArray[i] + " ");
  }
}
}
