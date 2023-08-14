public class Main 
{
   
    public static void main(String[] args)
    {
        
        int arr[] = new int[20];
       
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 6;
       
        int size = 5;
      
        int key = 5;
 
        System.out.print("Before Insertion: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
 
     
        size = insert(arr, key);
        
        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
   
    public static int insert(int arr[], int key)
    {
    
        int size = 5;
        int i;
     
      for(i=size-1; (i >= 0 && arr[i] > key); i--)
      {
      
            arr[i + 1] = arr[i];
      }
   
        arr[i + 1] = key;
         
        
        return (size + 1);
    }
}
