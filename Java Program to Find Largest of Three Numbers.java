import java.util.Scanner;
 

public class MaximumThreeNumbers {
 
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        System.out.println("Enter Three Integer");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
 
        
        if (a > b) {
            
            if (a > c)
                max = a;
            else
                max = c;
        } else {
          
            if (b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("Largest Number : " + max);
    }
}
