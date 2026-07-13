import java.util.Scanner;

class loopdemo1
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int a1 = obj.nextint();
int a2 = obj.nextint();
int a3 = obj.nextint();
if(a1>a2 && a1>a3)
System.out.println("a1");
else if(a2>a3 && a2>a1)
System.out.println("a2");
else
System.out.println("a3");
}
}
