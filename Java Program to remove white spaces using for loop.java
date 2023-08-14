import java.util.Scanner;
public class Main {  
    public static void main(String[] args)
    {  
        
        Scanner sc = new Scanner(System.in);  
        // TAKING STRING FORM USER 
        System.out.print("Enter a string : ");  
        String s= sc.nextLine();   
        
        char[] s1 = s.toCharArray();  
        
        StringBuffer s2 = new StringBuffer();  
          
        for (int x= 0; x < s1.length; x++)
            if ((s1[x] != ' ') && (s1[x] != '\t'))
           
                s2.append(s1[x]);  
        String str = s2.toString(); 
      
        System.out.println("After Eliminating Space Sting Is : " + str);  
    }  
}  
