import java.util.Scanner;
import java.util.Arrays;
public class array
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter the array elements : ");
        
        for(int i = 0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        System.out.println("The array elements are : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("The array elements after sorting in ascending order are : "+Arrays.toString(arr));
    }
}
