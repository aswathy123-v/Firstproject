import java.util.*;
class Sswitch1
 {
   public static void main(String[]args)
    {
	Scanner myobj=new Scanner(System.in);
	System.out.println("Select an operations add or sub or mul");
	String operations=myobj.nextLine();
  	System.out.println("The selected operation is "+operations);
	System.out.println("enter two number");
		int a=myobj.nextInt();
                int b=myobj.nextInt();
                int c;
  switch(operations)
      {
     case"add":
         c=a+b;
         System.out.println("The added resilt is " +c);
         break;
   case"sub":
         c=a-b;
         System.out.println("substaction" +c);
         break;
 case"mul":
         c=a*b;
         System.out.println("multiplication" +c);
         break;
default:
       System.out.println("flase");
       break;
    }
}
}