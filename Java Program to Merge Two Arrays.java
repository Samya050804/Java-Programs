import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of arrays: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        
        System.out.print("Enter array 1 elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter array 2 elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr2[i] = sc.nextInt();
        }
        mergeArraysMethod(arr1, arr2);
    }
    public static void mergeArraysMethod(int[] arr1, int[] arr2) 
    {
        
        int newArray[] = new int[arr1.length + arr2.length];
        
        System.arraycopy(arr1, 0, newArray, 0, arr1.length);
        
        System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
        
        System.out.println("Array1 = " + Arrays.toString(arr1));
        System.out.println("Array2 = " + Arrays.toString(arr2));
        System.out.println("Merged Array = " + Arrays.toString(newArray));
    }
}
