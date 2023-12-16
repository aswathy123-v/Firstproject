import java.util.*;
class Spattern
	{
		public static void main(String[]args)
			{
				Scanner myobj=new Scanner(System.in);
				System.out.println("enter a number");
				int num=myobj.nextInt();
				    for(int i=1;i<=num;i++)
					{
						for(int j=1;j<=i;j++)
							{
								System.out.print("*");
							}
						System.out.println();
					}
			}
	}