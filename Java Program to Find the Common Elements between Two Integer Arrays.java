import java.util.*;
public class Main
{    
    public static void main(String args[])
    {
        
        int arr1[] = {10,30,50,70,90};
        int arr2[] = {10,20,30,40,50};
        
        System.out.print("Array 1 : ");
        printArray(arr1);
        System.out.print("Array 2 : ");
        printArray(arr2);
        System.out.print("The common elements are : ");
        
        printCommon(arr1,arr2);
    }
   
    static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static void printCommon(int arr1[], int arr2[])
    {  
        
        for (int i=0; i<arr1.length; i++){
            for(int j=0;j<arr2.length;j++)
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" "); 
            }  
        }
    }  
}
