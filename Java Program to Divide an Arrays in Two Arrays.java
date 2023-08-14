public class Main
{
    public static void main(String args[])
    {
       
        int arr[] = {12, 22, 34, 22, 54};
        
        System.out.println("The array elements are : "+Arrays.toString(arr));
        int len = arr.length;
      
        int subArr1[] = new int[(len+1)/2];
        int subArr2[] = new int[len-subArr1.length];
       
        for (int i = 0; i < len; i++)
        {
            if (i < subArr1.length) {
                subArr1[i] = arr[i];
            }
            else {
                subArr2[i - subArr1.length] = arr[i];
            }
        }
    
        System.out.println("The sub array 1 elements are : "+Arrays.toString(subArr1));
        System.out.println("The sub array 2 elements are : "+Arrays.toString(subArr2));
    }
}
