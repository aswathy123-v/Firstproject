import java.util.*
class Sswitch3
 {
public static void main(String[]args)
   {
     Scanner myobj=new Scanner(System.in);
     System.out.println("operations,add,sub,mul");
     String operations=myobj.nextLine();
     System.out.println("select an operation"+operations);
     int c;
switch(operations)
      {
case"add":
   Scanner myobj=new Scanner(System.in);
   System.out.println("enter two number");
   int a=myobj.nextInt();
   int b=myobj.nextInt();
    c=a+b;
   System.out.println("addition"+c);
   break;
case"sub":
   Scanner myobj=new Scanner(System.in);
   System.out.println("enter two number");
   int a=myobj.nextInt();
   int b=myobj.nextInt();
    c=a-b;
   System.out.println("substration"+c);
   break;
case"mul":
   Scanner myobj=new Scanner(System.in);
   System.out.println("enter two number");
   int a=myobj.nextInt();
   int b=myobj.nextInt();
    c=a*b;
   System.out.println("multiplication"+c);
   break;
default:
       System.out.println("flase");
       break;
      }
}
}