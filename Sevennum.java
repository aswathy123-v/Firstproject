import java.util.*;
class Sevennum
{
     public static void main(String[]args)
	{
		Scanner myobj=new Scanner(System.in);
		System.out.println("enter a number");
		int anum=myobj.nextInt();
			if(anum%2==0)
				{
					System.out.println("number is even" +" " +anum);
				}
				else
					{
						System.out.println("number is odd");
					}
	}
}