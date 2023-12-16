class Palindromenumber
{
public static void main(String[]args)
{
int num=2527,rem,sum=0,tem;
tem=num;
while(num!=0)
{
rem=num%10;
sum=(sum*10)+rem;
num=num/10;
}
if(tem==sum)
{
System.out.println("number is palindrome");
}
else 
{
System.out.println("number is not palindrome");
}
}
}