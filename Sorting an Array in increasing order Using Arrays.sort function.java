import java.util.Scanner;
import java.util.Arrays;
public class array
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Asking the user for array size
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        // Creating the array
        int arr[] = new int[size];
        System.out.println("Enter the array elements : ");
        // Takes the elements as input from the user
        for(int i = 0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }
        // Prints the array before and after sorting
        System.out.println("The array elements are : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("The array elements after sorting in ascending order are : "+Arrays.toString(arr));
    }
}
