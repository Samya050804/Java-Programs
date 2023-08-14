import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       
        int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68,10,20,30,20,30,50,10,50,20};
        int freq[] = new int[arr.length];
       
        Arrays.fill(freq, -1);
        
        System.out.println("The array elements are "+Arrays.toString(arr));
        
        unique(arr,freq);
    }
    
   
    static void unique(int arr[], int freq[])
    {
        int count;
        for(int i = 0; i<arr.length; i++)
        {
          
            count=1;
            for(int j = i + 1; j<arr.length;j++)
            {
             
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j] = 0;
                }
            }
         
            if(freq[i]!=0)
            {
                freq[i] = count;
            }
        }
        
        int highestFreq=freq[0], mostOccuringIndex=0;
        for(int i=0;i<freq.length;i++)
        {
            if(highestFreq<freq[i])
            {
                highestFreq=freq[i];
                mostOccuringIndex = i;
            }
        }
 
        System.out.println("The most occuring element is "+arr[mostOccuringIndex]+
        " which has occured "+freq[mostOccuringIndex]+" times.");
    }
}
