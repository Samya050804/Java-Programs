public class Main
{
    public static void main(String args[])
    {
       
        int arr1[] = {12, 22, 34, 22, 54};
        int arr2[] = {29,54,98,87,2};
        
        int resultantArr[] = new int[arr1.length+arr2.length];
        int index = 0;
       
        for(int i:arr1)
            resultantArr[index++] = i;
        
        for(int i:arr2)
            resultantArr[index++] = i;    
      
        System.out.println("The array elements are : "+Arrays.toString(resultantArr));
        
    }
}
