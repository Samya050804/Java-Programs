public class EqualArray 
{
     public static void main(String[] args)
     {
       
        int[] arr1 = { 1, 2, 3, 4, 5, 7, 7 };
        int[] arr2 = { 1, 2, 3, 4, 5, 7, 7 };
        
        
        System.out.println((isEqual(arr1, arr2)));
    }
   
    public static boolean isEqual(int[] arr1, int[] arr2) 
    {
        
        if (arr1.length != arr2.length)
            return false;
       
        for (int i = 0; i < arr2.length; i++) 
        {
               
                if (arr1[i] != arr2[i])
                    return false;
        }
        
        return true;
    }
}
