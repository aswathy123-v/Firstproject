import java.util.*;
class Sswitch4
 {
public static void main(String[]args)
   {
     Scanner myobj=new Scanner(System.in);
     System.out.println(" select an operations,add,sub,mul");
     String operations=myobj.nextLine();
     System.out.println("selected operation is"+operations);
     int a,b,c;
switch(operations)
      {
case"add":{
  // Scanner myobj1=new Scanner(System.in);
   System.out.println("enter two number");
    a=myobj.nextInt();
    b=myobj.nextInt();
    c=a+b;
   System.out.println("addition"+c);
   break;}
case"sub":{
  // Scanner myobj=new Scanner(System.in);
   System.out.println("enter two number");
    a=myobj.nextInt();
    b=myobj.nextInt();
    c=a-b;
   System.out.println("substration"+c);
   break;}
case"mul":{
  // Scanner myobj=new Scanner(System.in);
   System.out.println("enter two number");
    a=myobj.nextInt();
    b=myobj.nextInt();
    c=a*b;
   System.out.println("multiplication"+c);
   break;}
default:
       System.out.println("flase");
       break;
      }
}
}