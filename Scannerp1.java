import java.util.*;
class Scannerp1
 {
   public static void main(String[]args)
    {
      Scanner myobj=new Scanner(System.in);
      System.out.println("enter a number");
      int num=myobj.nextInt();
 
switch(num)
      {
        case 1:
          System.out.println("number is one");
          break;
        case 2:
          System.out.println("number is two");
          break;
        case 3:
          System.out.println("number is three");
          break;
        case 4:
          System.out.println("number is four");
          break;
       default:
         System.out.println("no number");
         }
       
    }
}