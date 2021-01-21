import java.util.Arrays;
import java.util.Scanner;



public class DoubleArray {



          public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number  ");
            int n=sc.nextInt();
            int[] array = new int[n];
              createArray(array);
              printArray(array);
              doubleArray(array);
        }




    public static void createArray(int[] array) {
        for(int i = 1; i<=array.length;i++){
            array[i] = i;
            //System.out.print(array[i] + "i");
        }



    }
    public static void printArray(int[] arr) {
        for(int i = 1; i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void doubleArray(int[] array) {



        int[] doubleArray1 = new int[array.length *2];



        System.out.println("length "+array.length);
        for (int i = 1; i <= array.length; i++) {
            doubleArray1[i] = array[i];



        }



        for (int i = 1; i <= doubleArray1.length; i++) {
            System.out.print(doubleArray1[i] + " ");



        }



    }
}
