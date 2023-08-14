public class Main
{
    public static void main(String[] args) 
    {
        //array initialized
        int arr[] = {10,20,30,40,50,60};
        //iterating the array
        for(int i=0;i<arr.length;i++)
        {
            
            arr[i] = arr[i]*arr[i];
        }
        
        //printing the result array 
        System.out.println("New array after finding square of each element :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }    
   }
}
