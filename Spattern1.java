import java.util.*;
class Spattern1
	{
		public static void main(String[]args)
			{
				Scanner myobj=new Scanner(System.in);
				System.out.println("enter a number");
				int num=myobj.nextInt();
					for(int i=num;i>=1;i--)
						{
							for(int j=1;j<=i;j++)
								{
									System.out.print("*");
								}
							System.out.println();
						}
			}
	}