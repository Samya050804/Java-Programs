import java.util.*;
public class Main
{    
    public static void main(String args[])
    {
        
        int arr[] = {10,30,50,70,90};
        
        System.out.print("Array : ");
        printArray(arr);
        System.out.print("Enter index to delete : ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        
        leftRotation(arr,index);
    }
    
    static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    
    public static void leftRotation(int arr[], int index){  
       
        for (int i=index+1; i<arr.length; i++)
        {
            arr[i-1]=arr[i];
        }
        System.out.print("After deletion : ");
        for(int i = 0 ; i <arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
