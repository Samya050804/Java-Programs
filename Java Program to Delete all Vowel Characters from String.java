import java.util.Scanner;
 
public class DeleteVowels {
    public static void main(String args[]) {
        String str, output;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter a String");
        str = scanner.nextLine();
 
        
        output = str.replaceAll("[AEIOUaeiou]", "");
 
        System.out.println("Output String\n" + output);
    }
}
