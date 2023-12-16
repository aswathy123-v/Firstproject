import java.util.*;
class Myclass
{
public static void main(String[]args)
{
Scanner myobj=new Scanner(System.in);
System.out.println("user name");
String name=myobj.nextLine();
System.out.println("your age");
int age =myobj.nextInt();
System.out.println("welcome"+name +" " +"age is " +age);
}
}