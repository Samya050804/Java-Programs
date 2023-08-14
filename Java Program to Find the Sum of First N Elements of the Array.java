public class Main 
{
    public static void main(String[] args) 
    {
        
        int[] arr = { 17, 21, 3, 23, 12, 45, 123, 235 };
        int n = 6;
        
        System.out.println("Sum of first "  + n + " elements of the array is: " + findSum(arr, n));
    }
    static int findSum(int[] arr, int n) 
    {
        int sum = 0;
       
        for (int i = 0; i < n; i++) 
        {
            sum += arr[i];
        }
        return sum;
    }
}
