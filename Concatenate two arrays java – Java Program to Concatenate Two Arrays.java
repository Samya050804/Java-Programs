import java.util.Arrays;
public class Main
{
    public static void main(String args[])
    {
       
        int arr1[] = {12, 22, 34, 22, 54};
        int arr2[] = {29,54,98,87,2};
        
        int resultantArr[] = new int[arr1.length+arr2.length];
        
        System.arraycopy(arr1,0,resultantArr,0,arr1.length);
        System.arraycopy(arr2,0,resultantArr,arr1.length,arr2.length);
        System.out.println("The array elements are : "+Arrays.toString(resultantArr));
        
    }
}
