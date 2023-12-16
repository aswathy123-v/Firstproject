import java.util.*;
class Spalindrome
	{
		public static void main(String[]args)
			{
				Scanner myobj = new Scanner(System.in);
				System.out.println("enter a number");
				int anum = myobj.nextInt();
				int rem,sum=0,temp;
				temp=anum;
				while(anum!=0)
					{
						rem=anum%10;
						sum=(sum*10)+rem;
						anum=anum/10;
						}
							if(temp==sum)
							{
								System.out.println("number is palindrome");
							}
						
					
								else
								{
									System.out.println("number is not paindrome");
								}
			}
	}