import java.util.*;
class Sprimenum
{
		public static void main(String[]args)
			{
				Scanner myobj=new Scanner(System.in);
				System.out.println("enter a number");
				int num=myobj.nextInt();
				int count=0;
				for(int i=1;i<=num;i++)
				{
					if(num%i==0)
					{
						count++;
					}
				}
								
				if(count==2)
				{
					System.out.println("is a prime number");
				}
				else
				{
				          System.out.println("is not a prime number");
				}
			}
}