import java.util.Scanner;
public class array
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int arr[] = null;
        System.out.println("Enter the length of the array : ");
        int length = scan.nextInt();
        arr = new int[length];
        int iter;   
        // Entering the array elements
        System.out.println("Enter the array elements : ");
        for(iter=0;iter<arr.length;iter++)
            arr[iter]=scan.nextInt();
        System.out.println("The array in reverse order is : ");
        
        for(iter=arr.length-1;iter>=0;iter--)
        {
                System.out.print(arr[iter]+",");
        }   
    }
}
