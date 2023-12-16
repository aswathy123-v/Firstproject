import java.util.*;
class Sswitch2
 {
   public static void main(String[]args)
    {
	Scanner myobj=new Scanner(System.in);
	System.out.println("operations");
	String operations=myobj.nextLine();
	System.out.println("enter two number");
		int a=myobj.nextInt();
                int b=myobj.nextInt();
                int c;
  switch(operations)
      {
     case"add":
         int c=a+b;
          break;
   case"sub":
         int c=a-b;
         break;
 case"mul":
         int c=a*b;
          break;
default:
       int c=0;
       break;
    }
       System.out.println(c);   
}
}