public class Main
{
public static void main(String[] args)
{
String s = "You are studying from BTechGeeks";
char ch;
int count = 0;
for(int i = 0; i < s.length(); i++) {
if(ch == s.charAt(i)) {
count++;
}
}
System.out.println("Frequency of " + ch + " = " + count);
}
}
