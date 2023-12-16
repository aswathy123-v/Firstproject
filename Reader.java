import java.io.*;
class Reader
{
public static void main(String[] args)throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("enter your name");
String name=br.readLine();
System.out.println("Enter your age");
int age=Integer.parseInt(br.readLine());
System.out.println("welcome " +name +" "+"your age is"+age);
}
}
