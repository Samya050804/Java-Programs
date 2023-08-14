public class SwapTwoNumbers 
{
    public static void main(String[] args) 
{
        int a = 58, b = 72;
       
        System.out.println("--Before swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
 
        int temp = a;
        
        a = b;
        
        b = temp;
        
        System.out.println("\n\n--After swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
