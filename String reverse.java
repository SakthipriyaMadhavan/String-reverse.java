import java.util.Scanner;
import java.util.Arrays;
public class Str1
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
String a = new String();
a=sc.nextLine();
char a1[]=a.toCharArray();
//char a1[] = new char[a.length()];
//for(int i=0;i<a.length();i++)
//{
//a1[i]=a.charAt(i);
//}
System.out.println(Arrays.toString(a1));
int e=a.length()-1;
int s=0;
while(s<e)
{
char temp = a1[s];
a1[s]=a1[e];
a1[e]=temp;
s++;
e--;
}
String a2= new String(a1); 
System.out.println(Arrays.toString(a2));

}
}
