public class MissingNum 
{
    
    public static void main(String[] args) 
    {
        
        int[] arr = {1, 2, 4, 5, 6, 7};
        
        System.out.println("The missing number is : "+ findMissing(arr));
    }
    
   
    public static int findMissing(int arr[]) 
    {
      
        int arraySum = (arr[arr.length-1] * (arr[arr.length-1] + 1)) / 2;
        for (int i : arr) 
        {
            arraySum -= i;
        }
        return arraySum;
    }
}
