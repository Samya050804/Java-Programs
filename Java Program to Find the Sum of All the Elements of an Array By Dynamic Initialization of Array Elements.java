import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
    
        int arr[] = new int[size];
        
        System.out.println("Enter array elements : ");
        int sum = 0;        
        for(int i=0;i<size;i++)
        {
            arr[i] = scan.nextInt();
            
            sum+=arr[i];
        }
      
        System.out.println("The array elements are"+Arrays.toString(arr));
        
       
        System.out.println("The sum of all the array elements is: "+sum);
    }
}
