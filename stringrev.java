import java.util.*;
class stringrev{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
String s=sc.nextLine();
String r="";
for(int i=0;i<s.length()-1;i++){
if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
count++;
}
for(int j=s.length()-1;j>=0;j--)
{
r=r+s.charAt(j);
}
System.out.println("vowel count="+count);
System.out.println("String reverse="+r);
}
}

