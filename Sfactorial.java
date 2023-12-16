import java.util.*;
class Sfactorial
	{
		public static void main(String[]args)
			{
				Scanner myobj=new Scanner(System.in);
				System.out.println("enter a number");
					int num=myobj.nextInt();
					int fact=1;
					for(int i=1;i<=num;i++)
						{
							fact*=i;
						}
							System.out.println("fact is "+fact);
			}
	}