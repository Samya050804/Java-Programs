import java.util.*;  
public class Largest 
{  
    public static void main(String[] args)   
    {  
        int first, second, third, big, temp; 
        
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the first number:");  
        first = sc.nextInt();  
        System.out.println("Enter the second number:");  
        second = sc.nextInt();  
        System.out.println("Enter the third number:");  
        third = sc.nextInt();  
        
        
        if(first>=second && first>=third)  
            System.out.println("The largest among largest numbers: "+first);  
        
        else if (second>=first && second>=third)  
            System.out.println("The largest among largest numbers: "+second);  
        
        else  
            System.out.println("The largest among largest numbers: "+third);  
    }  
}
