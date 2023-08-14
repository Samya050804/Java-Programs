public class Main
{    
    public static void main(String args[])
    {
        
        String arr1[] = {"cat", "dog", "mouse"};
        String arr2[] = {"elephant", "cat", "mouse", "lion", "zebra"};
       
        System.out.print("Array 1 : ");
        printArray(arr1);
        System.out.print("Array 2 : ");
        printArray(arr2);
        System.out.print("The common elements are : ");
       
        printCommon(arr1,arr2);
    }
    
    static void printArray(String arr[])
    {
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static void printCommon(String arr1[], String arr2[])
    {  

        for (int i=0; i<arr1.length; i++){
            for(int j=0;j<arr2.length;j++)
                if (arr1[i].equals(arr2[j])){
                    System.out.print(arr1[i]+" "); 
            }  
        }
    }  
}
